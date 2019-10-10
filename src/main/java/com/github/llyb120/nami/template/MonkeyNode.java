package com.github.llyb120.nami.template;

import java.util.*;
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

    private void renderRoot(StringBuilder sb, LinkedList stack){
        for (MonkeyNode child : children) {
            child.render(sb, stack);
        }
    }

    private void renderString(StringBuilder sb, LinkedList stack){
        sb.append(value);
    }

    private void renderTag(StringBuilder sb, LinkedList stack){
        Object data = getData(stack);
            if(data instanceof Collection){
                for (Object datum : ((Collection) data)) {
                    stack.add(datum);
                    for (MonkeyNode child : children) {
                        child.render(sb, stack);
                    }
                    stack.removeLast();
                }
            } else if(data != null){
                stack.add(data);
                for (MonkeyNode child : children) {
                    child.render(sb, stack);
                }
                stack.removeLast();
            }
    }
    private void renderProperty(StringBuilder sb, LinkedList stack){
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

    private Object getData(LinkedList stack){
        if(stack.size() < 1){
            return null;
        }
        if(value.equals("$v")){
            return stack.getLast();
        }
        Object ret = null;
        for (Object o : stack) {
            if(o instanceof Map){
                if(((Map) o).containsKey(value)){
                    ret = ((Map) o).get(value);
                }
            }
        }
        return ret;
    }

    private void render(StringBuilder sb, LinkedList stack){
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
        LinkedList stack = new LinkedList();
        stack.add(data);
        render(sb, stack);//, data);
        return sb.toString();
    }
}
