package Structural.facade.hotel_example;

public class Client {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeper();

        hotelKeeper.getVegMenu();

        hotelKeeper.getNonVegMenu();

        hotelKeeper.getMixedMenu();
    }
}
