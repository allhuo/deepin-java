package com.lizhangjun.E_单例模式;

public class Computer {

    private static Computer computer;

    private Computer(){

    }

    public static Computer getComputer(){
        if (computer == null){
            computer = new Computer();
        }
        return computer;
    }


    void show(){
        System.out.println("这是一台电脑");
    }
}
