package com.lizhangjun.part05;

public class MacComputerModel extends AbstractComputerModel{
    @Override
    protected void start() {
        System.out.println("按一下电源键启动！");
    }

    @Override
    protected void show() {
        System.out.println("显示苹果logo");
    }

    @Override
    protected void desktop() {
        System.out.println("显示苹果电脑自定义初始桌面");
    }

    @Override
    protected void shutdown() {
        System.out.println("按一下电源键关机！");
    }
}
