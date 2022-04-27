package state_pattern.mobile_alert;

public class Context {
    private MobileAlertState state;

    Context() {
        this.state = new Ringing();
    }

    void changeState(MobileAlertState state) {
        this.state = state;
    }

    void alert() {
        state.alert();
    }
}