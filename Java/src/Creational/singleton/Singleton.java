package Creational.singleton;

public class Singleton {
    private static final Singleton soleInstance = new Singleton();
    private int data;

    private Singleton(){
        System.out.println("Singleton created");
    }

    public static Singleton getSoleInstance() {
        return soleInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
