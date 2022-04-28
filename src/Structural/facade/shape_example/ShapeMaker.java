package Structural.facade.shape_example;

public class ShapeMaker {
    private final Shape rectangle;
    private final Shape square;
    private final Shape circle;

    public ShapeMaker(){
        rectangle = new Rectangle();
        square = new Square();
        circle = new Circle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

}
