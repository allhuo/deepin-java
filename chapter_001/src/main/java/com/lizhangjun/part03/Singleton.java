package com.lizhangjun.part03;

/**
 * 单例模式
 */
public class Singleton {

    private static Singleton singleton = null;

    //禁止使用构造方法生成对象
    private Singleton(){}

    /**
     * 线程不安全
     * @return singleton对象
     */
    public static Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    /**
     * 线程安全
     * @return singleton对象
     */
    public static synchronized Singleton getSingleton2(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
