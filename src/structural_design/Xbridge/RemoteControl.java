package structural_design.Xbridge;

public class RemoteControl {
    protected Device device;

    RemoteControl(Device device){
        this.device = device;
    }

    void togglePower(){
        if(device.isEnable()){
            device.disable();
        }
        else
            device.enable();
    }

    void volumeDown(){
        device.setVolume(device.getVolume()-10);
    }

    void volumeUp(){
        device.setVolume(device.getVolume()+10);
    }

    void channelUp(){
        device.setChannel(device.getChannel()+1);
    }

    void channelDown(){
        device.setChannel(device.getChannel()-1);
    }

}
