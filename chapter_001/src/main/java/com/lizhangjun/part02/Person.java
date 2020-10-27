package com.lizhangjun.part02;

public class Person {

    private String name;

    private String sex;

    public Person() {
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void eat(){
        System.out.println("吃饭！");
    }

    public void sleep(){
        System.out.println("睡觉！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
