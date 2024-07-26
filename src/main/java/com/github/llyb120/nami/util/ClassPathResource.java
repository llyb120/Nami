package com.github.llyb120.nami.util;

import org.beetl.core.resource.ClasspathResource;

import java.io.InputStream;

public class ClassPathResource {
   private String path;
    public ClassPathResource(String path){
        this.path = path;
    }

    public InputStream getStream(){
        return ClasspathResource.class.getClassLoader().getResourceAsStream(path);
    }
}
