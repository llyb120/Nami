package com.beeasy.hzlink.ctrl;

import com.alibaba.fastjson.JSONObject;
import com.beeasy.hzlink.model.Link111;
import com.beeasy.hzlink.model.TSystemNotice;
import com.beeasy.hzlink.model.TUser;
import com.beeasy.hzlink.service.Link;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.core.Obj;
import com.github.llyb120.nami.core.boost.SqlBoost;
import com.github.llyb120.nami.excel.ExportUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.beetl.sql.core.engine.PageQuery;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.github.llyb120.nami.core.DBService.sqlManager;
import static com.github.llyb120.nami.core.Json.a;
import static com.github.llyb120.nami.core.Json.o;


public class aaa {

    public Object testfind(
            PageQuery<TUser> my_user){
        return my_user;
    }



    public void test(String fullName){
//        Link.do11_2(fullName);
        Link.do12_5("余小龙","511229741612044659");
    }

    public MultipartFile test11_4(){
        try {
            var lists = sqlManager.lambdaQuery(Link111.class).andEq(Link111::getLink_rule,"11.3").select();

            var data = a();
            for (Link111 list : lists) {
                Map<String, String> map = new HashMap<>();
                map.put("cusName",list.getOrigin_name());
                data.add(map);
            }
            return ExportUtil.toXls("cubi.xls", new FileInputStream("e:/7.xls"), o(
                    "values", data
            ));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        return null;
    }
}
