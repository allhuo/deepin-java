package com.lizhangjun.J_装饰模式;

public class JinMaoDog implements Dog{
    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void sleep() {
        System.out.println("睡");
    }

    @Override
    public void jump() {
        System.out.println("跳");
    }
}
