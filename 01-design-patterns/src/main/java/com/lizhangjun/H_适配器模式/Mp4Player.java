package com.lizhangjun.H_适配器模式;

public class Mp4Player extends NewMediaPlayer{
    @Override
    void mp4() {
        System.out.println("MP4播放器");
    }

    @Override
    void avi() {

    }
}
