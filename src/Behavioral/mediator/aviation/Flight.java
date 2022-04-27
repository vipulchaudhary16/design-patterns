package Behavioral.mediator.aviation;

public class Flight implements Command{
    IAtc atcMediator;

    public Flight(IAtc iAtcMediator) {
        this.atcMediator = iAtcMediator;
    }

    @Override

    public void land() {
        if(atcMediator.isAvailable()){
            System.out.println("Landed successfully");
            atcMediator.setAvailability(false);
        } else{
            System.out.println("Waiting for runway");
        }
    }

    public void readyToLand(){
        System.out.println("Landing initiated");
    }

    public void parked(){
        System.out.println("The flight has been parked runway is available now");
        atcMediator.setAvailability(true);
    }
}
