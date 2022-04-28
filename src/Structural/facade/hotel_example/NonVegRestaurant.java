package Structural.facade.hotel_example;

import java.util.List;

public class NonVegRestaurant extends Hotel{

    @Override
    public List<String> getMenu() {
        return Menu.nonVegMenu;
    }
}
