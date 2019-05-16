package com.beeasy.easyshop;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.easyshop.ctrl.user;
import com.beeasy.web.core.Config;
import com.beeasy.web.core.DBService;
import com.beeasy.web.core.R;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.beeasy.easyshop.U.*;

public class Flow {

    @BeforeClass
    public static void before() {
        Config.init("config.json");
        DBService.start(false);
    }

    @Test
    public void testlogin(){

        var ret = get("/user/login",obj(
            "memberName", "myzy",
            "memberPasswd", "123456"
        ));
        Assert.assertEquals(200, ret.code);
        Assert.assertNotNull(ret.data);
    }

    public String getUrl(String path){
        return String.format("http://127.0.0.1:8082%s", path);
    }

    public R get(String url, JSONObject params){
        var res = HttpUtil.get(getUrl(url), params);
        return JSON.parseObject(res, R.class);
    }


}
