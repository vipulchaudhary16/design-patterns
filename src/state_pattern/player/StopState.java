package state_pattern.player;

public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Now player is in Stop State");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
