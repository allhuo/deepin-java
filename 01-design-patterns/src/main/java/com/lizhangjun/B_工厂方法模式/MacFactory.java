package com.lizhangjun.B_工厂方法模式;

public class MacFactory implements ComputerFactory{
    @Override
    public Computer getComputer() {
        return new DellComputer();
    }
}
