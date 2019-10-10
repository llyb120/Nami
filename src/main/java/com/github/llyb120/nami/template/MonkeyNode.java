package com.github.llyb120.nami.template;

import com.github.llyb120.nami.func.Expression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    private void renderRoot(StringBuilder sb, List stack){
        for (MonkeyNode child : children) {
            child.render(sb, stack);
        }
    }

    private void renderString(StringBuilder sb, List stack){
        sb.append(value);
    }

    private void renderTag(StringBuilder sb, List stack){
        Object data = getData(stack);
            if(data instanceof Collection){
                for (Object datum : ((Collection) data)) {
                    stack.add(datum);
                    for (MonkeyNode child : children) {
                        child.render(sb, stack);
                    }
                    stack.remove(stack.size() - 1);
                }
            } else if(data != null){
                stack.add(data);
                for (MonkeyNode child : children) {
                    child.render(sb, stack);
                }
                stack.remove(stack.size() - 1);
            }
    }
    private void renderProperty(StringBuilder sb, List stack){
        Object data = getData(stack);
        if(data instanceof Collection){
            sb.append(((Collection) data).stream()
                    .filter(e -> e != null)
                    .map(e -> String.valueOf(e))
                    .collect(Collectors.joining(",")));
        } else if(data != null){
            sb.append(data);
        }
    }

    private Object getData(List stack){
        if(stack.size() < 1){
            return null;
        }
        if(value.equals("$v")){
            return stack.get(stack.size() - 1);
        }
        Object ret = null;
        int i = stack.size();
        while(i-- > 0){
            Object o = stack.get(i);
            if(o instanceof Map){
                if(((Map) o).containsKey(value)){
                    ret = ((Map) o).get(value);
                    break;
                }
            }
        }
        if(ret instanceof Expression){
            try {
                ret = ((Expression) ret).call();
            } catch (Exception e) {
            }
        }
        return ret;
    }

    private void render(StringBuilder sb, List stack){
        switch (type){
            case ROOT:
                renderRoot(sb, stack);
                break;

            case STRING:
                renderString(sb, stack);
                break;

            case TAG:
                renderTag(sb, stack);
                break;

            case PROPERTY:
                renderProperty(sb, stack);
                break;
        }
    }

    public String render(Object data){
        if(type != MonkeyNodeType.ROOT){
            throw new RuntimeException();
        }
        StringBuilder sb = new StringBuilder();
        List stack = new ArrayList();
        stack.add(data);
        render(sb, stack);//, data);
        return sb.toString();
    }
}
