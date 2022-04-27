package structural_design.Decorator_design.dress;

class BlueColourDress extends DressDecorator {
    public BlueColourDress(Dress d) {
        super(d);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Blue Colour to the Dress Added.");
    }
}