package Behavioral.command;

public class Demo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        SetTopBox setTopBox = new SetTopBox();

        remoteControl.setCommand(new SetTopBoxOnCmnd(setTopBox));
        remoteControl.pressButton();

        remoteControl.setCommand(new SetTopBoxOffCmnd(setTopBox));
        remoteControl.pressButton();

    }
}
