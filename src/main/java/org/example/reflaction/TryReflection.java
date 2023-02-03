package org.example.reflaction;

import org.example.overridind.Base;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TryReflection {
    public void test() throws IllegalAccessException, InvocationTargetException {
        System.out.println("Start");
        Base b = new Base("secret",44);
        Method[] methods = b.getClass().getDeclaredMethods();
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
    }
}
