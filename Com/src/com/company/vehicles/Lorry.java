package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    int bodyLoadCapacity;
    public Lorry(String mark, Engine engine, Driver driver, int weight, String classAuto, int bodyLoadCapacity) {
        super(mark, engine, driver, weight, classAuto);
        this.bodyLoadCapacity = bodyLoadCapacity;
    }
}
