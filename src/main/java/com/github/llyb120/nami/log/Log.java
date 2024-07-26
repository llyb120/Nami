package com.github.llyb120.nami.log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd HH:mm:ss");

    public static void warn(String msg, Object ...args){
        preLog();
        System.out.print("[33m");
        log(msg, args);
        afterLog();
    }

    public static void error(String msg, Object ...args){
        preLog();
        System.out.print("[31m");
        log(msg, args);
        afterLog();
    }

    public static void debug(String msg, Object ...args){
        preLog();
        System.out.print("[35m");
        log(msg, args);
        afterLog();
    }

    public static void info(String msg, Object ...args){
        preLog();
        System.out.print("[34m");
        log(msg, args);
        afterLog();
    }

    private static void log(String msg, Object ...args){
        String time = LocalDateTime.now().format(dateTimeFormatter);
        System.out.print("[INFO] ["+ time + "] ["+Thread.currentThread().getName()+"] ");
        System.out.printf(msg, args);
    }

    private static void preLog(){
        System.out.print("\033");
    }

    private static void afterLog(){
        System.out.println("\033[0m");
    }
}
