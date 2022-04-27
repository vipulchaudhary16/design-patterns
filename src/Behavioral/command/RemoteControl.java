package Behavioral.command;

public class RemoteControl {
    Command command;

    void setCommand(Command command){
        this.command = command;
    }

    void pressButton(){
        command.execute();
    }
}
