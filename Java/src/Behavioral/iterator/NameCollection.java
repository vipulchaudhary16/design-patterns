package Behavioral.iterator;

public class NameCollection implements Container{
    public static final String[] names ={"Here" , "We" , "Go", "Again"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


}
