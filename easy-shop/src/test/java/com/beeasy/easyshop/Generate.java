package com.beeasy.easyshop;


import com.alibaba.fastjson.JSONObject;
import com.beeasy.web.core.Config;
import com.beeasy.web.core.DBService;
import org.beetl.sql.core.SQLReady;
import org.beetl.sql.ext.gen.GenConfig;
import org.beetl.sql.ext.gen.GenFilter;
import org.junit.Test;

import java.util.List;

import static com.beeasy.web.core.DBService.sqlManager;

public class Generate {

    @Test
    public void test() throws Exception {
        Config.init("config.json");
        DBService.start(false);
//        DBService.start();

        sqlManager.genALL("com.beeasy.easyshop.model", new GenConfig(), new GenFilter() {
            @Override
            public boolean accept(String s) {
                if(s.equals("ra_goods_package")){
                    return false;
                }
                if(s.startsWith("ra_")){
                    return true;
                }
                return false;
            }
        });
    }


}
