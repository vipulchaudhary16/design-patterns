package structural_design.fly_weight.vehicle;

public class Cycle implements Vehicle {

    String color;
    int speedInKPH;

    {
        speedInKPH = 20;
    }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {
        if (color == null) {
            System.out.println("Please set color before starting engine");
        } else {

            System.out.println(this.color + " coloured Cycle with speed " + speedInKPH + "KPH started");
        }

    }
}
