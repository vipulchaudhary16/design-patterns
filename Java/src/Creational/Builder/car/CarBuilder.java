package Creational.Builder.car;

public class CarBuilder {
    String brand;
    Double mileage;
    String engine;
    int seats;
    Double price;
    String colour;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setMileage(Double mileage) {
        this.mileage = mileage;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public CarBuilder setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public Car getCar(){
        return new Car(brand , mileage , engine ,seats , price , colour);
    }
}
