package com.lizhangjun.C_原型模式;

public class MacComputer extends Computer{

    public MacComputer() {
        setType("mac");
    }

    @Override
    void show() {
        System.out.println("这是苹果电脑！");
    }
}
