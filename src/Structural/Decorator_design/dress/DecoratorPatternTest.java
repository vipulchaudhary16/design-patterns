package Structural.Decorator_design.dress;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Dress sportsDress = new SportsDress(new BasicDress());
        sportsDress.assemble();
        System.out.println();
        Dress fancyDress = new FancyDress(new BasicDress());
        fancyDress.assemble();
        System.out.println();

        Dress casualDress = new CasualDress(new BasicDress());
        casualDress.assemble();
        System.out.println();
        Dress blackDress = new BlackColourDress(new BasicDress());
        blackDress.assemble();
        System.out.println();
        Dress sportsFancyDress = new SportsDress(new FancyDress(new BasicDress()));
        sportsFancyDress.assemble();
        System.out.println();
        Dress casualFancyDress = new CasualDress(new FancyDress(new BasicDress()));
        casualFancyDress.assemble();
        System.out.println();
        Dress blueCasualDress = new BlueColourDress(new CasualDress(new BasicDress()));
        blueCasualDress.assemble();
        System.out.println();
        Dress blackSportsFancyDress = new BlackColourDress(new SportsDress(new FancyDress(new BasicDress())));
        blackSportsFancyDress.assemble();
    }
}