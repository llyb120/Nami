package com.github.llyb120.nami.test;

import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.ext.file.SimpleStorage;
import com.github.llyb120.nami.ext.file.Storage;
import com.github.llyb120.nami.json.Json;
import com.github.llyb120.nami.server.Cookie;

import java.io.File;
import java.io.IOException;

import static com.github.llyb120.nami.server.Vars.$get;
import static com.github.llyb120.nami.server.Vars.$request;

public class a {

    public String getWithNoArg(){
        return "ok";
    }

    public String getWithArgs(String a){
        return a;
    }

    public Object getQuery(Json query){
        return query;
    }

    public Object postUrlEncoded(Json body){
        return body;
    }

    public Object postUrlEncoded2(String a){
        return a;
    }

    public static class A{
        public String a;
        public String b;
    }

    public Object getWithEntity(A a){
        return a;
    }

    public Object postJsonObject(Json body){
        return body;
    }

    public Object postJsonArray(Json body){
        return body;
    }

    public Object uploadFile(Json body, String test, MultipartFile file) throws IOException {
        File temp = File.createTempFile("dev", "dev");
//        var temp = new File("d:/testupload.txt");
        temp.deleteOnExit();
        file.transferTo(temp);
        return test + "|" + temp.getAbsolutePath();
    }

    public File downloadFile1(String path){
        return new File(path);
    }

    public MultipartFile downloadFile2(String path){
        return new MultipartFile(new File(path));
    }


    public Object testCookie(Cookie cookie){
        return cookie.get("_ga");
    }


    public Object phpStyleGet(){
        return $get.s("dev");
    }

    public Object phpStyleRequest(){
        return $request;
    }


    public Object downloadStorageFile(String path) throws IOException {
        return Storage.getStorage("test1").download(path);
    }
}
