package com.github.llyb120.nami.ext.file;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.Mime;
import com.github.llyb120.nami.core.MultipartFile;
import sun.misc.BASE64Decoder;

import java.io.*;
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
    public String upload(String base64) {
        if(!base64.startsWith("data:")){
            return null;
        }
        int p1 = base64.indexOf("image/");
        int p2 = base64.indexOf(";");
        if(p1 == -1 || p2 == -1 || p1 >= p2){
            return null;
        }
        String ext = base64.substring(p1 + 6, p2);
        int comma = base64.indexOf(",");
        String cnt = base64.substring(comma + 1);
        String date = DateUtil.formatDate(new Date());
        File dir = new File(config.path, date) ;
        dir.mkdirs();
        File target = new File(dir, IdUtil.fastSimpleUUID() + "." + ext);
        BASE64Decoder decoder = new BASE64Decoder();
        try(
                OutputStream fos = new FileOutputStream(target);
                InputStream is = new StringBufferInputStream(cnt);
                ){
            decoder.decodeBuffer(is, fos);
            return "/" + date + "/" + target.getName();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MultipartFile download(String id) {
        return new MultipartFile(new File(config.path, id));
    }
}
