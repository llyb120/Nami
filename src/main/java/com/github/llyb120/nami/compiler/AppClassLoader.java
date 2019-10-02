package com.github.llyb120.nami.hotswap;

import static com.github.llyb120.nami.core.Config.config;

public class AppClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return HotLoader.load(name, false);
//        Class<?> clz = findLoadedClass(name);
//        if (clz != null) {
//            return clz;
//        }
//        boolean isScript = name.startsWith("NamiFunc");
//        if(config.dev){
////            boolean hotswap = config.hotswap
////                    .stream()
////                    .anyMatch(name::startsWith);
//            if(!config.isHotSwap(name) && !isScript){
//                return defaultClassLoader.loadClass(name);
//            }
//        } else {
//            if(!isScript){
//                return defaultClassLoader.loadClass(name);
//            }
//        }
//        return HotLoader.load(name, isScript);
    }

//    public void loadMagicVars(Response response) {
//        for (String s : config.magicvar) {
//            try {
//                Holder holder = instances.get(s);
//                if (holder == null) {
//                    holder = new Holder(s);
//                }
//                for (Field field : holder.fields) {
//                    String name = field.getName();
//                    if (name.startsWith("$")) {
//                        name = name.substring(1);
//                    }
//                    Object value;
//                    if (name.equalsIgnoreCase("get")) {
//                        value = response.request.query;
//                    } else if (name.equalsIgnoreCase("post") && response.request.body instanceof Obj) {
//                        value = response.request.body;
//                    } else if (name.equalsIgnoreCase("postA") && response.request.body instanceof Arr) {
//                        value = response.request.body;
//                    } else if (name.equalsIgnoreCase("request")) {
//                        value = response.request.params;
//                    } else {
//                        value = response.request.params.get(name, field.getType());
//                    }
//                    field.set(holder.ins, value);
//                }
//
//            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
