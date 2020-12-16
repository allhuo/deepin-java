package com.lizhangjun.H_适配器模式;

public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp4", "test.mp4");
    }
}
