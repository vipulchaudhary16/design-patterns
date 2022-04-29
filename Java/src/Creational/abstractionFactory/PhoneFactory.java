package Creational.abstractionFactory;

public class PhoneFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        return switch (deviceType) {
            case SAMSUNG -> new Samsung("M31", 17000, 6, 64, 64);
            case ONEPLUS -> new Oneplus("Norde CE", 24999, 8, 64, 128);
            default -> null;
        };
    }
}
