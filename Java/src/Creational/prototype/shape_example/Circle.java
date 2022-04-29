package Creational.prototype.shape_example;

public class Circle extends Shape{

    public Circle(){
        type = "circle";
    }
    @Override
    void draw() {
        System.out.println("Drawing the Circle");
    }
}
