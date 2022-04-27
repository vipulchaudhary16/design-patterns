package Structural.adapter_design_pattern.player;

public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {

    }
    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file "+ fileName);
    }
}
