package com.github.llyb120.nami;

import cn.hutool.core.io.IoUtil;
import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.log.Log;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

import static com.github.llyb120.nami.ext.beetlsql.BeetlSql.sqlManager;


public class TestElse {

    @Test
    public void ttt(){
        Log.info("ok u");
        Log.error("ok u");
        Log.debug("ok u");
        Log.warn("ok u");
//        Nami.dev();
//        List<Obj> d = sqlManager.execute(new SQLReady("select count(1) from t_user"), Obj.class);
//        List<Obj> e = sqlManager.execute(new SQLReady("select count(1) from t_user"), Obj.class);
//        System.out.println(Json.stringify(d));
//        System.out.println(Json.stringify(e));
    }

    @Test
    public void test() throws IOException {
        System.out.println("\033[34m 日了狗了");
        if(true) return;
        FileOutputStream out = new FileOutputStream("d:/gate.txt");
       //行数计算
        File file = new File("C:\\Users\\Administrator\\Downloads\\llyb120-hz-gateway-master\\hz-gateway");
        ArrayList<File> files = new ArrayList<>(Arrays.asList(file.listFiles()));
        files.add(new File("D:\\work\\hznsh\\www\\htmlsrc\\lab\\gate\\gate.list.html"));
        files.add(new File("D:\\work\\hznsh\\www\\htmlsrc\\lab\\gate\\gate.edit.html"));
        files.add(new File("D:\\work\\hznsh\\www\\static\\htmljs\\utils.js"));
        for (File listFile : files) {
            if(listFile.isFile() && listFile.getName().endsWith(".go") || listFile.getName().endsWith(".html") || listFile.getName().endsWith(".js")){
                String str = IoUtil.read(new FileReader(listFile));
                out.write("/************************* ".getBytes());
                if(listFile.getName().endsWith(".js")){
                    out.write("系统所使用的公共JS".getBytes());
                }
                out.write(listFile.getName().getBytes());
                out.write("*************************/".getBytes());
                out.write("\r\n".getBytes());
                out.write(str.getBytes());
            }
        }
    }


    @Test
    public void testStatic() throws InterruptedException {
        Nami.dev();
        for (int i = 0; i < 10 ; i++) {
            new Thread(() -> {
                sqlManager.getBeetl();
                System.out.println("after");
            }).start();
        }
        Thread.sleep(10000);
    }


    private void test2(Map map){
        Object a = new Object();
        map.put(a, 1);
        return;
    }
    @Test
    public void testWeakMap(){
        Map map = new WeakHashMap<>();
        test2(map);
        Object a = new Object();
        map.put(a, 2);
        System.gc();

        int la = 2;

    }


    @Test
    public void ttt22(){
//        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
//        byte[] arr = byteBuffer.array();
//        int d = 2;
        File f = new File("../../abc").getAbsoluteFile();
        f.mkdirs();
        int d = (int) f.lastModified();
        int e = 1;
    }

}
