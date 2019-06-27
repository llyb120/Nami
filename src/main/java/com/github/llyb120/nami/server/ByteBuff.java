package com.github.llyb120.nami.server;

import cn.hutool.core.util.ArrayUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ByteBuff {
    private int step;
    private LinkedList<byte[]> bytes = new LinkedList();
    private int writePtr = 0;
    private int readPtr = 0;


    public ByteBuff(){
        this(1024);
    }

    public ByteBuff(int step){
        if(step <= 1){
            throw new RuntimeException();
        }
        this.step = step;
        this.bytes.addLast(createSliceBytes());
    }

    public ByteBuff write(byte b){
        var bs = bytes.getLast();
        var left = step - writePtr;
        if(left <= 0){
            bs = createSliceBytes();
            bytes.addLast(bs);
            writePtr = 0;
        }
        bs[writePtr++] = b;
        return this;
    }

    public ByteBuff write(byte[] bs){
        return write(bs, 0, bs.length);
    }

    public ByteBuff write(String str){
        return write(str.getBytes());
    }

    public ByteBuff write(String str, Charset encoding){
        return write(str.getBytes(encoding));
    }

    public ByteBuff writeBefore(byte[] bs, int offset, int length){
        var len = length;
        var pos = 0;
        while(len > 0){
            var realLen = Math.min(len, readPtr);
            //空间不够
            if(realLen == 0){
                var b = createSliceBytes();
                bytes.addFirst(b);
                readPtr = step;
                realLen = Math.min(len, readPtr);
            }
            System.arraycopy(bs, offset + length - pos - realLen, bytes.getFirst(), readPtr - realLen, realLen);
            len -= realLen;
            readPtr -= realLen;
            pos += realLen;
        }
        return this;
    }

    public ByteBuff writeBefore(byte[] bs){
        return writeBefore(bs, 0, bs.length);
    }

    public ByteBuff write(byte[] bs, int pos, int len){
        var lenCopy = len;
        var posCopy = pos;
        var left = -1;
        //空间不足
        while(lenCopy > 0){
            var last = bytes.getLast();
            left = step - writePtr;
            //空间不足
            if(left <= 0){
                last = createSliceBytes();
                bytes.addLast(last);
                writePtr = 0;
                left = step;
            }
            //当前块的剩余空间不足以写入
            var writeLen = Math.min(left, lenCopy);
            System.arraycopy(bs, posCopy, last, writePtr, writeLen);
            writePtr += writeLen;
            posCopy += left;
            lenCopy -= writeLen;
        }
        return this;
    }

    public ByteBuff writeOnce(InputStream is) throws IOException, EOFException {
        var bs = createSliceBytes();
        var n = is.read(bs);
        if(n <= 0){
            throw new EOFException();
        }
        write(bs, 0, n);
        return this;
    }

    public ByteBuff writeFull(InputStream is) throws IOException {
        var bs = createSliceBytes();
        var n = -1;
        while((n = is.read(bs)) > 0){
            write(bs, 0, n);
        }
        return this;
    }

    public byte[] readLine(int[] pos){
        if(null == pos){
            return null;
        }
        if(pos[0] == -1 || pos[1] == -1){
            return null;
        }
        var len = step * (pos[0]) - readPtr + pos[1] - 1;
        return readNBytes(len);
//        var ret = new byte[len];
//        var it = bytes.iterator();
//        var i = -1;
//        var ptr = 0;
//        while (it.hasNext()) {
//            i++;
//            if(i > pos[0]){
//                break;
//            }
//            var bs = it.next();
//            var start = getStart(i);
//            var end = (i == pos[0] ? pos[1] : step);
//            len = end - start;
//            System.arraycopy(bs, start, ret, ptr, bs[end - 1] == '\r' ? len - 1 : len);
//            ptr += len;
//            if(i != pos[0]){
//                it.remove();
//            } else {
//                //有一种特殊情况，即在当前节点且全部读完
//                if(pos[1] + 1 >= step){
//                    it.remove();
//                    bytes.addLast(createSliceBytes());
//                    readPtr = 0;
//                } else {
//                    readPtr = pos[1] + 1;
//                }
//            }
//        }
//        return ret;
    }

    public byte[] readLine() {
        var pos = canReadLine();
        return readNBytes(pos);
    }

    public byte[] readLine(InputStream is){
        int pos = -1;
        try {
            do{
                pos = canReadLine();
                if(pos < 1){
                    writeOnce(is);
                } else {
                    break;
                }
            } while(true);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            e.printStackTrace();
        }
        return readNBytes(pos);
    }

    public String readLineStr(InputStream is, Charset charset){
        var bs = readLine(is);
        if (bs == null) {
            return null;
        }
        if(bs.length >= 2){
            var end = bs.length;
            if(bs[end - 1] == '\n'){
                end--;
            }
            if(bs[end - 1] == '\r'){
                end--;
            }
            return new String(bs, 0, end, charset);
        } else {
            return new String(bs, charset);
        }
    }

    private int canReadLine(){
        var ret = 0;
        var it = bytes.iterator();
        var i = 0;
        scan:{
            while (it.hasNext()) {
                var bs = it.next();
                var s = getStart(i);
                var e = getEnd(i);
                for (int i1 = s; i1 < e; i1++) {
                    ret++;
                    if(bs[i1] == '\n'){
                        break scan;
                    }
                }
                i++;
            }
        }
        return ret;
    }

    public byte[] getBytes(){
        var bs = createFullLengthBytes();
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

    public ByteBuff copyUntil(InputStream is, OutputStream os, byte[] target) throws IOException {
        byte[] left = null;
        var running = true;
        var i = 0;
        var ptr = 0;
        while(running){
            var bs = readNBytes(1024);
            for (byte b : bs) {
                if(b == target[i]){
                    if(i == 0){
                        ptr = i;
                    }
                    i++;
                } else {
                    i = 0;
                    if(null != left){

                    }
                }
            }
            //如果命中了部分，则只copy这部分
            os.write(bs, 0, bs.length - i);
            if(ptr > 0){
//                left =
            }
        }
        return this;
//        if(i > 0){
//        } else {
//            os.write();
//        }
    }

//    public byte[] readUntil(InputStream is, byte[] b) throws IOException {
//        var buf = new ByteBuff();
//        try{
//            var bs = readNBytes(is, 1024);
//            buf.write(bs);
//
//        } catch (EOFException e){
//            //读取完毕
//        } catch (IOException e){
//            throw e;
//        }
//        return buf.getBytes();
//    }

    public byte[] readNBytes(int n){
        if(n < 1){
            return null;
        }
        var nn = n;
        var ret = new byte[n];
        var it = bytes.iterator();
        var i = 0;
        var ptr = 0;
        while(it.hasNext()){
            var bs = it.next();
            var start = getStart(i);
            var end = getEnd(i);
            var len = end - start;
            if(nn <= len){
                len = nn;
                readPtr = start + nn;
            }
            System.arraycopy(bs, start, ret, ptr, len);
            i++;
            ptr += len;
            nn -= len;
            if(nn <= 0){
                break;
            }
        }
        //清空掉已读过的buf
        while(--i > 0){
            bytes.removeFirst();
        }
        return ret;
    }

    public byte[] readNBytes(InputStream is, int n) throws IOException, EOFException {
        while(length() < n){
            writeOnce(is);
        }
        return readNBytes(n);
    }

    public ByteBuff reset(){
        writePtr = 0;
        readPtr = 0;
        var first = bytes.getFirst();
        bytes.clear();
        bytes.addFirst(first);
        return this;
    }

    private byte[] createSliceBytes(){
        return new byte[step];
    }

    private byte[] createFullLengthBytes(){
        return new byte[length()];
    }

    /**
     * 得到一个可写的块
     * @return
     */
    private byte[] getWritableSlice(){
        byte[] bs;
        if(writePtr >= step){
            bs = createSliceBytes();
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

//    private int getStart(byte[] bs){
//        return bs == bytes.getFirst() ? readPtr : 0;
//    }
//
//    private int getEnd(byte[] bs){
//        return bs == bytes.getLast() ? writePtr : step;
//    }

    private int getEnd(int i){
        return  (i == bytes.size() - 1 ? writePtr : step);
    }


    @Override
    public String toString() {
        return new String(getBytes());
    }

    public static class EOFException extends Exception{
    }
}

