package structural_design.Xbridge;

public class Client {
    public static void main(String... args) {
        TV tv = new TV();
//        RemoteControl remoteControl = new RemoteControl(tv);
//        remoteControl.togglePower();

        AdvanceRemoteControl advanceRemoteControl = new AdvanceRemoteControl(tv);
        advanceRemoteControl.togglePower();
        advanceRemoteControl.mute();
        advanceRemoteControl.channelUp();
        System.out.println(tv.toString());


    }
}
