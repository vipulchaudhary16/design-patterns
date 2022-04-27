package state_pattern.mobile_alert;

public class Ringing implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("Mobile is in Ringing mode");
    }
}