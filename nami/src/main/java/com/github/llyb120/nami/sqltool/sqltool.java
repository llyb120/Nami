package com.github.llyb120.nami.sqltool;
import com.github.llyb120.nami.core.Arr;
import com.github.llyb120.nami.core.HttpServerHandler;
import com.github.llyb120.nami.core.Obj;
import com.github.llyb120.nami.core.Route;
import org.beetl.sql.core.SQLReady;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.core.DBService.sqlManager;
import static com.github.llyb120.nami.core.Json.a;
import static com.github.llyb120.nami.core.Json.o;

public class sqltool {


    public static void init(){
        HttpServerHandler.ctrls.add(new Route("/sqltool/:c/:a -> com.github.llyb120.nami.sqltool"));
    }

    public String test(){
        return  "1111";
    }


    public Object getTables(){
        var map = new LinkedHashMap<String, Obj>();
        var sql = "select tabname from syscat.tables where tabschema='DB2INST1' and tabname not like 'EXPLAIN_%'";
        sqlManager.execute(new SQLReady(sql), Obj.class)
        .stream()
        .forEachOrdered(e -> {
            var table = o("name", e.getStr("tabname"), "fields", a());
            map.put(e.getStr("tabname"), table);
        });
        sql = "SELECT tabname,colname,colno,typename,length,remarks FROM SYSCAT.COLUMNS  where TABSCHEMA='DB2INST1'";
        sqlManager.execute(new SQLReady(sql), Obj.class)
            .stream()
            .forEach(e -> {
                var table = map.get(e.getStr("tabname"));
                if (table == null) {
                    return;
                }
                table.getArr("fields").add(o(
                    "name", e.getStr("colname"),
                    "no", e.getInteger("colno"),
                    "type", e.getStr("typename"),
                    "length", e.getInteger("length"),
                    "comment", e.getStr("remarks")
                ));
            });
        map.forEach((k,obj) -> {
            var li = obj.getArr("fields")
                .toObjList()
                .stream()
                .sorted((a,b) -> a.getInteger("no").compareTo(b.getInteger("no")))
                .peek(e -> e.remove("no"))
                .collect(Collectors.toList());
            obj.put("fields", li);
        });
        return map;
    }


}
