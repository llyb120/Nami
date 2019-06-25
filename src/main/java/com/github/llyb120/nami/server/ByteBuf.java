package com.github.llyb120.nami.server;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public class ByteBuf {
    private int step;
    private LinkedList<byte[]> bytes = new LinkedList();
    private int writePtr = 0;
    private int readPtr = 0;


    public ByteBuf(){
        this(1024);
    }

    public ByteBuf(int step){
        this.step = step;
        this.bytes.addLast(createBytes());
    }

    public ByteBuf write(byte b){
        var bs = getBs();
        bs[writePtr++] = b;
        return this;
    }

    public ByteBuf write(byte[] bs){
        return write(bs, 0, bs.length);
    }

    public ByteBuf write(String str){
        return write(str.getBytes());
    }

    public ByteBuf write(String str, String encoding){
        try {
            return write(str.getBytes(encoding));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ByteBuf write(byte[] bs, int pos, int len){
        var lenCopy = len;
        var posCopy = pos;
        var left = -1;
        //空间不足
        while(lenCopy > 0){
            var last = getBs();
            left = step - writePtr;
            if(left < lenCopy){
                System.arraycopy(bs, posCopy, last, writePtr, left);
                writePtr += left;
                lenCopy -= left;
//                last = getBs();
//                System.arraycopy(bs, pos + len - left, last, writePtr, len - left);
            } else {
                System.arraycopy(bs, posCopy, last, writePtr, lenCopy);
                writePtr += lenCopy;
                lenCopy = 0;
            }
            posCopy += left;
            //不论如何，lencopy都会少掉一个step
//            lenCopy -= step;
        }
        return this;
    }

    public ByteBuf writeOnce(InputStream is) throws IOException {
        var bs = createBytes();
        var n = is.read(bs);
        if(n <= 0){
            throw new EOFException();
        }
        write(bs, 0, n);
        return this;
    }

    public ByteBuf writeFull(InputStream is) throws IOException {
        var bs = createBytes();
        var n = -1;
        while((n = is.read(bs)) > 0){
            write(bs, 0, n);
        }
        return this;
    }

    public byte[] readLine(int[] pos){
        if(pos[0] == -1 || pos[1] == -1){
            return new byte[0];
        }
        var ret = new byte[length()];
        var it = bytes.iterator();
        var i = -1;
        var ptr = 0;
        while (it.hasNext()) {
            i++;
            if(i > pos[0]){
                break;
            }
            var bs = it.next();
            var start = (i == 0 ? readPtr : 0);
            var end = (i == bytes.size() - 1 ? writePtr : step);
            var len = end - start;
            System.arraycopy(bs, start, ret, ptr, len);
            ptr += len;
        }
        return ret;
    }

    public byte[] readLine() {
        var pos = canReadLine();
        return readLine(pos);
    }

    private int[] canReadLine(){
        var ret = new int[]{-1,-1};
        var it = bytes.iterator();
        var i = -1;
        scan:{
            while (it.hasNext()) {
                i++;
                var bs = it.next();
                for (int i1 = (i == 0 ? readPtr : 0); i1 < (i == bytes.size() - 1 ? writePtr : bs.length); i1++) {
                    if(bs[i1] == '\n'){
                        ret[0] = i;
                        ret[1] = i1;
                        break scan;
                    }
                }
            }
        }
        return ret;
    }

    public byte[] getBytes(){
        var bs = new byte[length()];
        var ptr = 0;
        for (int i = 0; i < bytes.size(); i++) {
            var start = getStart(i);
            var end = getEnd(i);
            System.arraycopy(bytes.get(i), start, bs, ptr, end - start);
            ptr += (end - start) ;
        }
        return bs;
    }

    public byte[] readBytes(){
        var bs = getBytes();
        reset();
        return bs;
    }

    public ByteBuf reset(){
        writePtr = 0;
        readPtr = 0;
        var first = bytes.getFirst();
        bytes.clear();
        bytes.addFirst(first);
        return this;
    }

    private byte[] createBytes(){
        return new byte[step];
    }

    private byte[] getBs(){
        byte[] bs;
        if(writePtr >= step){
            bs = createBytes();
            bytes.addLast(bs);
            writePtr = 0;
        } else {
            bs = bytes.getLast();
        }
        return bs;
    }

    public int length(){
        if(bytes.size() > 1){
            return (step - readPtr) + writePtr + (bytes.size() - 2 > 0 ? bytes.size() - 2 : 0) * step;
        } else {
            return writePtr - readPtr;
        }
    }

    private int getStart(int i){
        return (i == 0 ? readPtr : 0);
    }

    private int getEnd(int i){
        return  (i == bytes.size() - 1 ? writePtr : step);
    }


    @Override
    public String toString() {
        return new String(getBytes());
    }
}

