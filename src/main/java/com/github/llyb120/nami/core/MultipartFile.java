package com.github.llyb120.nami.core;

import cn.hutool.core.io.IoUtil;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.ExecutionException;

public class MultipartFile implements AutoCloseable{

    //friendly
    File file;
//    ByteBuf byteBuf;
    boolean isTemp = false;

//    private FileUpload fileUpload;

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
        if(file == null) return -1;
        return file.length();
    }

    public InputStream openInputStream() throws FileNotFoundException {
        if(null == file){
            return null;
        }
        return new FileInputStream(file);
    }

    public FileChannel openChannel() throws FileNotFoundException {
        if (file == null) {
            return null;
        }
        return new RandomAccessFile(file, "r").getChannel();
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
                var fis = new FileInputStream(this.file);
        ){
            var bs = IoUtil.readBytes(fis);
            channel.write(ByteBuffer.wrap(bs)).get();
        }
    }

    public void transferTo(WritableByteChannel channel) throws IOException {
        try(
            var fis = new FileInputStream(this.file).getChannel();
                ){
            fis.transferTo(0, this.file.length(), channel);
        }
    }

    public void transferTo(OutputStream os) throws IOException {
        try(
                var fis = new FileInputStream(this.file);
                ){
            fis.transferTo(os);
        }
    }

    public void transferTo(String path) throws IOException {
        transferTo(new File(path));
    }

    public void transferTo(File file) throws IOException {
        try(
                var fos = new FileOutputStream(file);
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
