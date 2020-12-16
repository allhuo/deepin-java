package com.lizhangjun.P_命令模式;

public class Stock {

    private String name = "茅台";
    private int quantity = 10000;

    public void buy(){
        System.out.println("买入" + name + "股票"  + quantity + "股");
    }

    public void sell(){
        System.out.println("卖出" + name + "股票"  + quantity + "股");
    }
}
