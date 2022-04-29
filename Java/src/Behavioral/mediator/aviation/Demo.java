package Behavioral.mediator.aviation;

public class Demo {
    public static void main(String[] args) {
        IAtc mediator = new Atc();
        Runway runwayInAhmedabad = new Runway(mediator);

        Flight flightFromDelhi = new Flight(mediator);
        Flight flightFromMumbai = new Flight(mediator);

        mediator.registerFlight(flightFromDelhi);
        mediator.registerRunway(runwayInAhmedabad);

        System.out.print("Flight from Delhi\n\t-> ");
        flightFromDelhi.readyToLand();
        runwayInAhmedabad.land();
        System.out.print("Flight from Delhi \n\t-> ");
        flightFromDelhi.land();

        System.out.print("Flight from Mumbai \n\t-> ");
        flightFromMumbai.land();
        System.out.print("Flight from Delhi \n\t-> ");
        flightFromDelhi.parked();
        System.out.print("Flight from Mumbai \n\t-> ");
        flightFromMumbai.land();
    }
}
