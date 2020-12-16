package com.lizhangjun.A_简单工厂模式;

public class Main {

    public static void main(String[] args) {
        //获取一台mac
        ComputerFactory factory = new ComputerFactory();
        Computer mac = factory.getComputer("mac");
        //查看mac
        mac.show();
    }
}
