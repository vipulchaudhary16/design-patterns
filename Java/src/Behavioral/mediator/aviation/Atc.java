package Behavioral.mediator.aviation;

public class Atc implements IAtc{
    private Runway runway;
    private Flight flight;
    private boolean isAvailable;

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void setAvailability(Boolean availability) {
        this.isAvailable = availability;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
}
