package Structural.Decorator_design.shape;

public class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    ShapeDecorator(Shape shape){
        decoratedShape = shape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
