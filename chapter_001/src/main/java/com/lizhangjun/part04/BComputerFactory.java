package com.lizhangjun.part04;

public class BComputerFactory extends AbstractComputerFactory{

    @Override
    public AbstractDellComputer createDellComputer() {
        return new DellComputerB();
    }

    @Override
    public AbstractMacComputer createMacComputer() {
        return new MacComputerB();
    }
}
