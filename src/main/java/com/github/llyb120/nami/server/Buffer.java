package com.github.llyb120.nami.server;

import io.netty.buffer.ByteBuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Buffer {
    private int step;
    private ByteBuffer buffer;

    public Buffer(){
        this(1024);
    }

    public Buffer(int step){
        if(step <= 1){
            throw new RuntimeException();
        }
        this.step = step;
        buffer = ByteBuffer.allocateDirect(step);
//        this.bytes.addLast(createSliceBytes());
    }

    public ByteBuffer getNioBuffer(){
        return this.buffer;
    }

    public void writeToChannel(WritableByteChannel channel) throws IOException {
        buffer.flip();
        channel.write(buffer);
        buffer.flip();
    }

    public Buffer resize(){
        var swap = buffer;
        buffer = ByteBuffer.allocateDirect(buffer.capacity() * 2);
        write(swap);
        return this;
    }

    private void checkAvaliable(int n){
        while(buffer.remaining() < n){
            resize();
        }
    }


    public Buffer write(byte b){
        checkAvaliable(1);
        return this;
    }

    public Buffer write(byte[] bs){
        return write(bs, 0, bs.length);
    }

    public Buffer write(String str){
        return write(str.getBytes());
    }

    public Buffer write(String str, Charset encoding){
        return write(str.getBytes(encoding));
    }

    public Buffer write(ByteBuffer buf){
        checkAvaliable(buf.position());
        buf.flip();
        buffer.put(buf);
//        buffer.position(buffer.position() + pos);
//        buffer = nbuff;
//        buf.flip();
//        checkAvaliable(buf.remaining());
//        buffer.put(buf);
        return this;
    }

    public Buffer writeBefore(byte[] bs, int offset, int length){
        checkAvaliable(length);
        var swap = buffer;
        buffer = ByteBuffer.allocateDirect(buffer.capacity());
        buffer.put(bs, offset, length);
        swap.flip();
        buffer.put(swap);
        return this;
    }

    public Buffer writeBefore(byte[] bs){
        return writeBefore(bs, 0, bs.length);
    }

    public Buffer write(byte[] bs, int pos, int len){
        checkAvaliable(len);
        buffer.put(bs, pos, len);
        return this;
    }

    public int writeOnce(ReadableByteChannel channel, int length){
        if(length <= 0){
            return 0;
        }
        var buf = ByteBuffer.allocateDirect(length);
        int n = 0;
        try {
            n = channel.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(n < 1){
            return n;
        }
        checkAvaliable(n);
        write(buf);
        return n;
    }

    public int writeOnce(ReadableByteChannel channel){
        return writeOnce(channel, step);
//        var buf = createSliceBytes();
//        int n = 0;
//        try {
//            n = channel.read(buf);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return 0;
//        }
//        if(n < 1){
//            return n;
//        }
//        checkAvaliable(n);
//        write(buf);
//        return n;
        //如果已经越界
//        var block = blockMap.get(is);
//        var readLen = step;
//        if (block != null) {
//            if(block.current >= block.max){
//                return 0;
//            } else {
//                readLen = Math.min(block.max - block.current, step);
//            }
//            var bs = is.readNBytes(readLen);
//            block.current += readLen;
//            write(bs, 0, readLen);
//            return readLen;
//        } else {
//            byte[] bs;
//            var n = is.read(bs = createSliceBytes());
//            write(bs, 0, n);
//            return n;
//        }
    }

    public Buffer writeFull(ReadableByteChannel channel) throws IOException {
        var buf = createSliceBytes();
        do{
            buf.clear();
            var n = channel.read(buf);
            if(n < 1){
                break;
            }
            write(buf);
        } while(true);
        return this;
    }

    public byte[] readLine() {
        var pos = canReadLine();
        return readNBytes(pos + 1);
    }

    public String readLineStr(){
        var pos = canReadLine();
        var end = pos + 1;
        var bs = readNBytes(end);
        if (bs == null) {
            return null;
        }
        if(bs[end - 1] == '\n'){
            end--;
        }
        if(bs[end - 1] == '\r'){
            end--;
        }
        return new String(bs, 0, end, StandardCharsets.UTF_8);
    }


    private int canReadLine(){
        for (int i = 0; i < buffer.position(); i++) {
            if(buffer.get(i) == '\n'){
                return i;
            }
        }
        return -1;
    }

    public byte[] getBytes(){
        var bs = createFullLengthBytes();
        if(bs.length == 0){
            return null;
        }
        for (int i = 0; i < length(); i++) {
            bs[i] = buffer.get(i);
        }
        return bs;
    }

    public byte[] readBytes(){
        var bs = createFullLengthBytes();
        buffer.flip();
        buffer.get(bs);
        buffer.compact();
        buffer.flip();
        return bs;
    }

    public Buffer copyUntil(ReadableByteChannel is, WritableByteChannel channel, byte[] target) throws IOException {
//        var i = 0;
//        var ptr = 0;
//        byte[] bs = null;
//        scan : while((bs = readNBytes(is, 1024)) != null){
//            for (int i1 = 0; i1 < bs.length; i1++) {
//                if(bs[i1] == target[i]){
//                    i++;
//                } else {
//                    i = 0;
//                    ptr = i1 + 1;
//                }
//                //完全命中
//                if(i == target.length){
//                    os.write(bs, 0, ptr);
//                    writeBefore(bs, ptr, bs.length - ptr);
//                    return this;
//                }
//            }
//            //如果命中了部分，则只copy这部分
//            try{
//                os.write(bs, 0, ptr);
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//            if(i > 0){
//                writeBefore(bs, bs.length - i, i);
//            }
//        }
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
        var length = length();
        if(length < 1){
            return null;
        }
        var pos = buffer.position();
//        if(nn < 1){
//            return null;
//        }
        buffer.flip();
        var nn = Math.min(buffer.remaining(), n);
        var bs = new byte[nn];
        buffer.get(bs);
        buffer.compact();
        buffer.flip();
        buffer.position(pos - nn);
        buffer.limit(buffer.capacity());
        return bs;
    }

//    public byte[] readNBytes(ReadableByteChannel is, int n) throws IOException {
//        while(length() < n){
//            var nn = writeOnce(is);
//            if(nn <= 0){
//                break;
//            }
//        }
//        return readNBytes(n);
//    }

    public Buffer reset(){
        buffer.clear();
        return this;
    }

    private ByteBuffer createSliceBytes(){
        return ByteBuffer.allocateDirect(step);
    }

    private byte[] createFullLengthBytes(){
        return new byte[length()];
    }

    /**
     * 得到一个可写的块
     * @return
     */
//    private byte[] getWritableSlice(){
//        byte[] bs;
//        if(writePtr >= step){
//            bs = createSliceBytes();
//            bytes.addLast(bs);
//            writePtr = 0;
//        } else {
//            bs = bytes.getLast();
//        }
//        return bs;
//    }

    /**
     * 写模式下的position
     * 读完会compact
     * @return
     */
    public int length(){
        return buffer.position();
    }


//    private int getStart(byte[] bs){
//        return bs == bytes.getFirst() ? readPtr : 0;
//    }
//
//    private int getEnd(byte[] bs){
//        return bs == bytes.getLast() ? writePtr : step;
//    }

    @Override
    public String toString() {
        return new String(getBytes());
    }

}


