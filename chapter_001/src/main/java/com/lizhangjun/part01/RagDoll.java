package com.lizhangjun.part01;

/**
 * 布偶猫
 */
public class RagDoll {

    /**
     * 名字
     */
    private String name;

    /**
     * 毛色
     */
    private String color;

    /**
     * 眼睛
     */
    private String eye;

    /**
     * 毛发
     */
    private String hair;

    public RagDoll() {
    }

    public RagDoll(String name, String color, String eye, String hair) {
        this.name = name;
        this.color = color;
        this.eye = eye;
        this.hair = hair;
    }

    /**
     * 吃饭
     */
    public void eat(){
        System.out.println("今天有小鱼干吗？");
    }

    /**
     * 睡觉
     */
    public void sleep(){
        System.out.println("我要睡觉，别吵我！");
    }

    /**
     * 抓鱼
     */
    public void catchFish(){
        System.out.println("捕鱼时间到了！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }
}
