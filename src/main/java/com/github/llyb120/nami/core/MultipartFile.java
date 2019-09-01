package com.github.llyb120.nami.core;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.ExecutionException;

public class MultipartFile implements AutoCloseable{

    //friendly
    File file;
//    ByteBuf byteBuf;
    boolean isTemp = false;
    String path;

//    private FileUpload fileUpload;

    public String fileName;
    public String contentType;

    public MultipartFile(String name) {
        this.fileName = name;
        this.contentType = Mime.getMime(name);
    }

    public MultipartFile(String name, String path) {
        this(name);
        this.path = path;
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

//    public MultipartFile(String name, ByteBuf buf) {
//        this(name);
//        this.byteBuf = buf;
//    }

//    public MultipartFile(FileUpload fileUpload) {
//        this.fileUpload = fileUpload;
//        this.fileName = fileUpload.getName();
//        this.contentType = fileUpload.getContentType();
//    }


    public long length(){
        if(path != null){
            return Long.MAX_VALUE;
        }
        if(file == null) return -1;
        return file.length();
    }

    public InputStream openInputStream() throws FileNotFoundException {
        if(null != file){
            return new FileInputStream(file);
        } else if(null != path){
            if(path.startsWith("classpath:")){
                String p = path.substring("classpath:".length());
                ClassPathResource resource = new ClassPathResource(p);
                return resource.getStream();
            } else {
                return new FileInputStream(path);
            }
        }
        return null;
    }

    public ReadableByteChannel openChannel() throws FileNotFoundException {
        if (file != null) {
            return new RandomAccessFile(file, "r").getChannel();
        } else if(null != path){
            return Channels.newChannel(openInputStream());
        }
        return null;
    }

//    public String fileName(){
//        return fileUpload.getFilename();
//    }
//
//    public String contentType(){
//        return fileUpload.getContentType();
//    }

    public void transferTo(AsynchronousSocketChannel channel) throws IOException, ExecutionException, InterruptedException {
        try(
                InputStream fis = openInputStream();
        ){
            byte[] bs = IoUtil.readBytes(fis);
            channel.write(ByteBuffer.wrap(bs)).get();
        }
    }

    public void transferTo(WritableByteChannel channel) throws IOException {
        try(
            ReadableByteChannel ch = openChannel();
                ){
            IoUtil.copy(ch, channel);
        }
    }

    public void transferTo(OutputStream os) throws IOException {
        try(
                InputStream fis = openInputStream();
                ){
            IoUtil.copy(fis, os);
        }
    }

    public void transferTo(String path) throws IOException {
        transferTo(new File(path));
    }

    public void transferTo(File file) throws IOException {
        try(
                FileOutputStream fos = new FileOutputStream(file);
                ){
            transferTo(fos);
        }
    }


    @Override
    public void close() throws Exception {
        if (isTemp && null != file) {
            file.delete();
        }
    }
}
