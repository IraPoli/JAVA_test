package org.example.putterns.behavioral.iterator.simpleIterator;

public class CollectionOfCar implements Container {
    public String[] cars = {"Reno","Nissan", "Volkswagen", "Toyota","Ford"};

    @Override
    public Iterator getIterator() {
        return new CollectionOfCarIterate() ;
    }



private class CollectionOfCarIterate implements Iterator{
    int i=0;
    @Override
    public boolean hasNext() {
        return i < cars.length;
    }
    @Override
    public Object next() {
        if(this.hasNext()){
            return cars[i++];
        }
        return null;
    }
}
}
