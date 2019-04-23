package com.beeasy.web.core;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.multipart.FileUpload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class MultipartFile {

    private FileUpload fileUpload;

    public MultipartFile(FileUpload fileUpload) {
        this.fileUpload = fileUpload;
    }

    public String fileName(){
        return fileUpload.getFilename();
    }

    public String contentType(){
        return fileUpload.getContentType();
    }

    public void transferTo(File file) throws IOException {
        try(
            FileChannel channel = new FileOutputStream(file).getChannel();
            ){
            ByteBuf buf = fileUpload.content();
            fileUpload.content().readBytes(channel, 0, buf.readableBytes());
        } catch (IOException e) {
            throw e;
        }
    }
}
