package org.example.annotaions;

import org.example.exceptions.ImproperAgeValueException;
import org.example.exceptions.Person;
import org.example.exceptions.PersonaList;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RunAnnotation {
    public static void start() throws InvocationTargetException, IllegalAccessException, ImproperAgeValueException {

        Person myPerson = new Person(33, "Oleg");

        // check for annotation at class
        if (myPerson.getClass().isAnnotationPresent(Important.class)) {
            System.out.println("important class");
        }

        // invoke method with annotation
        Method[] methods = myPerson.getClass().getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(RunNow.class)) {
                RunNow annotation = m.getAnnotation(RunNow.class);
                for (int i = 0; i < annotation.times(); i++) {
                    m.invoke(myPerson);
                }
            }
        }

        //change object variable value with reflection  with annotation
        Field[] fields = myPerson.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(IString.class)) {
                field.setAccessible(true);
                field.set(myPerson, "Surprise");
            }


//print object variable value  with annotation
            if (field.isAnnotationPresent(IString.class)) {
                Object objectValue = field.get(myPerson);
                if (objectValue instanceof String stringValue) {
                    System.out.println("it is String  - " + stringValue);
                }
            }

            //get all annotation
            var annotations = PersonaList.class.getDeclaredAnnotations();
            System.out.println("Annotations of class PersonaList - " + Arrays.toString(annotations));
        }

        myPerson.printInfo();
    }
}
