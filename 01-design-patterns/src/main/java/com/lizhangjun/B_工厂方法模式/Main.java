package com.lizhangjun.B_工厂方法模式;

public class Main {

    public static void main(String[] args) {
        ComputerFactory factory = new DellFactory();
        Computer computer = factory.getComputer();
        computer.show();
        computer.work();
        computer.game();
        computer.music();
    }
}
