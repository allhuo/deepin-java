package com.lizhangjun.D_建造者模式;

/**
 * 电脑产品
 */
public abstract class Computer {

    protected String cpu;
    protected String os;
    protected String cache;
    protected String board;
    protected String monitor;

    public Computer() {
    }

    abstract void setCpu(String cpu);
    abstract void setOs();
    abstract void setCache(String cache);
    abstract void setBoard(String board);
    abstract void setMonitor(String monitor);

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", os='" + os + '\'' +
                ", cache='" + cache + '\'' +
                ", board='" + board + '\'' +
                ", monitor='" + monitor + '\'' +
                '}';
    }
}
