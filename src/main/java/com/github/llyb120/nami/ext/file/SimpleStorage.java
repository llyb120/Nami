package com.github.llyb120.nami.ext.file;

import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.Mime;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.util.Util;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.time.LocalDate;
import java.util.Base64;

public class SimpleStorage implements Storage{

    private Config.StorageConfig config;

    public SimpleStorage(Config.StorageConfig config){
        this.config = config;
        config.path.mkdirs();
    }


    @Override
    public String upload(MultipartFile file) throws IOException {
        String date = LocalDate.now().toString();
        File dir = new File(config.path, date) ;
        dir.mkdirs();
        File target = new File(dir, Util.fastSimpleUUID() + "." + Mime.getExt(file.fileName));
        file.transferTo(target);
        return "/" + date + "/" + target.getName();
    }

    @Override
    public String upload(String base64) {
//        if(base64.startsWith("data:")){
//            base64 = base64
//        }
        int p1 = base64.indexOf("image/");
        int p2 = base64.indexOf(";");
        if(p1 == -1 || p2 == -1 || p1 >= p2){
            return null;
        }
        String ext = base64.substring(p1 + 6, p2);
        int comma = base64.indexOf(",");
        String cnt = base64.substring(comma + 1);
//        LocalDate.now().toString();
//        SimpleDateFormat sdf = new
        String date = LocalDate.now().toString();//DateUtil.formatDate(new Date());
        File dir = new File(config.path, date) ;
        dir.mkdirs();
        File target = new File(dir, Util.fastSimpleUUID() + "." + ext);
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bs = Base64.getDecoder().decode(cnt);
//        Base64.getDecoder().decode()
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
