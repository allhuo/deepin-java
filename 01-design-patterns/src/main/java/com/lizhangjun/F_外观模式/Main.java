package com.lizhangjun.F_外观模式;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.showDell();
        facade.showHp();
        facade.showMac();
    }
}
