package com.lizhangjun.D_建造者模式;

public class Director {

    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String cpu, String cache, String board, String monitor){
        builder.buildCpu(cpu);
        builder.buildCache(cache);
        builder.buildBoard(board);
        builder.buildMonitor(monitor);
    }
}
