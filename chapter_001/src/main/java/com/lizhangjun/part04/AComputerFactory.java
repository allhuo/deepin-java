package com.lizhangjun.part04;

public class AComputerFactory extends AbstractComputerFactory{

    @Override
    public AbstractDellComputer createDellComputer() {
        return new DellComputerA();
    }

    @Override
    public AbstractMacComputer createMacComputer() {
        return new MacComputerA();
    }
}
