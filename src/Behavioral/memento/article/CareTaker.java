package Behavioral.memento.article;

import java.util.ArrayList;

public class CareTaker {
    private final ArrayList<Memento> list = new ArrayList<>();

    public void addIntoList(Memento memento) {
        list.add(memento);
    }

    public Memento getFromList(int index) {
        return list.get(index);
    }
}
