package car;

public class ShowRoom {
    public static void main(String[] args) {
        Car myCar = new CarBuilder().setBrand("Skoda").setColour("Orange").setSeats(5).setEngine("1498cc").setMileage(18.0).getCar();
        System.out.println(myCar.getCarDetails());
    }
}
