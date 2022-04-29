package Creational.Factory;

public class Windows implements os {
    public void version() {
        System.out.println("Last Version: 8.1");
    }

    public void spec() {
        System.out.println("I am Outdated");
    }
}