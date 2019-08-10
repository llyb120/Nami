package com.github.llyb120.nami.core;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.ModifierUtil;
import cn.hutool.core.util.RandomUtil;
import com.esotericsoftware.reflectasm.ConstructorAccess;
import com.esotericsoftware.reflectasm.FieldAccess;
import com.esotericsoftware.reflectasm.MethodAccess;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static com.github.llyb120.nami.core.Config.config;

public class MyClassLoadader extends ClassLoader {

    private static ClassLoader defaultClassLoader = MyClassLoadader.class.getClassLoader();

    public MyClassLoadader(){
        try {
            Class<?> clz = loadClass("com.github.llyb120.nami.core.TestVar");
            Object ins = clz.newInstance();
            for (Field field : clz.getDeclaredFields()) {
                if(ModifierUtil.isPublic(field) && ModifierUtil.isStatic(field)){
                    field.set(ins, RandomUtil.randomInt());
                }
            }
            int d = 2;
//            FieldAccess fa = FieldAccess.get(clz);
//            ConstructorAccess ca = ConstructorAccess.get(clz);
//            clzfa.set(ca.newInstance(), "a", RandomUtil.randomInt());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        boolean hotswap = false;
            for (String s : Config.config.hotswap) {
                if(name.startsWith(s)) {
                    hotswap = true;
                    break;
                }
            }

        if(!hotswap){
            return defaultClassLoader.loadClass(name);
        }

        //读取已经编译的
        Compiler.waitForAllCompiled();
        try {
            byte[] b = Compiler.readClass(name);
            return defineClass(null, b, 0, b.length);
        } catch (Exception e) {
            e.printStackTrace();
            return super.findClass(name);
        }

    }



}
