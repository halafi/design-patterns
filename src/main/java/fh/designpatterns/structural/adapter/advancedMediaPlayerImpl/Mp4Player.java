package fh.designpatterns.structural.adapter.advancedMediaPlayerImpl;

import fh.designpatterns.structural.adapter.AdvancedMediaPlayer;

/**
 * Created by filip on 15.5.15.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
