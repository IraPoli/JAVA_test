package org.example;

public class My  implements Cloneable{
    @Override
    public String toString(){
        return this.name;
    }
    int i;
    String name;
    My(){
        this.i = 2;
        this.name = "Name+" +1;
    }

    My(int number){
        this.i = number;
        this.name = "Name+" +1;
    }
    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }
}
