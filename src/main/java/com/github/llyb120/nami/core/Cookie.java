package com.github.llyb120.nami.core;

import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.cookie.DefaultCookie;
import io.netty.handler.codec.http.cookie.ServerCookieEncoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cookie {
    private boolean changed = false;
    private Map<String, io.netty.handler.codec.http.cookie.Cookie> cookieMap = new HashMap<>();

    public void reset(){
        changed = false;
        cookieMap.clear();
    }

    public void set(String key, Object value){
        String strval = String.valueOf(value);
        DefaultCookie cookie = new DefaultCookie(key, strval);
        cookieMap.put(key, cookie);
        changed = true;
    }

    public String get(String key){
        io.netty.handler.codec.http.cookie.Cookie cookie = cookieMap.get(key);
        if (cookie != null) {
            return cookie.value() ;
        }
        return "";
    }

    public void delete(String key){
        io.netty.handler.codec.http.cookie.Cookie cookie = cookieMap.get(key);
        if (cookie != null) {
            cookie.setMaxAge(-1);
            changed = true;
        }
    }

    public void wrap(Set<io.netty.handler.codec.http.cookie.Cookie> cookies){
        for (io.netty.handler.codec.http.cookie.Cookie cookie : cookies) {
            cookieMap.put(cookie.name(), cookie);
        }
    }

    public void writeToResponse(HttpResponse response){
        if(!changed){
           return;
        }
        response.headers().set(HttpHeaders.Names.SET_COOKIE, ServerCookieEncoder.LAX.encode(cookieMap.values()));
    }

}
