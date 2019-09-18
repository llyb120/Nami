package com.github.llyb120.nami.server.bio;

import cn.hutool.core.io.IoUtil;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.server.AbstractServer;
import com.github.llyb120.nami.server.Response;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.ExecutionException;

public class BIOResponse extends Response {
    public WritableByteChannel channel;

    public BIOResponse(AbstractServer server) {
        super(server);
    }

    @Override
    protected void flush(Object object) {
        if(object == EOF){
            close();
            return;
        }
        try {
            channel.write((ByteBuffer) object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Response write(MultipartFile file) throws IOException {
        try(
                ReadableByteChannel channel = file.openChannel();
                ){
            IoUtil.copy(channel, this.channel, server.directDownloadLength());
        }
        return this;
    }

}
