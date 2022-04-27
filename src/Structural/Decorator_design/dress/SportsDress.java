package Structural.Decorator_design.dress;

class SportsDress extends DressDecorator {
    public SportsDress(Dress d) {
        super(d);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Sports Dress Features Added.");
    }
}