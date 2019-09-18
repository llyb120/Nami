package com.github.llyb120.nami.server.aio;

import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.server.AbstractServer;
import com.github.llyb120.nami.server.Response;
import org.bson.ByteBuf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

import static com.github.llyb120.nami.server.AbstractServer.EOF;

public class AIOResponse extends Response {

    public WriteHandler writeHandler;
    public ReadHandler readHandler;
    public AsynchronousSocketChannel channel;

    BlockingQueue<Object> buffers = new LinkedBlockingQueue<>();
    boolean writing = false;

    public AIOResponse(AbstractServer server) {
        super(server);
        writeHandler = new WriteHandler(this);
        readHandler = new ReadHandler(this);
    }


    @Override
    protected void flush(Object object) {
        try{
            buffers.put(object);
            if(!writing){
                writing = true;
                channel.write(ByteBuffer.allocateDirect(0), null, writeHandler);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Response write(MultipartFile file) throws IOException {
        try(
                ReadableByteChannel fch = file.openChannel();
                ){
            ByteBuffer buf = ByteBuffer.allocateDirect(server.directDownloadLength());
            int n = fch.read(buf);
            if(n > 0){
                buf.flip();
                flush(buf);
            }
        }
        return this;
    }

}
