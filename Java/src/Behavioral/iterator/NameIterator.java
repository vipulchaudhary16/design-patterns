package Behavioral.iterator;

public class NameIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            return index< NameCollection.names.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return NameCollection.names[index++];
            }
            return null;
        }
    }