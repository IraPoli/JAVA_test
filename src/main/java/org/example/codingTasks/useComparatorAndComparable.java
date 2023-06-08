package org.example.codingTasks;

import org.example.exceptions.ImproperAgeValueException;
import org.example.exceptions.Person;

import java.util.Arrays;

import static org.example.exceptions.Person.comparatorByName;

public class useComparatorAndComparable {
    public static void runComp() throws ImproperAgeValueException {
        Person[] personArr = new Person[4];
        personArr[0] = new Person(10,"bFirst");
        personArr[1] = new Person(5,"cSecond");
        personArr[2] = new Person(19,"dThird");
        personArr[3] = new Person(2,"aFourth");

        System.out.println(Arrays.toString(personArr));
    Arrays.sort(personArr);
        System.out.println(Arrays.toString(personArr));

        Arrays.sort(personArr,comparatorByName);
        System.out.println(Arrays.toString(personArr));

    }
}
