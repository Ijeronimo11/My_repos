package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    int maxSpeed;
    public SportCar(String mark, Engine engine, Driver driver, int weight, String classAuto, int maxSpeed) {
        super(mark, engine, driver, weight, classAuto);
        this.maxSpeed = maxSpeed;
    }
}
