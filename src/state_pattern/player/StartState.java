package state_pattern.player;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Now Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
