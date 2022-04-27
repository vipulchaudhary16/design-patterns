package structural_design.fly_weight.vehicle;

import java.util.HashMap;

public class VehicleFactory {
    public static HashMap<VehicleType , Vehicle> objectContainer = new HashMap<>();

    public static Vehicle getVehicle( VehicleType type){
        Vehicle v = null;
        if(objectContainer.containsKey(type)){
            v = objectContainer.get(type);
        } else {
            switch (type){
                case CYCLE -> {
                    v = new Cycle();
                    System.out.println("Cycle Created");
                }
                case TRUCK -> {
                    v = new Truck();
                    System.out.println("Truck created");
                }
            }
        }
        objectContainer.put(type, v);
        return v;
    }
}
