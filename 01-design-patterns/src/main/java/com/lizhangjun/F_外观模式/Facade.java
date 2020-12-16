package com.lizhangjun.F_外观模式;

/**
 * 外观类
 */
public class Facade {
    DellComputer dellComputer;
    MacComputer macComputer;
    HpComputer hpComputer;

    public Facade() {
        dellComputer = new DellComputer();
        macComputer = new MacComputer();
        hpComputer = new HpComputer();
    }

    public void showDell(){
        dellComputer.show();
    }

    public void showMac(){
        macComputer.show();
    }

    public void showHp(){
        hpComputer.show();
    }
}
