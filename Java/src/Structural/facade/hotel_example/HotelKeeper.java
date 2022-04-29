package Structural.facade.hotel_example;

public class HotelKeeper {
    private final Hotel vegRestaurant;
    private final Hotel nonVegRestaurant;
    private final Hotel vegAndNonVegRestaurant;


    HotelKeeper(){
        vegRestaurant = new VegRestaurant();
        nonVegRestaurant = new NonVegRestaurant();
        vegAndNonVegRestaurant = new NonVegRestaurant();
    }

    public void getVegMenu(){
        System.out.println("In veg we have: ");
        for(String item : vegRestaurant.getMenu()){
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    public void getNonVegMenu(){
        System.out.println("In Non-veg we have: ");
        for(String item : nonVegRestaurant.getMenu()){
            System.out.print(item+ ", ");
        }
        System.out.println();
    }

    public void getMixedMenu(){
        System.out.println("Here is Non-veg and veg Menu");
        for(String item : vegAndNonVegRestaurant.getMenu()){
            System.out.print(item + ", ");
        }
        System.out.println();
    }




}
