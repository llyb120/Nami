package com.github.llyb120.nami.func;

import cn.hutool.crypto.SecureUtil;
import com.esotericsoftware.reflectasm.MethodAccess;
import com.github.llyb120.nami.compiler.Compiler;
import com.github.llyb120.nami.hotswap.AppClassLoader;
import com.github.llyb120.nami.json.Json;

import java.io.File;


public abstract class Function {

    private static ClassLoader _loader = new AppClassLoader();

    public static Object func(ReturnableFunction function) {
        try{
            return function.call();
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void func(NoReturnFunction function){
        try{
            function.call();
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }


    public static <T> T eval(String str) throws Exception {
        ReturnableFunction func = compile(str);
        return (T) func.call();
    };

    public static ReturnableFunction compile(String str){
        String key = SecureUtil.md5(str);
        String className = "NamiFunc" + key;
//        File file = new File(sourceDir, className + ".java");
        StringBuilder sb = new StringBuilder();
        sb.append("public class ");
        sb.append(className);
        sb.append("{ public Object call(){");
        sb.append("try{ ");
        sb.append(str);
        sb.append(";");
        sb.append("}catch(Exception e){ throw e; } ");
        //func end
        sb.append("}");
        //class end
        sb.append("}");
//        Compiler
        Compiler.compile(className, sb.toString());
//        FileUtil.writeString(sb.toString(), file, "UTF-8");

        return () -> {
//            return Async.submit(() -> {
            Class<?> clz = _loader.loadClass(className);
            Object ins = Json.newInstance(clz);
            MethodAccess ma = MethodAccess.get(clz);
            return ma.invoke(ins, "call");
//            }).get();
        };
    }



}
