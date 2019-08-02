package com.github.llyb120.nami.ext.file;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.Mime;
import com.github.llyb120.nami.core.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class SimpleStorage implements Storage{

    private Config.StorageConfig config;

    public SimpleStorage(Config.StorageConfig config){
        this.config = config;
        config.path.mkdirs();
    }


    @Override
    public String upload(MultipartFile file) throws IOException {
        String date = DateUtil.formatDate(new Date());
        File dir = new File(config.path, date) ;
        dir.mkdirs();
        File target = new File(dir, IdUtil.fastSimpleUUID() + "." + Mime.getExt(file.fileName));
        file.transferTo(target);
        return "/" + date + "/" + target.getName();
    }

    @Override
    public String uploadImage(String base64) {
        return null;
    }

    @Override
    public MultipartFile download(String id) {
        return new MultipartFile(new File(config.path, id));
    }
}
