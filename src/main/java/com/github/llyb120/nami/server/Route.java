package com.github.llyb120.nami.server;

import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.json.Arr;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

import static com.github.llyb120.nami.json.Json.a;


public class Route {

    public static class Node implements Cloneable{
        public String value;
        public String ctrl;
        public ConcurrentLinkedDeque<Node> children = new ConcurrentLinkedDeque<>();
        public Node parent;
        public int deep = 0;
        public Type type = Type.NORMAL;

        public enum Type{
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


}
