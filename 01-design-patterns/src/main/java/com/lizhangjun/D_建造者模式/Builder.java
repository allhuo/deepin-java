package com.lizhangjun.D_建造者模式;

public abstract class Builder {

    abstract void buildCpu(String cpu);
    abstract void buildOs();
    abstract void buildCache(String cache);
    abstract void buildBoard(String board);
    abstract void buildMonitor(String monitor);
    abstract Computer build();
}
