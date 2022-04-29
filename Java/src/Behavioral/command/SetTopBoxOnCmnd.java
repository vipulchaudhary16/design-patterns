package Behavioral.command;

public class SetTopBoxOnCmnd implements Command{
    SetTopBox setTopBox;

    public SetTopBoxOnCmnd(SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }


    @Override
    public void execute() {
        setTopBox.ON();
        setTopBox.setChannel(256);
        setTopBox.setVolume(69);
    }
}
