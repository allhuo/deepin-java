package com.lizhangjun.part05;

public abstract class AbstractComputerModel {

    //启动
    protected abstract void start();

    //进入启动界面
    protected abstract void show();

    //展示电脑桌面
    protected abstract void desktop();

    //关闭电脑模型
    protected abstract void shutdown();

    public void templateRun(){
        //step1: 启动电脑模型
        start();
        //step2: 进入启动界面
        show();
        //step3: 展示电脑桌面
        desktop();
        //step4: 关闭电脑模型
        shutdown();
    }
}
