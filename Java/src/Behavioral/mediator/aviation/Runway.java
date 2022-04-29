package Behavioral.mediator.aviation;

public class Runway implements Command{
    IAtc atcMediator;

    public Runway(IAtc atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        System.out.println("Runway is available for Running");
        atcMediator.setAvailability(true);
    }
}
