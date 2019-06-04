package com.beeasy.easyshop.filter;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.cron.CronUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.DES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.easyshop.util.U;
import com.beeasy.web.core.AopInvoke;
import com.beeasy.web.core.Context;
import com.beeasy.web.core.Cookie;
import com.beeasy.web.core.R;
import io.netty.handler.codec.http.FullHttpRequest;
import static com.beeasy.easyshop.util.U.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.SecureRandom;
import java.sql.Struct;
import java.util.Base64;

import static com.beeasy.web.core.DBService.dataSource;
import static com.beeasy.web.core.DBService.sqlManager;

public class auth {

    private static ThreadLocal<Object[]> local = new ThreadLocal<>(){
        @Override
        protected Object[] initialValue() {
            return new Object[10];
        }
    };

    private static SymmetricCrypto aes;
    static {
        byte[] salt = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue(), "easyshopeasyshop".getBytes()).getEncoded();
        aes = new SymmetricCrypto(SymmetricAlgorithm.AES, salt);
    }

    public Object around(AopInvoke invoke, Context context, Cookie cookie, JSONObject headers, FullHttpRequest request) throws Exception {
        String path = request.uri();
        if(path.startsWith("/user/login")){
            return invoke.call();
        }

        try{
            analyze(context);
        }
        catch (Exception e){
            return R.fail("请登录");
        }
        Object ret = invoke.call();
        return ret;
    }

    public static String createToken(String str){
        //生成一个随机秘钥
        return aes.encryptHex(str);
    }

    public static String getUid(){
        return (String) local.get()[0];
    }

    public static String getStoreId(){
        return (String) local.get()[2];
    }

    public static String getStoreId(Context ctx){
        analyze(ctx);
        return getStoreId();
    }

    public static void analyze(Context context){
        var token = context.headers.getString("token");
        if (StrUtil.isEmpty(token)) {
            token = context.cookie.get("token");
            if(StrUtil.isEmpty(token)){
                throw new RuntimeException();
            }
        }
        String str = aes.decryptStr(token);
        String[] arr = str.split("\\|");
        if(arr.length < 5){
            throw new RuntimeException();
        }
        System.arraycopy(arr, 0, local.get(), 0, arr.length);
    }

}
