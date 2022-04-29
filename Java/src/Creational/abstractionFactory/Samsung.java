package Creational.abstractionFactory;

public class Samsung extends Device{
    private final String modelName;
    private final long price;
    private final int ram;
    private final int Camera;
    private final int internalStorage;

    public Samsung(String modelName, long price, int ram, int camera, int internalStorage) {
        this.modelName = modelName;
        this.price = price;
        this.ram = ram;
        Camera = camera;
        this.internalStorage = internalStorage;
    }


    @Override
    public String getDetails() {
        return "Samsung Specifications are:"+
                "/n/t Model name is: "+this.modelName +
                "\n\t Price is: " + this.price +
                "\n\t Camera is: " + this.Camera+ " megapixels"+
                "\n\t Ram is: "+ this.ram + " GB"+
                "\n\t Internal storage is: "+this.internalStorage + " GB";
    }
}
