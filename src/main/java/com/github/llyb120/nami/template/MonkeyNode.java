package com.github.llyb120.nami.template;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class MonkeyNode {
    public MonkeyNodeType type;
    public String value;
    public List<MonkeyNode> children; //= new ArrayList<>();

    public MonkeyNode(MonkeyNodeType type){
        this.type = type;
        if(type != MonkeyNodeType.STRING && type != MonkeyNodeType.PROPERTY){
            children = new ArrayList<>();
        }
    }

    public void render(StringBuilder sb, Object data){
        if(type == MonkeyNodeType.STRING){
            sb.append(value);
        } else {
            if(type == MonkeyNodeType.ROOT){
                for (MonkeyNode child : children) {
                    child.render(sb, data);
                }
            } else if(type == MonkeyNodeType.TAG){
                if(data instanceof Map){
                    Object _data = ((Map) data).get(value);
                    if(_data instanceof Collection){
                        for (Object datum : ((Collection) _data)) {
                            for (MonkeyNode child : children) {
                                child.render(sb, datum);
                            }
                        }
                    } else if(_data != null){
                        for (MonkeyNode child : children) {
                            child.render(sb, _data);
                        }
                    }
                }
            } else if(type == MonkeyNodeType.PROPERTY){
                if(value.equals("$v")){
                    sb.append(String.valueOf(data));
                }
                if(data instanceof Map){
                    sb.append(((Map) data).getOrDefault(value, ""));
                }
            }
        }
    }
}
