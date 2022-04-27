package structural_design.adapter_design_pattern.player;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String fileName, String fileType) {
        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 File Name: " + fileName);
        } else if (fileType.equalsIgnoreCase("vlc") || fileType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileName, fileType);
        } else {
            System.out.println("Invalid media. " + fileType + " is not supported");
        }
    }
}
