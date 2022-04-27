package practice;

public class Player implements MediaPlayer {

    @Override
    public void play(String filename, String type) {
        if (type.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3 file " + filename);
        } else if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            MediaAdapter adapter = new MediaAdapter(type);
            adapter.play(filename, type);
        } else {
            System.out.println("Not Supported");
        }
    }
}
