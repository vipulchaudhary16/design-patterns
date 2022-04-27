package Creational.abstractionFactory;

public class FactoryGenerator {
   public static AbstractDeviceFactory getFactory(FactoryType factoryType){
       return switch (factoryType) {
           case PHONEFACTORY -> new PhoneFactory();
           case LAPTOPFACTORY -> new LaptopFactory();
       };
   }
}
