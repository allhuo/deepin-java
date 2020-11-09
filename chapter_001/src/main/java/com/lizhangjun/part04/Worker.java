package com.lizhangjun.part04;


import com.lizhangjun.part03.AbstractComputerFactory;
import com.lizhangjun.part03.ComputerFactory;
import com.lizhangjun.part03.DellComputer;
import com.lizhangjun.part03.MacComputer;

/**
 * 泛型
 */
public class Worker {

    public static void main(String[] args) {
        //定义两条生产线
        AComputerFactory aComputerFactory = new AComputerFactory();
        BComputerFactory bComputerFactory = new BComputerFactory();

        //生产戴尔A型电脑
        aComputerFactory.createDellComputer();
        //生产苹果A型电脑
        aComputerFactory.createMacComputer();
        //生产戴尔B型电脑
        bComputerFactory.createDellComputer();
        //生产苹果B型电脑
        bComputerFactory.createMacComputer();
    }
}
