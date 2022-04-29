package Creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {
    private List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<>();
    }

    public Vehicle(List<String> list) {
        this.vehicleList = list;
    }

    public void insert(){
        vehicleList.add("Maruti");
        vehicleList.add("Chevrolet Corvette");
        vehicleList.add("Dodge Viper");
        vehicleList.add("Lamborghini Countach");
        vehicleList.add("Shelby Cobra");
    }

    public void modify(){
        String s = this.vehicleList.get(0);
        System.out.println(s);
    }

    public List<String> getVehicleList(){
        return this.vehicleList;
    }

    public Object Clone() {
        ArrayList<String> tempList = new ArrayList<>(this.vehicleList);
        return new Vehicle(tempList);
    }
}
