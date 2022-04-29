package Creational.abstractionFactory;

public class Client {
    public static void main(String[] args) {
        Device SAMSUNG = FactoryGenerator.getFactory(FactoryType.PHONEFACTORY).getGadget(DeviceType.SAMSUNG);
        System.out.println(SAMSUNG.getDetails());

        Device DELL = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
        System.out.println(DELL.getDetails());

        Device Lenovo = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.LENOVO);
    }
}
