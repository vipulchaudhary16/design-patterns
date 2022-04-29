package Behavioral.mediator.aviation;

public interface IAtc {
    void registerFlight(Flight flight);
    void registerRunway(Runway runway);
    void setAvailability(Boolean availability);
    boolean isAvailable();
}
