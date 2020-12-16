package com.lizhangjun.H_适配器模式;

public class AviPlayer extends NewMediaPlayer{
    @Override
    void mp4() {

    }

    @Override
    void avi() {
        System.out.println("avi 播放器");
    }
}
