package Creational.prototype.shape_example;

public class Rectangle extends Shape{
    public Rectangle(){
        type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing the rectangle");
    }
}
