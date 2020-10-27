package com.yacoso.part02;

import com.yacoso.part02.Person;

public class Teacher extends Person {

    public Teacher(){}

    public Teacher(String aName, String aSex) {
        super(aName, aSex);
    }

    public void teach(){
        System.out.println("上课！！");
    }
}
