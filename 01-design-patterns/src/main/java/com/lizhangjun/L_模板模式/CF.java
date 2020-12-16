package com.lizhangjun.L_模板模式;

public class CF extends Game{
    @Override
    void init() {
        System.out.println("cf初始化");
    }

    @Override
    void play() {
        System.out.println("游戏运行中");
    }

    @Override
    void end() {
        System.out.println("游戏结束");
    }
}
