package com.github.llyb120.nami.func;

import cn.hutool.crypto.SecureUtil;
import com.esotericsoftware.reflectasm.MethodAccess;
import com.github.llyb120.nami.compiler.AppClassLoader;
import com.github.llyb120.nami.compiler.Compiler;
import com.github.llyb120.nami.json.Json;


public abstract class Function {

    private static ClassLoader _loader = new AppClassLoader();

    public static Object func(Expression function) {
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
        Expression func = compile(str);
        return (T) func.call();
    };

    public static Expression compile(String str){
        String key = SecureUtil.md5(str);
        String className = "NamiFunc" + key;
//        File file = new File(sourceDir, className + ".java");
        StringBuilder sb = new StringBuilder();
        StringBuilder codes = new StringBuilder();
        String[] lines = str.split("\n");
        for (String line : lines) {
            if(line.trim().startsWith("import ")){
                sb.append(line);
                sb.append(";");
                sb.append("\n");
            } else {
                codes.append(line);
                codes.append("\n");
            }
        }
        sb.append("public class ");
        sb.append(className);
        sb.append("{ public Object call() throws Exception {");
        sb.append("if(true){ ");
        sb.append(codes);
        sb.append(";");
        sb.append("}");
        sb.append("return null;");
        //func end
        sb.append("}");
        //class end
        sb.append("}");
//        Compiler
//        Compiler.compile(className, sb.toString());
//        FileUtil.writeString(sb.toString(), file, "UTF-8");

        return () -> {
            Class<?> clz = _loader.loadClass(className);
            Object ins = Json.newInstance(clz);
            MethodAccess ma = MethodAccess.get(clz);
            return ma.invoke(ins, "call");
        };
    }



}
