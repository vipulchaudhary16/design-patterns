package Creational.Factory;

import java.util.Scanner;

public class MyOS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Requirement : ");
        String req = in.nextLine();
        in.close();

        os obj1 = OperatingSystemFactory.findOS(req);
        obj1.version();
        obj1.spec();
    }
}