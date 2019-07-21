package com.github.llyb120.nami.server;

//import io.netty.handler.codec.http.HttpHeaders;
//import io.netty.handler.codec.http.HttpResponse;
//import io.netty.handler.codec.http.cookie.DefaultCookie;
//import io.netty.handler.codec.http.cookie.ServerCookieEncoder;

import java.util.*;
import java.util.stream.Collectors;

public class Cookie {
    private boolean changed = false;
    private Map<String, String> cookieMap = new HashMap<>();
//    private StringBuilder sb = new StringBuilder();
    private List<String> cookieModify = new ArrayList<>();

    public boolean hasChanged(){
        return cookieModify.size() > 0;
    }

    public String toSetCookieString() {
        return cookieModify.stream()
                .collect(Collectors.joining("; "));
    }

    //    public void reset(){
//        changed = false;
//        cookieMap.reset();
//    }

    public Cookie set(String key, String value, boolean update){
        cookieMap.put(key, value);
        changed = true;
        if(update){
            cookieModify.add(String.format("%s=%s", key, value));
        }
        return this;
    }

    public Cookie set(String key, String value){
        return set(key, value, true);
    }

    public String get(String key){
        return cookieMap.getOrDefault(key, "");
    }

    public void delete(String key){
        cookieMap.remove(key);
        cookieModify.add(String.format("%s=; expires=%s", key, new Date(0).toGMTString()));
    }

//    public void wrap(Set<io.netty.handler.codec.http.cookie.Cookie> cookies){
//        for (io.netty.handler.codec.http.cookie.Cookie cookie : cookies) {
//            cookieMap.set(cookie.name(), cookie);
//        }
//    }

//    public void writeToResponse(HttpResponse response){
//        if(!changed){
//           return;
//        }
//        response.headers().set(HttpHeaders.Names.SET_COOKIE, ServerCookieEncoder.LAX.encode(cookieMap.vals()));
//    }

}
