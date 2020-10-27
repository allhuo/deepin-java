package com.lizhangjun.part01;

public class Test {

    public static void main(String[] args) throws Exception {

        RagDoll ragDoll = new RagDoll();

        System.out.println();

        //获取布偶猫的类名
        String className = ragDoll.getClass().getName();
        System.out.println(className);

        Class<?> aClass = Class.forName(className);
        System.out.println(aClass.getTypeName());

        System.out.println("-----------------------------------------");

        //通过布偶猫类名获取布偶猫实例
        Object object = Class.forName(className).getDeclaredConstructor().newInstance();
        //我们知道Object是所有类的超类，我们事先已经知道这是布偶猫，需要将实例进行类型转换（这里有可能会出现类型转换异常）
        RagDoll newRagDoll = (RagDoll)object;
        //它会抓鱼
        newRagDoll.catchFish();
        //它会吃鱼
        newRagDoll.eat();
        //它要睡觉
        newRagDoll.sleep();
    }
}
