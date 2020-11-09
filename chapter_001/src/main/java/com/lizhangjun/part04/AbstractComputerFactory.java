package com.lizhangjun.part04;

/**
 * 抽象工厂
 */
public abstract class AbstractComputerFactory {

    //生产戴尔电脑
    public abstract AbstractDellComputer createDellComputer();

    //生产苹果电脑
    public abstract AbstractMacComputer createMacComputer();
}
