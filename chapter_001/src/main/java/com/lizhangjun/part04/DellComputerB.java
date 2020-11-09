package com.lizhangjun.part04;

/**
 * 戴尔A型电脑
 */
public class DellComputerB extends AbstractDellComputer {
    @Override
    void getCpu() {
        System.out.println("酷睿i5CPU");
    }

    @Override
    void getCache() {
        System.out.println("8GB内存");
    }
}
