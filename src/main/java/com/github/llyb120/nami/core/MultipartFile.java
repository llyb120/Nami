package com.github.llyb120.nami.core;

import com.github.llyb120.nami.util.ClassPathResource;
import com.github.llyb120.nami.util.Util;

import java.io.*;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

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
            return new BufferedInputStream(new FileInputStream(file));
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

    public void transferTo(OutputStream os) throws IOException {
        try(
            InputStream is = openInputStream();
            ){
            Util.copy(is, os);
        }
    }

    public void transferTo(WritableByteChannel channel) throws IOException {
        try(
            ReadableByteChannel ch = openChannel();
                ){
            Util.copy(ch, channel);
        }
    }


    public void transferTo(String path) throws IOException {
        transferTo(new File(path));
    }

    public void transferTo(File file) throws IOException {
        try(
                FileChannel ch = new RandomAccessFile(file, "rw").getChannel();
                ReadableByteChannel rch = openChannel();
                ){
            ch.transferFrom(rch, 0, Long.MAX_VALUE);
        }
    }


    @Override
    public void close() throws Exception {
        if (isTemp && null != file) {
            file.delete();
        }
    }
}
