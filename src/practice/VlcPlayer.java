package practice;

import structural_design.adapter_design_pattern.player.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file "+ fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
