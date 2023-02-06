package org.example.overridind;



 public class Base {
    public String name;
    private final String lastName;
    private static  int age ;

     public Base(){
         this.lastName= "DefaultName";
         this.age = 100;

     }
    public Base(String lastName,int age){
        this.lastName= lastName;
        this.age = age;

    }

    public  Object print(){
        System.out.println("Base");
        return 1;
    }

    public String getLastName(){
        return lastName;
    }
    private void privateMethod(){
        System.out.println("This is private method");

    }

}
