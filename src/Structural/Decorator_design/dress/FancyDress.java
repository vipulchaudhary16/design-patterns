package Structural.Decorator_design.dress;

class FancyDress extends DressDecorator {
    public FancyDress(Dress d) {
        super(d);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Fancy Dress Features Added.");
    }
}