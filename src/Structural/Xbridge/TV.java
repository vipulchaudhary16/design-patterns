package Structural.Xbridge;

public class TV implements Device{
    int volume;
    int channelNo;
    boolean isEnable;

    {
        volume = 50;
        channelNo = 1;
    }

    @Override
    public boolean isEnable() {
        return isEnable;
    }

    @Override
    public void enable() {
        isEnable = true;
    }

    @Override
    public void disable() {
        isEnable = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percentage) {
        this.volume = percentage;
    }

    @Override
    public int getChannel() {
        return channelNo;
    }

    @Override
    public void setChannel(int channel) {
        this.channelNo = channel;
    }

    @Override
    public String toString() {
        return "TV{" +
                "volume=" + volume +
                ", channelNo=" + channelNo +
                ", isEnable=" + isEnable +
                '}';
    }
}
