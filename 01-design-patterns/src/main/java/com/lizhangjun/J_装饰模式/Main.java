package com.lizhangjun.J_装饰模式;

public class Main {

    public static void main(String[] args) {

        JinMaoDog jinMaoDog = new JinMaoDog();
        DogDecorator dogDecorator = new FlyDogDecorator(jinMaoDog);

        dogDecorator.jump();
    }
}
