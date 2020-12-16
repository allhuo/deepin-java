package com.lizhangjun.B_工厂方法模式;

public abstract class Computer {

    public void work(){
        System.out.println("电脑可以办公");
    }

    public void game(){
        System.out.println("电脑可以玩游戏");
    }

    public void music(){
        System.out.println("电脑可以听歌");
    }

    abstract void show();
}
