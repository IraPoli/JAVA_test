package org.example.overridind;

public class Sub extends Base {
    public int[] arr = new int[5];
    public int[] arr2 = {10,325,23};

    public Sub(String lastName, int age) {
        super(lastName, age);
    }


    @Override
    public String print(){
        System.out.println("Sub");
        return new String("Sub");
    }
}
