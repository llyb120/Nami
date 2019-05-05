package com.beeasy.easyshop.filter;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.cron.CronUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.DES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import com.beeasy.web.core.AopInvoke;
import com.beeasy.web.core.Cookie;
import io.netty.handler.codec.http.FullHttpRequest;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.SecureRandom;
import java.util.Base64;

import static com.beeasy.web.core.DBService.dataSource;
import static com.beeasy.web.core.DBService.sqlManager;

public class Auth {

    private static SymmetricCrypto aes;
    static {
        byte[] salt = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue(), "easyshopeasyshop".getBytes()).getEncoded();
        aes = new SymmetricCrypto(SymmetricAlgorithm.AES, salt);
    }

    public Object around(AopInvoke invoke, Cookie cookie, FullHttpRequest request) throws Exception {
        String path = request.uri();
        if(path.startsWith("/user/login")){
            return invoke.call();
        }
        Object ret = invoke.call();
        return ret;
//        String auth = cookie.get("token");
//        return createToken("1\t2\t3\t4\t");
    }

    public static String createToken(String str){
        //生成一个随机秘钥
        return aes.encryptHex(str);
    }


}
