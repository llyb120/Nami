package com.github.llyb120.nami.core;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.multipart.FileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class MultipartFile {

    //friendly
    File file;
    ByteBuf byteBuf;
    boolean isTemp = false;

    private FileUpload fileUpload;

    public String fileName;
    public String contentType;

    public MultipartFile(String name) {
        this.fileName = name;
        this.contentType = Mime.getMime(name);
    }

    public MultipartFile(String name, String contentType) {
        this.fileName = name;
        this.contentType = contentType;
    }

    public MultipartFile(File file) {
        this(file.getName());
        this.file = file;
    }

    public MultipartFile(String name, File file) {
        this(name);
        this.file = file;
    }

    public MultipartFile(String name, File file, boolean isTemp) {
        this(name);
        this.file = file;
        this.isTemp = isTemp;
    }

    public MultipartFile(String name, ByteBuf buf) {
        this(name);
        this.byteBuf = buf;
    }

    public MultipartFile(FileUpload fileUpload) {
        this.fileUpload = fileUpload;
        this.fileName = fileUpload.getName();
        this.contentType = fileUpload.getContentType();
    }

//    public String fileName(){
//        return fileUpload.getFilename();
//    }
//
//    public String contentType(){
//        return fileUpload.getContentType();
//    }

    public void transferTo(File file) throws IOException {
        try (
            FileChannel channel = new FileOutputStream(file).getChannel();
        ) {
            ByteBuf buf = fileUpload.content();
            fileUpload.content().readBytes(channel, 0, buf.readableBytes());
        } catch (IOException e) {
            throw e;
        }
    }

    void release() {
        if (byteBuf != null) {
            byteBuf.release();
        }
        if (isTemp && null != file) {
            file.delete();
        }


    }
}
