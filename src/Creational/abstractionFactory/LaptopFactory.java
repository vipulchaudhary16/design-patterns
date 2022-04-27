package Creational.abstractionFactory;

public class LaptopFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        return switch (deviceType) {
            case DELL -> new Dell("16", "512GB", "i9");
            case LENOVO -> new Lenovo("8", "256GB", "i7");
            default -> null;
        };
    }
}
