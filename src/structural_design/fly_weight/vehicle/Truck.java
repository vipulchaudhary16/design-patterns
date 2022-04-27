package structural_design.fly_weight.vehicle;

public class Truck implements Vehicle{
    int speedInKPH;
    String color;

    {
        speedInKPH = 160;
    }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {
        System.out.println(this.color + " coloured Truck with speed " +speedInKPH + "KPH started");
    }
}
