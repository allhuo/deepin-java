package com.lizhangjun.D_建造者模式;

public class Main {

    public static void main(String[] args) {
        Builder builder = new MacComputerBuilder();
        Director director = new Director(builder);
        director.construct("intel i7", "三星8G内存条", "华硕主板", "voc液晶显示器");

        Computer build = builder.build();
        System.out.println(build.toString());
    }
}
