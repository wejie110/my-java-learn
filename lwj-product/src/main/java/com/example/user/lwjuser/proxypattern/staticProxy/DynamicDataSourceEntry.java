package com.example.user.lwjuser.proxypattern.staticProxy;


/**
 * @author wejie
 */
public class DynamicDataSourceEntry {
    public static final String DEFAULT_SOURCE = null;
    public static final ThreadLocal<String> local = new ThreadLocal<>();
    private DynamicDataSourceEntry(){}

    //清空数据源
    public static void clear(){
        local.remove();
    }

    //获取当前正在使用的数据源名称
    public static String get(){
        return local.get();
    }

    //还原到当前切换的数据源
    public static void reSet(){
        local.set(DEFAULT_SOURCE);
    }

    //设置已知名称的数据源
    public static void set(String source){
        local.set(source);
    }

    //根据年份动态设置数据源
    public static void set(int year){
        local.set("db_"+year);
    }

}
