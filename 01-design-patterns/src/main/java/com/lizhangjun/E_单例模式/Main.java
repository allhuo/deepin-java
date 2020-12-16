package com.lizhangjun.E_单例模式;

public class Main {

    public static void main(String[] args) {

        Computer computer = Computer.getComputer();

        computer.show();
    }
}
