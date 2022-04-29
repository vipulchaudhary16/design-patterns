package Creational.abstractionFactory;

public class Dell extends Device {
    private final String Ram;
    private final String SSD;
    private final String Processor;

    public Dell(String ram, String SSD,String processor) {
        this.Ram = ram;
        this.SSD = SSD;
        this.Processor = processor;
    }

    @Override
    public String getDetails() {
        return "Dell Laptop Specification:" +
                "\n\tRam is " + this.Ram +
                "\n\tGB and Processor is " + this.Processor +
                "\n\tSSD = " + this.SSD;
    }
}
