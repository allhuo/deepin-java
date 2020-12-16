package com.lizhangjun.L_模板模式;

public abstract class Game {

    abstract void init();
    abstract void play();
    abstract void end();

    public final void run(){
        init();
        play();
        end();
    }
}
