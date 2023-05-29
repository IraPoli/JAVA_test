package org.example.codingTasks;

import java.util.LinkedList;
import java.util.Set;

public final class ImmutableClass {
    private final   String name;
    private final int age;

    @Override
    public String toString() {
        return this.name +" "+ this.age+ " " + this.skills;
    }

    private final LinkedList<String> skills;

    public ImmutableClass(String name, int age, LinkedList<String> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public LinkedList<String> getSkills() {
        return new LinkedList<>(skills);
       // return this.skills; //  field can be chanced
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
