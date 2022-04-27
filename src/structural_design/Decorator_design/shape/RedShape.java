package structural_design.Decorator_design.shape;

public class RedShape extends ShapeDecorator {

    RedShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        addRedBorder(decoratedShape);
    }

    private void addRedBorder(Shape decoratedShape){
        System.out.println("Border color : red");
    }
}
