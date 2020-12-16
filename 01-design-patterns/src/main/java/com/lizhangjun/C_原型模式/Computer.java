package com.lizhangjun.C_原型模式;

public abstract class Computer implements Cloneable{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract void show();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        clone = super.clone();
        return clone;
    }
}
