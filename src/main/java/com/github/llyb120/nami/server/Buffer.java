package com.github.llyb120.nami.server;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedList;

public class Buffer {
    private int step;
    private ByteBuffer buffer;

    private LinkedList<ByteBuffer> buffers = new LinkedList<>();


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

    public LinkedList<ByteBuffer> getNioBuffers(){
        return buffers;
    }

//    public void writeToChannel(WritableByteChannel channel) throws IOException {
//        for (ByteBuffer buffer : buffers) {
//            channel.write(buffer);
//        }
//        buffers.reset();
//    }

//    public void writeToAsyncChannel(AsynchronousSocketChannel channel, boolean close) throws ExecutionException, InterruptedException {
//        if(buffers.length() == 0){
//            return;
//        }
//        var items = buffers.toArray(ByteBuffer[]::new);
//        buffers.reset();
//        var len = items.length;
//        var count = new AtomicInteger(0);
//        channel.write(items[0], items, new CompletionHandler<Integer, ByteBuffer[]>() {
//            @Override
//            public void completed(Integer result, ByteBuffer[] attachment) {
//                if(count.g() < len){
//                    channel.write(items[count.g()], items, this);
//                    count.incrementAndGet();
//                } else if(close){
//                    try {
//                        channel.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//
//            @Override
//            public void failed(Throwable exc, ByteBuffer[] attachment) {
//
//            }
//        });
////        for (ByteBuffer buffer : buffers) {
////            channel.write(buffer);
////        }
////        channel.write(buffers.toArray(ByteBuffer[]::new), 0, length(), Long.MAX_VALUE, TimeUnit.SECONDS, this, new CompletionHandler<Long, Object>() {
////            @Override
////            public void completed(Long result, Object attachment) {
////                var a = 1;
////            }
////
////            @Override
////            public void failed(Throwable exc, Object attachment) {
////
////            }
////        });
//////        for (ByteBuffer buffer : buffers) {
//////            channel.write(buffer);
//////        }
////        buffers.reset();
//    }

//    public Buffer resize(){
//        var swap = buffer;
//        buffer = ByteBuffer.allocateDirect(buffer.capacity() * 2);
//        buffer.flip();
//        write(swap);
//        return this;
//    }
//
//    private void checkAvaliable(int n){
//        while(buffer.remaining() < n){
//            resize();
//        }
//    }


    public Buffer write(byte b){
        ByteBuffer buf = ByteBuffer.allocateDirect(1);
        buf.put(b);
        buf.flip();
        buffers.addLast(buf);
        return this;
    }


    public Buffer writeNio(byte b){
        return write(b);
    }

    public Buffer writeNio(byte[] bs){
        return writeNio(bs, 0, bs.length);
    }

    public Buffer writeNio(byte[] bs, int offset, int length){
        ByteBuffer buf = ByteBuffer.wrap(bs, offset, length);
        buffers.addLast(buf);
        return this;
    }

    public Buffer writeNio(String str, Charset encoding){
        return writeNio(str.getBytes(encoding));
    }

    public Buffer writeNio(String str){
        return writeNio(str, StandardCharsets.UTF_8);
    }

    public Buffer writeNio(ByteBuffer buf){
        buffers.addLast(buf);
        return this;
    }

    public Buffer writeBeforeNio(byte[] bs, int offset, int length){
        ByteBuffer buf = ByteBuffer.allocateDirect(length);
        buffers.addFirst(buf);
        return this;
    }

    public Buffer writeBeforeNio(byte[] bs){
        return writeBeforeNio(bs, 0, bs.length);
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
        ByteBuffer nbuf = ByteBuffer.allocateDirect(buf.capacity());
        nbuf.put(buf);
        nbuf.flip();
        buffers.addLast(nbuf);
        return this;
    }

    public Buffer writeBefore(byte[] bs, int offset, int length){
        ByteBuffer buf = ByteBuffer.allocateDirect(length);
        buf.put(bs, offset, length);
        buf.flip();
        buffers.addFirst(buf);
        return this;
    }

    public Buffer writeBefore(byte[] bs){
        return writeBefore(bs, 0, bs.length);
    }

    public Buffer write(byte[] bs, int pos, int len){
        ByteBuffer buf = ByteBuffer.allocateDirect(len);
        buf.put(bs, pos, len);
        buf.flip();
        buffers.addLast(buf);
        return this;
    }


    public byte[] readLine() {
        int pos = canReadLine();
        return readNBytes(pos);
    }

    public String readLineStr(){
        int end = canReadLine();
        byte[] bs = readNBytes(end);
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
        int count = 0;
        for (int i = 0; i < buffers.size(); i++) {
            ByteBuffer buf = buffers.get(i);
            for (int j = buf.position(); j < buf.limit(); j++) {
                count++;
                if(buf.get(j) == '\n'){
                    return count;
                }
            }
        }
        return -1;
    }

    public byte[] getBytes(){
        byte[] bs = createFullLengthBytes();
        if(bs.length == 0){
            return null;
        }
        int i = 0;
        for (ByteBuffer buffer : buffers) {
            for(int j = buffer.position(); j < buffer.limit(); j++){
                bs[i++] = buffer.get(j);
            }
        }
        return bs;
    }

    public byte[] readBytes(){
        return readNBytes(length());
    }


    public int indexOf(byte[] key){
        int n = 0;
        int ptr = 0;
        for (ByteBuffer byteBuffer : buffers) {
            for (int i = byteBuffer.position(); i < byteBuffer.limit(); i++) {
                ptr++;
                byte c = byteBuffer.get(i);
                if(c != key[n]){
                    n = 0;
                }
                if(c == key[n]){
                    n++;
                }

                if(n == key.length){
                    return ptr - n;
                }
            }
        }
        return -1;
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
        int length = length();
        if(length < 1){
            return null;
        }
        if(n > length){
            n = length;
        }
        byte[] ret = new byte[n];
        int nn = n;
        int ptr = 0;
        Iterator<ByteBuffer> it = buffers.iterator();
        while(it.hasNext()){
            ByteBuffer item = it.next();
                int len = Math.min(item.limit() - item.position(), nn);
                item.get(ret, ptr, len);

//                item.buffer.compact();
                ptr += len;
                nn -= len;
            if(item.position() == item.limit()){
                it.remove();
            }
            if(nn <= 0){
                break;
            }
        }

        return ret;
//
//
//        var pos = buffer.position();
////        if(nn < 1){
////            return null;
////        }
//        buffer.flip();
//        var nn = Math.min(buffer.remaining(), n);
//        var bs = new byte[nn];
//        buffer.g(bs);
//        buffer.compact();
//        buffer.flip();
//        buffer.position(pos - nn);
//        buffer.limit(buffer.capacity());
//        return bs;
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
        int len = 0;
        for (ByteBuffer item : buffers) {
            len += (item.limit() - item.position());
        }
        return len;
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
        byte[] bs = getBytes();
        if (bs == null) {
            return "";
        }
        return new String(bs);
    }

}


