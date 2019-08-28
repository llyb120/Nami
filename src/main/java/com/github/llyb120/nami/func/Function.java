package com.github.llyb120.nami.func;

import cn.hutool.core.io.FileUtil;
import cn.hutool.crypto.SecureUtil;
import com.esotericsoftware.reflectasm.MethodAccess;
import com.github.llyb120.nami.json.Json;

import java.io.File;

import static com.github.llyb120.nami.hotswap.AbstractLoader.sourceDir;

public abstract class Function {

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


    public static Object eval(String str) throws Exception {
        ReturnableFunction func = compile(str);
        return func.call();
    };

    public static ReturnableFunction compile(String str){
        String key = SecureUtil.md5(str);
        String className = "NamiFunc" + key;
        File file = new File(sourceDir, className + ".java");
        StringBuilder sb = new StringBuilder();
        sb.append("public class ");
        sb.append(className);
        sb.append("{ public void call(){");
        sb.append(str);
        sb.append(";");
        //func end
        sb.append("}");
        //class end
        sb.append("}");
        FileUtil.writeString(sb.toString(), file, "UTF-8");
        try {
            Class<?> clz = Thread.currentThread().getContextClassLoader().loadClass(className);
            return new ReturnableFunction() {
                @Override
                public Object call() throws Exception {
                    Object ins = Json.newInstance(clz);
                    MethodAccess ma = MethodAccess.get(clz);
                    return ma.invoke(ins, "call");
                }
            };
        } catch (Exception e) {
            return new ReturnableFunction() {
                @Override
                public Object call() throws Exception {
                    throw e;
                }
            };
        }
    }



}
