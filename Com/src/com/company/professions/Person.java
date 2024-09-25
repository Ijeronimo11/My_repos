package com.company.professions;

public class Person extends Driver {
    int age;
    public Person(String name, String surname, int drivingExperience, int age) {
        super(name, surname, drivingExperience);
        this.age = age;
    }
}
