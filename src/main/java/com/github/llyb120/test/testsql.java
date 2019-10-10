package com.github.llyb120.test;

import com.github.llyb120.nami.json.Obj;
import com.github.llyb120.nami.server.Ctrl;
import org.beetl.sql.core.SQLReady;

import static com.github.llyb120.nami.ext.beetlsql.BeetlSql.sqlManager;
import static com.github.llyb120.nami.json.Json.o;

public class testsql extends Ctrl {
    public static int d = 2;
    public Object fk(){

//        System.out.println();
//        Context rhino = Context.enter();
//        rhino.setApplicationClassLoader(AppClassLoader.loader);
//        Scriptable scope = rhino.initStandardObjects();
//        Scriptable dd = (Scriptable) rhino.evaluateString(scope, "(() => { return {a:1,b:2} })();", testsql.class.getName(), 1, null);
//        scope.ge
//        int a = (int) dd.get("a", scope);
//        int b = (int) dd.get("b");
//        System.out.println(a);
//        System.out.println(b);
//        return null;

        select(o(
           "age>",10,
                "jobs", o(
                       "uid", "$uid"
                )
        ));

//        Scriptable
        return sqlManager.execute(new SQLReady("select count(1) from t_user"), Obj.class);
    }

    public void select(Obj obj){

    }
}
