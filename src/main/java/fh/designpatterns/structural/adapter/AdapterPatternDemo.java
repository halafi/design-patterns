package fh.designpatterns.structural.adapter;

/**
 * Created by filip on 15.5.15.
 *
 * Object Adapter pattern works as a bridge between two incompatible interfaces.
 *
 * An object adapter depends on object composition.
 * A class adapter uses multiple inheritance to adapt one interface to another
 *
 * http://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
