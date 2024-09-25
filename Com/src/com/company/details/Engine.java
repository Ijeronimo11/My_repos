package com.company.details;

public class Engine {
    private double power;
    private String creator;

    public Engine(double power, String creator) {
        this.power = power;
        this.creator = creator;
    }
    public Engine() {
    }

    public double getPower() {
        return power;
    }
    public String getCreator() {
        return creator;
    }
}
