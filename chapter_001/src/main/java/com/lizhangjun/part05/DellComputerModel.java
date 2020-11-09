package com.lizhangjun.part05;

public class DellComputerModel extends AbstractComputerModel{
    @Override
    protected void start() {
        System.out.println("长按电源键启动！");
    }

    @Override
    protected void show() {
        System.out.println("显示戴尔logo");
    }

    @Override
    protected void desktop() {
        System.out.println("显示戴尔电脑自定义初始桌面");
    }

    @Override
    protected void shutdown() {
        System.out.println("长按电源键关机！");
    }
}
