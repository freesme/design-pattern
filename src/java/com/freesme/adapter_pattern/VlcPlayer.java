package com.freesme.adapter_pattern;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放Vlc格式"+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
