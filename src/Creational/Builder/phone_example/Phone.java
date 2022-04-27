package Creational.Builder.phone_example;

public class Phone {
    public String OS;
    public String processor;
    public int camera;
    public Double screenSize;

    public Phone(String OS, String processor, Double screenSize, int camera) {
        this.OS = OS;
        this.processor = processor;
        this.screenSize = screenSize;
        this.camera = camera;
    }

    public String getPhoneDetails() {
        return "Phone OS = " + OS + ", Processor = " + processor + ", ScreenSize : " +
                screenSize + ", Camera : " + camera;
    }
}