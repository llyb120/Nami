package com.beeasy.easyshop.ctrl;

import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.easyshop.model.*;
import com.github.llyb120.nami.core.*;
import com.github.llyb120.nami.core.boost.SqlBoost;
import com.github.llyb120.nami.excel.ExportUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.beetl.sql.core.SQLReady;
import org.beetl.sql.core.engine.PageQuery;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

import static com.github.llyb120.nami.core.DBService.sqlManager;
import static com.github.llyb120.nami.core.Json.a;
import static com.github.llyb120.nami.core.Json.o;

public class aa {

    public static class d{
        public int c;
    }

    public String test(
        d query,
        int c,
        int[] d
    ) {
        var e = 100;
        var f = 10320220;
        var a = 102221230;
        System.out.println("dfdffdddddddddljk;j133");
        var ccc = 200222;
        var eee = 2034303243;
        System.out.println(e);
        var gggj = a + e;
        List<JSONObject> list = sqlManager.execute(new SQLReady("select count(1) from ra_member "), JSONObject.class);
        return a + "source word " + new b().word;
    }

    public String upload(
        JSON body,
//        Arr params,
        MultipartFile file
    ){
        try {
            file.transferTo(new File("d:/cubi.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String cookieAdd(
        Cookie cookie,
        String d
    ){
        new ArrayList<>().stream().map(i -> i).forEachOrdered(i -> {

        });
        if(StrUtil.isEmpty(d)){
            d = "ccc";
        }
        cookie.set("cubi","123l");
        return d + "我没有变 你变你妈呢";
    }

    public String cookieDelete(
        Cookie cookie,
        RaStore mystore
    ){
        cookie.delete("cubi");
        return "";
    }


    public Object testfuck(
        JSON body
    ){
        return body;
    }

    public Object testSuper(
        @SqlBoost(model = RaAlbumClass.class, appendField="(select count(1) from ra_album_pic where aclass_id = b.aclass_id) as total") List<Obj> mylist
    ){
        return mylist;
    }

    public Object testSuper2(
        @SqlBoost(model = RaOrder.class, appendField = "goods") PageQuery<JSONObject> orderlist,
        @SqlBoost(model = RaOrder.class, appendField = "goods") JSONObject oi,
        Obj<?> obj,
        String member_name,
        String member_passwd
    ){
        if(StrUtil.isEmpty(member_name) || StrUtil.isEmpty(member_passwd)){
            return R.fail("用户名错误");
        }
        member_passwd = SecureUtil.md5(member_passwd);
        var user = sqlManager.lambdaQuery(RaMember.class)
            .andEq(RaMember::getMember_name, member_name)
            .andEq(RaMember::getMember_passwd, member_passwd)
            .single();
        if (user == null) {
            return R.fail("用户名密码错误");
        }
        var seller = sqlManager.lambdaQuery(RaSeller.class)
                    .andEq(RaSeller::getMember_id, user.getMember_id())
                    .single();
        if (seller == null) {
            return R.fail("该用户不是商家");
        }

        //@use(login.login,a,b,c){
        int d = 13223222;
        int c = 34252233;
        //@}

        obj.as(RaMember.class)
            .on(Json.ValidateType.notempty, "不能为空", RaMember::getMember_name, RaMember::getMember_passwd)
            .hold(RaMember::getMember_name,RaMember::getMember_passwd)
            .set(RaMember::getMember_passwd, Json.ValueType.md5)
            .find()
            .on(Json.ValidateType.notempty, "用户名密码错误")
            .assign(m -> {
                return sqlManager.lambdaQuery(RaSeller.class)
                    .andEq(RaSeller::getMember_id, m.getMember_id())
                    .single();
            })
            .as(RaSeller.class)
            .on(Json.ValidateType.notnull, "该用户不是商家", RaSeller::getSeller_id);

        return orderlist;
    }


    public File download(File file){
        return new File("d:/template.xls");
    }

    public MultipartFile testDownload(){
        return new MultipartFile("111.mp4", new File("D:\\UpupooResource\\2000014971\\贞德1080p60fps.mp4"));
    }

    public MultipartFile ddd(){
        try {
            return ExportUtil.toXls("cubi.xls", new FileInputStream("d:/template.xls"), o(
                "values", a(
                    o("name", "1", "code", "cu"),
                    o("name", "2", "code", "da")
                )
            ));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        return null;
    }


    public Object obj(PageQuery<RaMember> memberPageQuery){
        return memberPageQuery;
    }

}




