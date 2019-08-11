package com.github.llyb120.nami.hotswap;

import cn.hutool.core.util.ModifierUtil;
import com.github.llyb120.nami.server.Response;
import org.apache.commons.collections4.queue.PredicatedQueue;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.github.llyb120.nami.core.Config.config;

public abstract class AbstractLoader extends ClassLoader {
    private Map<String, Holder> instances = new HashMap<>();

    private class Holder{
        Object ins;
        Class clz;
        List<Field> fields = new ArrayList<>();

        public Holder(String s) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
            this.clz = loadClass(s);
            ins = clz.newInstance();
            for (Field field : clz.getDeclaredFields()) {
                if(ModifierUtil.isStatic(field)) {
                    field.setAccessible(true);
                    fields.add(field);
                }
            }
            instances.put(s, this);
        }

    }

    public void loadMagicVars(Response response){
        for (String s : config.magicvar) {
            try {
                Holder holder = instances.get(s);
                if (holder == null) {
                    holder = new Holder(s);
                }
                for (Field field : holder.fields) {
                    String name = field.getName();
                    if(name.startsWith("$")){
                        name = name.substring(1);
                    }
                    Object value = response.request.params.get(name);
                    field.set(holder.ins, value);
                }

            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
