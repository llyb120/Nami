package com.beeasy.easyshop;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.easyshop.model.RaMember;
import com.beeasy.easyshop.util.U;
import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.DBService;
import com.github.llyb120.nami.core.Nami;
import org.beetl.core.*;
import org.beetl.core.resource.StringTemplateResourceLoader;
import org.beetl.sql.core.engine.PageQuery;
import org.junit.BeforeClass;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

import static com.beeasy.easyshop.util.U.o;
import static com.github.llyb120.nami.core.Json.a;

public class Test {

    @BeforeClass
    public static void before(){
        ThreadUtil.execAsync(() -> App.main(null));
        ThreadUtil.sleep(1500);
    }

    @org.junit.Test
    public void test(){
       var ret =  HttpUtil.get("http://127.0.0.1:8082/test/a/testSuper2", o(
            "member_id", "22"
        ));
       var c = 1;
    }

    public void c(PageQuery<RaMember> pageQuery){

    }



    public static class CompressTag extends Tag {
        @Override
        public void render(){
            BodyContent content = getBodyContent();
            var cnt = content.getBody();
            int d = 1;
        }
    }

    @org.junit.Test
    public void TTT() throws IOException {
        var code = IoUtil.read(new FileReader("D:\\work\\easyshop\\easy-shop\\src\\main\\resources\\1.java"));
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = Configuration.defaultConfiguration();
        cfg.setStatementStart("//@");
        cfg.setStatementEnd(null);
        cfg.setPlaceholderStart("_{");
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        gt.registerTag("fuck", CompressTag.class);
        Template t = gt.getTemplate(code);
        t.binding("users", a("1","2"));
        String str = t.render();
        System.out.println(str);
    }


}
