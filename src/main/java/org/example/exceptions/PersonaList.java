package org.example.exceptions;

import org.example.annotaions.Important;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Important
public class PersonaList {
    private List<Person> personList;

    public PersonaList() {
        this.personList = new ArrayList<>();
    }


    public boolean getPersonsFromFile(String path) {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
                String[] personData = br.readLine().split("_");
                Person tempPersone = new Person(Integer.parseInt(personData[1]), personData[0]);
                this.personList.add(tempPersone);
            }
        } catch (Exception e) {
            System.out.println("catch exception : " + e);
        }

        return true;

    }

    public Person getPersonByIndex(int i) {
        return personList.get(i);
    }

    @Override
    public String toString() {
        StringBuilder newString = new StringBuilder("All persons data : ");
        for (Person person : this.personList) {
            newString.append("Name - ").append(person.name).append("Age - ").append(person.age).append(";");
        }
        return newString.toString();
    }


}
