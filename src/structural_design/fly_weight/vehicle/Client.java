package structural_design.fly_weight.vehicle;

public class Client {
    public static void main(String[] args) {
       Vehicle cycle = VehicleFactory.getVehicle(VehicleType.CYCLE);
       cycle.assignColor("Red");
       cycle.startEngine();

       Vehicle truck = VehicleFactory.getVehicle(VehicleType.TRUCK);
       truck.assignColor("Red-Black");
       truck.startEngine();

       Vehicle secCycle = VehicleFactory.getVehicle(VehicleType.CYCLE);
       secCycle.assignColor("Blue");
       secCycle.startEngine();
    }
}
