package com.lizhangjun.part06;

public class God {

    public static void main(String[] args) {
        HumanBuilder build = new HumanBuilder.Builder().skin("黄皮肤").hair("黑头发").face("国字脸").build();
        System.out.println(build.toString());
    }

}
