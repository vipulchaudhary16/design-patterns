package Creational.Builder.car;

public class Car {
    String brand;
    Double mileage;
    String engine;
    int seats;
    Double price;
    String colour;

    public Car(String brand , Double mileage , String engine , int seats , Double price , String colour){
        this.brand = brand;
        this.mileage = mileage;
        this.engine = engine;
        this.seats = seats;
        this.colour = colour;
        this.price = price;
    }

    public String getCarDetails(){
        return "Here is Your car details :\n" +
                "\t Brand: "+ brand +"\n"+
                "\t Mileage: "+ mileage +"\n"+
                "\t Engine specification: "+ engine +"\n"+
                "\t Total Seats: "+ seats +"\n"+
                "\t Car Color: "+ colour +"\n"+
                "\t Car Price: "+ price ;
    }
}
