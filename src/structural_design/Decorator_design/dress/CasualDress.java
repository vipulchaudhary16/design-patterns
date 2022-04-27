package structural_design.Decorator_design.dress;

class CasualDress extends DressDecorator {
    public CasualDress(Dress d) {
        super(d);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Casual Dress Features Added.");
    }
}