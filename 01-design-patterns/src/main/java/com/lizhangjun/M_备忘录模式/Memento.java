package com.lizhangjun.M_备忘录模式;

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }


    public String getState() {
        return state;
    }

}
