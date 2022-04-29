package Structural.facade.hotel_example;

import java.util.ArrayList;
import java.util.List;

public class VegAndNonVegRestaurant extends Hotel{

    @Override
    public List<String> getMenu() {
        List<String> list = new ArrayList<>();
        list.addAll(Menu.vegMenu);
        list.addAll(Menu.nonVegMenu);
        return list;
    }
}
