package com.lizhangjun.D_建造者模式;

public class MacComputer extends Computer {

    @Override
    void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    void setOs() {
        this.os = "苹果操作系统";
    }

    @Override
    void setCache(String cache) {
        this.cache = cache;
    }

    @Override
    void setBoard(String board) {
        this.board = board;
    }

    @Override
    void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}
