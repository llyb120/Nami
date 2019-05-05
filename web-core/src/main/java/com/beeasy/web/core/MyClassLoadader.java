package com.beeasy.web.core;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static com.beeasy.web.core.Config.config;

public class MyClassLoadader extends ClassLoader {

    private static ClassLoader defaultClassLoader = MyClassLoadader.class.getClassLoader();
    /**
     * @param filename
     * @return Byte[]
     * @throws IOException
     */
    private byte[] getBytes(String filename) throws IOException {
        File file = new File(filename);
        byte raw[] = new byte[(int) file.length()];
        FileInputStream fin = new FileInputStream(file);
        fin.read(raw);
        fin.close();
        return raw;
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        boolean hotswap = false;
        if (Config.config.hotswap != null) {
            for (String s : Config.config.hotswap) {
                if(name.startsWith(s)) {
                    hotswap = true;
                    break;
                }
            }
        }

        if(!hotswap){
            return defaultClassLoader.loadClass(name);
        }

        if(null != config.compile){
            try {
                String realName = name.replaceAll("\\.", "/");
                byte[] b = Compiler.compile(realName);
                return defineClass(null, b, 0, b.length);
            } catch (Exception e) {
                e.printStackTrace();
                return super.findClass(name);
            }
        }

        ClassPathResource resource = new ClassPathResource(name.replaceAll("\\.", "/") + ".class");
        try (
            InputStream is = resource.getStream();
            ){
            byte[] b = IoUtil.readBytes(is);
            return defineClass(null, b, 0, b.length);
        } catch (Exception e) {
            return super.findClass(name);
        }
    }



}
