package com.github.llyb120.nami.template;

import com.github.llyb120.nami.util.Util;

import java.util.LinkedList;
import java.util.Map;

public class MonkeyTmpl {

    private String temp;
    private int ptr;
    private int startPtr;
    private MonkeyParsePhase phase = MonkeyParsePhase.NORMAL;
    private LinkedList<MonkeyNode> stack = new LinkedList<>();

    public MonkeyTmpl(String temp){
        this.temp = temp;
        stack.add(new MonkeyNode(MonkeyNodeType.ROOT));
        this.parse();
    }

    private void parse(){
        while(ptr < temp.length()){
            char c = temp.charAt(ptr);
            switch (c){
                case '{':
                    char next = getNextChar();
                    //new context
                    if(next == '#'){
                        buildStrNode();
                        startPtr = ptr + 2;
                        phase = MonkeyParsePhase.TAG_START;
                    } else if(next == '/'){
                        buildStrNode();
                        startPtr = ptr + 2;
                        phase = MonkeyParsePhase.TAG_END;
                    } else if(!Util.isBlankChar(next)){
                        buildStrNode();
                        startPtr = ptr + 1;
                        phase = MonkeyParsePhase.PROPERTY_START;
                    } else {
                        phase = MonkeyParsePhase.NORMAL;
                    }
                    break;

                case '}':
                    switch (phase){
                        case TAG_START:
                            buildTagNode();
                            startPtr = ptr + 1;
                            phase = MonkeyParsePhase.NORMAL;
                            break;

                        case PROPERTY_START:
                            buildPropertyNode();
                            startPtr = ptr + 1;
                            phase = MonkeyParsePhase.NORMAL;
                            break;

                        case TAG_END:
                            stack.removeLast();
                            startPtr = ptr + 1;
                            phase = MonkeyParsePhase.NORMAL;
                            break;
                    }
                    break;
            }
            ptr++;
        }
        buildStrNode();
    }

    private void buildPropertyNode(){
        if(startPtr == -1){
            return;
        }
        MonkeyNode node = new MonkeyNode(MonkeyNodeType.PROPERTY);
        node.value = temp.substring(startPtr, ptr);
        MonkeyNode par = stack.getLast();
        par.children.add(node);
    }

    private void buildTagNode(){
        if(startPtr == -1){
            return;
        }
        MonkeyNode node = new MonkeyNode(MonkeyNodeType.TAG);
        node.value = temp.substring(startPtr, ptr);
        MonkeyNode par = stack.getLast();
        par.children.add(node);
        stack.add(node);
    }

    private void buildStrNode(){
        if(startPtr > -1){
            MonkeyNode node = new MonkeyNode(MonkeyNodeType.STRING);
            node.value = temp.substring(startPtr, ptr);
            //查找父节点
            MonkeyNode par = stack.getLast();
            par.children.add(node);
        }
    }


    private char getNextChar(){
       return temp.charAt(ptr + 1);
    }

    public String render(Map data){
        return stack.get(0).render(data);
    }
}
