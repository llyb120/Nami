package com.github.llyb120.nami.server;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

@Deprecated
public class ByteBuff {
    private int step;
    private LinkedList<byte[]> bytes = new LinkedList();
    private int writePtr = 0;
    private int readPtr = 0;

    private Map<InputStream, StreamBlock> blockMap = new HashMap();


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

    /**
     *
     * @param is
     * @param length
     * @param calSelf 是否计算本身缓冲区以内的长度
     * @return
     */
    public ByteBuff blockStream(InputStream is, int length, boolean calSelf){
        StreamBlock block = new StreamBlock();
        block.max = length - (calSelf ? length() : 0);
        blockMap.put(is, block);
        return this;
    }

    public ByteBuff write(byte b){
        byte[] bs = bytes.getLast();
        int left = step - writePtr;
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
        int len = length;
        int pos = 0;
        while(len > 0){
            int realLen = Math.min(len, readPtr);
            //空间不够
            if(realLen == 0){
                byte[] b = createSliceBytes();
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
        int lenCopy = len;
        int posCopy = pos;
        int left = -1;
        //空间不足
        while(lenCopy > 0){
            byte[] last = bytes.getLast();
            left = step - writePtr;
            //空间不足
            if(left <= 0){
                last = createSliceBytes();
                bytes.addLast(last);
                writePtr = 0;
                left = step;
            }
            //当前块的剩余空间不足以写入
            int writeLen = Math.min(left, lenCopy);
            System.arraycopy(bs, posCopy, last, writePtr, writeLen);
            writePtr += writeLen;
            posCopy += left;
            lenCopy -= writeLen;
        }
        return this;
    }

    public int writeOnce(InputStream is) throws IOException {
        //如果已经越界
        StreamBlock block = blockMap.get(is);
        int readLen = step;
        if (block != null) {
            if(block.current >= block.max){
                return 0;
            } else {
                readLen = Math.min(block.max - block.current, step);
            }
            byte[] bs = new byte[readLen];
            is.read(bs);
//            byte[] bs = IoUtil.readBytes(is, readLen);
            block.current += readLen;
            write(bs, 0, readLen);
            return readLen;
        } else {
            byte[] bs;
            int n = is.read(bs = createSliceBytes());
            write(bs, 0, n);
            return n;
        }
    }

    public ByteBuff writeFull(InputStream is) throws IOException {
        byte[] bs = createSliceBytes();
        int n = -1;
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
        int len = step * (pos[0]) - readPtr + pos[1] - 1;
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
        int pos = canReadLine();
        return readNBytes(pos);
    }

    public byte[] readLine(InputStream is){
        int pos = -1;
        try {
            do{
                pos = canReadLine();
                if(pos < 1){
                    int n = writeOnce(is);
                    if (n <= 0) {
                        break;
                    }
                } else {
                    break;
                }
            } while(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readNBytes(pos);
    }

    public String readLineStr(InputStream is, Charset charset){
        byte[] bs = readLine(is);
        if (bs == null) {
            return null;
        }
        if(bs.length >= 2){
            int end = bs.length;
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
        int ret = 0;
        Iterator<byte[]> it = bytes.iterator();
        int i = 0;
        scan:{
            while (it.hasNext()) {
                byte[] bs = it.next();
                int s = getStart(i);
                int e = getEnd(i);
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
        byte[] bs = createFullLengthBytes();
        if(bs.length == 0){
            return null;
        }
        int ptr = 0;
        for (int i = 0; i < bytes.size(); i++) {
            int start = getStart(i);
            int end = getEnd(i);
            System.arraycopy(bytes.get(i), start, bs, ptr, end - start);
            ptr += (end - start) ;
        }
        return bs;
    }

    public byte[] readBytes(){
        byte[] bs = getBytes();
        reset();
        return bs;
    }

    public ByteBuff copyUntil(InputStream is, OutputStream os, byte[] target) throws IOException {
        int i = 0;
        int ptr = 0;
        byte[] bs = null;
        scan : while((bs = readNBytes(is, 1024)) != null){
            for (int i1 = 0; i1 < bs.length; i1++) {
                if(bs[i1] == target[i]){
                    i++;
                } else {
                    i = 0;
                    ptr = i1 + 1;
                }
                //完全命中
                if(i == target.length){
                    os.write(bs, 0, ptr);
                    writeBefore(bs, ptr, bs.length - ptr);
                    return this;
                }
            }
            //如果命中了部分，则只copy这部分
            try{
                os.write(bs, 0, ptr);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            if(i > 0){
                writeBefore(bs, bs.length - i, i);
            }
        }
        return this;
    }

//    public byte[] readUntil(InputStream is, byte[] b) throws IOException {
//        var buf = new ByteBuff();
//        try{
//            var bs = readNBytes(is, 1024);
//            buf.writeObject(bs);
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
        int length = length();
        if(length <= 0){
            return null;
        }
        int nn = n;
        byte[] ret = new byte[Math.min(n, length)];
        Iterator<byte[]> it = bytes.iterator();
        int i = 0;
        int ptr = 0;
        while(it.hasNext()){
            byte[] bs = it.next();
            int start = getStart(i);
            int end = getEnd(i);
            int len = end - start;
            int left = Math.min(nn, len);
            readPtr = start + left;
//            if(nn <= len){
//                len = nn;
//                readPtr = start + nn;
//            }
            System.arraycopy(bs, start, ret, ptr, left);
            i++;
            ptr += left;
            nn -= left;
            if(nn <= 0){
                break;
            }
        }
        //清空掉已读过的buf
        while(--i > 0){
            bytes.removeFirst();
        }
        if(ret.length == 0){
            int eee = 2;
        }
        return ret;
    }

    public byte[] readNBytes(InputStream is, int n) throws IOException {
        while(length() < n){
            int nn = writeOnce(is);
            if(nn <= 0){
                break;
            }
        }
        return readNBytes(n);
    }

    public ByteBuff reset(){
        writePtr = 0;
        readPtr = 0;
        byte[] first = bytes.getFirst();
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

    public static class StreamBlock{
        public int max;
        public int current = 0;
    }


}


