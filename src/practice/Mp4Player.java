package practice;

import structural_design.adapter_design_pattern.player.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file " + fileName);
    }
}
