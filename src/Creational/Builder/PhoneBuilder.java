package Creational.Builder;

public class PhoneBuilder {
    public String OS;
    public String processor;
    public int camera;
    public Double screenSize;

    public PhoneBuilder setOs(String os) {
        this.OS = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setScreenSize(Double ss) {
        this.screenSize = ss;
        return this;
    }

    public Phone getPhone() {
        return new Phone(OS, processor, screenSize, camera);
    }
}