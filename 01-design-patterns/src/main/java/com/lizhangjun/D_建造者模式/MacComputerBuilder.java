package com.lizhangjun.D_建造者模式;

public class MacComputerBuilder extends Builder {

    private Computer computer = new MacComputer();

    @Override
    void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    void buildOs() {
        computer.setOs();
    }

    @Override
    void buildCache(String cache) {
        computer.setCache(cache);
    }

    @Override
    void buildBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    void buildMonitor(String monitor) {
        computer.setMonitor(monitor);
    }

    @Override
    Computer build() {
        return computer;
    }
}
