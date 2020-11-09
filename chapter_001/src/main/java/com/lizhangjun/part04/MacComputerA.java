package com.lizhangjun.part04;

/**
 * 戴尔A型电脑
 */
public class MacComputerA extends AbstractMacComputer {
    @Override
    void getCpu() {
        System.out.println("酷睿i3CPU");
    }

    @Override
    void getCache() {
        System.out.println("4GB内存");
    }
}
