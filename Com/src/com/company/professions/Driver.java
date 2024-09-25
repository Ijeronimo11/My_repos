package com.company.professions;

public class Driver {
    private String name;
    private String surname;
    private int drivingExperience;
    public Driver(String name, String surname, int drivingExperience) {
        this.name = name;
        this.surname = surname;
        this.drivingExperience = drivingExperience;
    }
    public Driver() {
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getDrivingExperience() {
        return drivingExperience;
    }
}
