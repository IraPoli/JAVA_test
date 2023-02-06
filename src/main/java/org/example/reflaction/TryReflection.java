package org.example.reflaction;

import org.example.overridind.Base;


import java.lang.reflect.*;

public class TryReflection {
    public void test() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        System.out.println("Start");
        Base b = new Base("secret",44);
        Class<?> BClass =  b.getClass();
        Method[] methods = BClass.getDeclaredMethods();
        Field[] f = b.getClass().getDeclaredFields();
        for (var field: f){
            System.out.println("field - "+  field.getName());
            if (field.getName().contains("lastName")){
                field.setAccessible(true);
                field.set(b,"NewName");
            }

        }

            System.out.println("New field lastName - "+  b.getLastName());


        for (var method: methods){
            if (method.getName().equals("privateMethod")){
                method.setAccessible(true);
                method.invoke(b);
            }

        }

        Class<?> bClass = b.getClass();
        int classModifiers= bClass.getModifiers();
        Constructor<?> constructor = bClass.getConstructor();
        System.out.println("modifier class b - " + Modifier.isPublic(classModifiers));


        //create new obj
       // Object myObject =   bClass.newInstance("Vadim", 90); //deprecated
        Object myObject1 =   constructor.newInstance();
        System.out.println(myObject1);


    }
}
