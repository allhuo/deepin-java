package com.lizhangjun.J_装饰模式;

public class FlyDogDecorator extends DogDecorator{

    public FlyDogDecorator(Dog dog) {
        super(dog);
    }

    @Override
    public void jump() {
        fly();
        super.jump();

    }

    void fly(){
        System.out.println("飞");
    }
}
