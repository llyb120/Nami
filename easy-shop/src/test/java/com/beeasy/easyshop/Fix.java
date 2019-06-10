package com.beeasy.easyshop;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.beeasy.easyshop.model.RaAlbumClass;
import com.beeasy.easyshop.model.RaAlbumPic;
import com.beeasy.easyshop.util.U;
import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.DBService;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static com.github.llyb120.nami.core.DBService.sqlManager;
import static com.github.llyb120.nami.core.Config.config;

public class Fix {
    @BeforeClass
    public static void before() {
        Config.init("config.json");
        DBService.start(false);
    }

    /**
     * 修复相册封面
     */
    @Test
    public void fixGalleryConver(){
        List<RaAlbumClass> list =sqlManager.lambdaQuery(RaAlbumClass.class)
            .select();
        for (RaAlbumClass raAlbumClass : list) {
            var pic = raAlbumClass.getAclass_cover();
//            DateUtil.format(new Date())
            var name = U.fixFileName(pic);
            if(StrUtil.isEmpty(pic)) continue;
            File target = new File(config.uploadDir, name);
            try{
                HttpUtil.downloadFile(String.format("http://shopss.beeasy.com.cn/data/upload/shop/store/goods/%d/%s", raAlbumClass.getStore_id(), raAlbumClass.getAclass_cover()), target);
                raAlbumClass.setN_conver(name);
                sqlManager.updateById(raAlbumClass);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("fixed:" + target.getAbsolutePath());
        }
    }


    @Test
    public void fixGalleryPic(){
        List<RaAlbumPic> list =sqlManager.lambdaQuery(RaAlbumPic.class)
            .select();
        for (RaAlbumPic raAlbumClass : list) {
            var pic = raAlbumClass.getApic_cover();
//            DateUtil.format(new Date())
            var name = U.fixFileName(pic);
            if(StrUtil.isEmpty(pic)) continue;
            File target = new File(config.uploadDir, name);
            try{
                HttpUtil.downloadFile(String.format("http://shopss.beeasy.com.cn/data/upload/shop/store/goods/%d/%s", raAlbumClass.getStore_id(), raAlbumClass.getApic_cover()), target);
                raAlbumClass.setN_cover(name);
                sqlManager.updateById(raAlbumClass);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("fixed:" + target.getAbsolutePath());
        }
    }
}
