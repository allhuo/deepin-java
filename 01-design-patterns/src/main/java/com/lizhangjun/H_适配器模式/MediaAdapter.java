package com.lizhangjun.H_适配器模式;

public class MediaAdapter implements MediaPlayer{

    NewMediaPlayer newMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("avi") ){
            newMediaPlayer = new AviPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            newMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("avi") ){
            newMediaPlayer.avi();
        } else if (audioType.equalsIgnoreCase("mp4")){
            newMediaPlayer.mp4();
        }
    }
}
