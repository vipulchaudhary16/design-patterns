package Behavioral.command;

public class SetTopBoxOffCmnd implements Command{
    SetTopBox setTopBox;

    public SetTopBoxOffCmnd(SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.OFF();

    }
}
