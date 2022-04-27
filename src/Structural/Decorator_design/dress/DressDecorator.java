package Structural.Decorator_design.dress;

class DressDecorator implements Dress {
    protected Dress dress;

    public DressDecorator(Dress d) {
        this.dress = d;
    }

    public void assemble() {
        dress.assemble();
    }
}