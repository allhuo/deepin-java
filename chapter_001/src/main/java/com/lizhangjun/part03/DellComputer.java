package com.lizhangjun.part03;

public class DellComputer implements Computer{

    @Override
    public void getCpu() {
        System.out.println("6核12线程！！！");
    }

    @Override
    public void getCache() {
        System.out.println("8GB内存");
    }

    @Override
    public void getOS() {
        System.out.println("windows10操作系统");
    }
}
