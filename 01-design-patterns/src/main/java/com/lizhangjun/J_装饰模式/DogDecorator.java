package com.lizhangjun.J_装饰模式;

public abstract class DogDecorator implements Dog{

    protected  Dog dog;

    public DogDecorator(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void eat() {
        dog.eat();
    }

    @Override
    public void sleep() {
        dog.sleep();
    }

    @Override
    public void jump() {
        dog.jump();
    }
}
