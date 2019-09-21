package com.github.llyb120.nami.server;

import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.json.Arr;
import org.omg.CORBA.NO_IMPLEMENT;

import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.github.llyb120.nami.json.Json.a;


public class Route {

    public static class Node implements Cloneable{
        public String value;
        public String ctrl;
        public ConcurrentLinkedDeque<Node> children = new ConcurrentLinkedDeque<>();
        public Node parent;
        public int deep = 0;
        public Type type = Type.NORMAL;

        public static enum Type{
            ROOT,
            CLASS,
            METHOD,
            NORMAL;
        }

        private Node(){ }

        public static Node createNode(Type type){
            Node node = new Node();
            node.type = type;
            return node;
        }

        public Node getNode(String key){
            for (Node child : children) {
                if(child.value.equals(key)){
                    return child;
                }
            }
            Node node = new Node();
            node.value = key;
            node.parent = this;
            node.deep = deep + 1;
            if (key.equals(":c")) {
                node.type = Type.CLASS;
            } else if(key.equals(":a")){
                node.type = Type.METHOD;
            }
            children.add(node);
            return node;
        }


        private void getChild(List<String> url, int i, Arr ret){
            if(type == Type.ROOT){
                for (Node child : children) {
                    child.getChild(url, i, ret);
                }
                return;
            }
            String key = url.get(i);
            if(key.isEmpty()){
                getChild(url, i + 1, ret);
                return;
            }
            boolean isEnd = i == url.size() - 1;
            if(type == Type.CLASS || type == Type.METHOD || StrUtil.equalsIgnoreCase(value, key)){
                if(isEnd){
                    ret.add(this);
                }
            }
            if(!isEnd){
                for (Node child : children) {
                    child.getChild(url, i + 1, ret);
                }
            }
        }

//        public boolean match(String[] url){
//            if(type != Type.ROOT){
//                return false;
//            }
//            if(url.length == 0){
//                return false;
//            }
//            Arr<Node> ret = a();
//            getChild(url,0, ret);
//            return true;
//        }



        public Node getMatched(List<String> strs){
            if(type != Type.ROOT){
                return null;
            }

            if(strs.size() == 0){
                return null;
            }
            Arr<Node> ret = a();
            getChild(strs, 0, ret);
            return ret.stream().min((a, b) -> Integer.compare(b.deep, a.deep))
                    .orElse(null);
        }

    }

    public static List<Route> routes = new Vector<>();

//    public int cIndex = -1;
//    public int aIndex = -1;
    public Pattern reg = null;
    public String packageName = null;
    public String[] aops;
    public String className = null;

//    public boolean isProxy = false;
    public boolean isBroken = false;
    public String proxyUrl;

    public String tempC;
    public String tempA;

    public Route(String str){
//        String[] proxy = str.split("\\s*<->\\s*");
        if(str.contains("<->")){
            proxyUrl = "";
//            isProxy = true;
        }
//        if(proxy.length > 0){
//            isProxy = true;
//        }
        String[] route = str.split("\\s*<?->\\s*");
//        String[] left = route[0].substring(1).split("/");
        String ctrl = null;
        if(route.length < 2) {
            isBroken = true;
        }
        if(route.length == 2){
            ctrl = route[1];
        } else {
            if(proxyUrl != null){
                //最后一个为请求链接
                proxyUrl = route[route.length - 1];
                //倒数第二个为控制器
                ctrl = route[route.length - 2];
                //aop
                aops = new String[route.length - 3];
            } else {
                ctrl = route[2];
                aops = new String[route.length - 2];
            }
            System.arraycopy(route, 1, aops, 0, aops.length);
        }

//        if(aops.length > 0){
//            if(aops[aops.length - 1].contains("<->")){
//                isProxy = true;
//            }
//        }
//        int i = 0;
//        for (String s : left) {
//            ArrayUtil.indexOf(left, ":c");
//            if(":c".equals(s)){
//                cIndex = i;
//            } else if(":a".equals(s)){
//                aIndex = i;
//            }
//            i++;
//        }
        //如果没有指定控制器，则直接指向类
        if(!str.contains(":c")){
            className = ctrl;
        } else {
            packageName = ctrl;
        }

        if(proxyUrl != null){
            reg = Pattern.compile("^" + route[0]);
        } else {
            reg = Pattern.compile(
                    "^" + route[0].replaceAll(":c|:a", "([a-zA-Z0-9\\-\\_]+)") + "$"
            );
        }
    }

    private Matcher match(String url){
        return reg.matcher(url);
    }

    public static Object[] getMatchedRoute(String path){
        for (Route route : routes) {
            Matcher m = route.match(path);
            if(m.find()){
                if(m.groupCount() == 2){
                    return new Object[]{route.packageName, route.packageName + "." + m.group(1), m.group(2), route.aops};
                } else if(m.groupCount() == 1){
                    return new Object[]{route.className, null, m.group(1), route.aops};
                }
            }
        }
        return null;
    }


}
