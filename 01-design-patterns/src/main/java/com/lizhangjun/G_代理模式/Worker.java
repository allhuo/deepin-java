package com.lizhangjun.G_代理模式;

public class Worker implements Computer{

    @Override
    public void give() {
        System.out.println("生产电脑");
    }
}
