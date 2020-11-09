package com.lizhangjun.part05;

public class Client {

    public static void main(String[] args) {
        AbstractComputerModel model1 = new DellComputerModel();
        AbstractComputerModel model2 = new MacComputerModel();
        //展示模型
        model1.templateRun();
        model2.templateRun();
    }
}
