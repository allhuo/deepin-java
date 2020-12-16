package com.lizhangjun.C_原型模式;

public class DellComputer extends Computer {

    public DellComputer() {
        setType("dell");
    }

    @Override
    public void show() {
        System.out.println("这是戴尔电脑");
    }
}
