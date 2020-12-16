package com.lizhangjun.H_适配器模式;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ filename);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("avi")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
