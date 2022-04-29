package Structural.adapter_design_pattern.player;

public class VLCPLayer implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        System.out.println("Ohh Good Choice, Playing VLC file "+ fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
