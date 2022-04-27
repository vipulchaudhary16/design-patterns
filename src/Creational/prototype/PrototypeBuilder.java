package Creational.prototype;

import java.util.List;

public class PrototypeBuilder {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle v1 = new Vehicle();
        v1.insert();

        Vehicle v2 = (Vehicle) v1.Clone();

        List<String> v2VehicleList = v2.getVehicleList();

        v2VehicleList.add("Bugatti Veyron");


        System.out.println(v1.getVehicleList());
        System.out.println(v2.getVehicleList());

        v2VehicleList.remove("Dodge Viper");

        System.out.println(v2VehicleList);
        System.out.println(v1.getVehicleList());
        v2.modify();
    }
}
