package com.lizhangjun.part02;

public class Teacher extends Person {

    public Teacher(){}

    public Teacher(String aName, String aSex) {
        super(aName, aSex);
    }

    public void teach(){
        System.out.println("上课！！");
    }
}
