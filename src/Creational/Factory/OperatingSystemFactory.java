package Creational.Factory;

public class OperatingSystemFactory {
    public static os findOS(String str) {
        if (str.contains("Open") || str.contains("Easy") || str.contains("less costly")) {
            return new Android();
        } else if (str.contains("Closed") || str.contains("secured")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}