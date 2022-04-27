package practice;

import Structural.adapter_design_pattern.player.AdvancedMediaPlayer;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type){
        if (type.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        } else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String filename, String type) {
        if (type.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVLC(filename);
        } else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMP4(filename);
        }
    }
}
