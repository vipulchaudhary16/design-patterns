package structural_design.Xbridge;

public interface Device {
    boolean isEnable();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percentage);
    int getChannel();
    void setChannel(int channel);
}
