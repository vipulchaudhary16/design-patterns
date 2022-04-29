package Behavioral.state_pattern.mobile_alert;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.alert();
        context.changeState(new Silent());
        context.alert();
    }
    
}