package Creational.singleton;

public class DataControlClass {
    public static void main(String[] args) {

        Singleton firstObject = Singleton.getSoleInstance();
        Singleton secondObject = Singleton.getSoleInstance();

        firstObject.setData(100);
        secondObject.setData(125);

        System.out.println("Before summing up data are " + firstObject.getData() + "," + secondObject.getData());

        secondObject.setData(2500);

        System.out.println("After summing up firstObject's data in secondObject's data");

        System.out.println("After summing up data are " + firstObject.getData() + "," + secondObject.getData());

        printHashcode("firstObject",firstObject);
        printHashcode("secondObject",secondObject);
    }

    public static void printHashcode(String objectName , Singleton object){
        System.out.printf("for Object %s Hashcode is %d\n" , objectName , object.hashCode());
    }

}
