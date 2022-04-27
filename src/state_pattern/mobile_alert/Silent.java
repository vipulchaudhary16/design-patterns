package state_pattern.mobile_alert;

public class Silent implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println("Mobile is in silent mode");
    }
    
}