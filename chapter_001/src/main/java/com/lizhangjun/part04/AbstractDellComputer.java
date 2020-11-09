package com.lizhangjun.part04;

public abstract class AbstractDellComputer {

    /**
     * 电脑cpu
     */
    abstract void getCpu();

    /**
     * 电脑内存
     */
    abstract void getCache();

    /**
     * 电脑操作系统
     */
    void getOS(){
        System.out.println("预装windows10操作系统");
    }
}
