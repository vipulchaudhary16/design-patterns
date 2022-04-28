package Structural.facade.hotel_example;

import java.util.List;

public class VegRestaurant extends Hotel{

    @Override
    public List<String> getMenu() {
        return Menu.vegMenu;
    }
}
