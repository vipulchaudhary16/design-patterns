package structural_design.Decorator_design.dress;

class BlackColourDress extends DressDecorator {
    public BlackColourDress(Dress d) {
        super(d);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Black Colour to the Dress Added.");
    }
}