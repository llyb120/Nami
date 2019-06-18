package com.github.llyb120.nami.sqltool;
import com.github.llyb120.nami.core.*;
import org.beetl.sql.core.SQLReady;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.core.DBService.sqlManager;
import static com.github.llyb120.nami.core.Json.*;

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
        sql = "SELECT tabname,colname,colno,typename,length,remarks FROM SYSCAT.COLUMNS  where TABSCHEMA= #schema#";
        sqlManager.execute(sql, Obj.class, o("schema", "DB2INST1"))
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


    public Object preview(Obj body){
        String sql = buildSql(body.getArr("table"));
        return R.ok(sql);
    }


    private String buildSql(Arr tables){
        var main = true;
        var sb = new StringBuilder();
        var sup = new StringBuilder();
        sb.append("select");
        var tobjs = tables.toObjList();
        for (Obj obj : tobjs) {
            field:{
                for (Obj fields : obj.getArr("fields").toObjList()) {
                    var field = fields.getStr("name", "");
                    sb.append(" ");
                    sb.append(obj.getStr("as"));
                    sb.append(".");
                    sb.append(field);
                    sb.append(",");
                    //如果出现了*
                    if(field.equals("*")){
                        break field;
                    }
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            sup.append(" from ");
            sup.append(obj.getStr("name"));
            sup.append(" as ");
            sup.append(obj.getStr("as"));
            sup.append(",");
        }
        sup.deleteCharAt(sup.length() - 1);
        sb.append(sup);
        System.out.println(sb.toString() + "111");
        return sb.toString();
    }


}
