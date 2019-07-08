package com.github.llyb120.nami.test;

import com.github.llyb120.nami.core.Arr;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.core.Obj;

import java.io.File;
import java.io.IOException;

public class a {

    public String getWithNoArg(){
        return "ok";
    }

    public String getWithArgs(String a){
        return a;
    }

    public Object getQuery(Obj query){
        return query;
    }

    public Object postUrlEncoded(Obj body){
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

    public Object postJsonObject(Obj body){
        return body;
    }

    public Object postJsonArray(Arr body){
        return body;
    }

    public Object uploadFile(Obj body, String test, MultipartFile file) throws IOException {
        var temp = File.createTempFile("test", "test");
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


}
