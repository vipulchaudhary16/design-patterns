package Creational.prototype.shape_example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setId("1125");

        Rectangle rectangle = new Rectangle();
        rectangle.setId("4555");

        Shape clonedCircle = circle.clone();
        System.out.println(clonedCircle.toString());
    }
}
