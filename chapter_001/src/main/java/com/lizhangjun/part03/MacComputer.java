package com.lizhangjun.part03;

public class MacComputer implements Computer{
    @Override
    public void getCpu() {
        System.out.println("四核八线程！！！");
    }

    @Override
    public void getCache() {
        System.out.println("4GB内存");
    }

    @Override
    public void getOS() {
        System.out.println("苹果操作系统！");
    }
}
