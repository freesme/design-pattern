package com.freesme.adapter_pattern;

//适配器类
public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;
    public MediaAdapter(String audioType){
        if (audioType.equals("vlc")){
            advanceMediaPlayer = new VlcPlayer();
        }else if (audioType.equals("mp4")){
            advanceMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        }else if (audioType.equals("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
