package Behavioral.command;

public class SetTopBox {
    void ON(){
        System.out.println("SetTopBox is on");
    }

    void OFF(){
        System.out.println("SetTopBox is off");
    }

    void setChannel(int defaultChanel){
        System.out.println("Set top box is set to channel "+ defaultChanel);

    }

    void setVolume(int volume){
        System.out.println("Set top box's volume is set to "+ volume);

    }
}
