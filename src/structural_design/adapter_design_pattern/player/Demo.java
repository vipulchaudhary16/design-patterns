package structural_design.adapter_design_pattern.player;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File name you want to play");
        String fileName = sc.nextLine();

        //for getting file type from file name
        int i = 0;
        while (fileName.charAt(i) != '.')
            i++;
        String fileType = fileName.substring(i + 1);

        //playing file
        player.play(fileName, fileType);
    }
}

