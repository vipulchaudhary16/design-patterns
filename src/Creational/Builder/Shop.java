package Creational.Builder;

public class Shop {
    public static void main(String[] args) {
        Phone p1 = new Phone("Android", "Snap Dragon", 4.8, 32);
        Phone p2 = new
                PhoneBuilder().setOs("Android").setCamera(64).setScreenSize(5.8).getPhone();
        System.out.println(p2.getPhoneDetails());
    }
}