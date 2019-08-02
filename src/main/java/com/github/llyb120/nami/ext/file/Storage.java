package com.github.llyb120.nami.ext.file;

import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.MultipartFile;

import java.io.IOException;

import static com.github.llyb120.nami.core.Config.config;

public interface Storage {
    String upload(MultipartFile file) throws IOException;
    String uploadImage(String base64) throws IOException;
    MultipartFile download(String id) throws IOException;

    public static Storage getStorage(String name){
        Config.StorageConfig item = config.storages.get(name);
        if (item == null) {
            return null;
        }
        return item.instance;
    }
}
