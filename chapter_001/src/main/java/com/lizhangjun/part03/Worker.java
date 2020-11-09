package com.lizhangjun.part03;


/**
 * 泛型
 */
public class Worker {

    public static void main(String[] args) {
        //声明富士康工厂
        AbstractComputerFactory foxconn = new ComputerFactory();
        //第一次生产苹果电脑
        System.out.println("------------------第一次生产--------------------");
        MacComputer macComputer = foxconn.createComputer(MacComputer.class);
        macComputer.getCpu();
        macComputer.getCache();
        macComputer.getOS();

        System.out.println("------------------第二次生产--------------------");
        //第二次生产戴尔电脑
        DellComputer dellComputer = foxconn.createComputer(DellComputer.class);
        dellComputer.getCpu();
        dellComputer.getCache();
        dellComputer.getOS();

    }
}
