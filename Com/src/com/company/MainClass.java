package com.company;
import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;

public class MainClass {
    public static void main(String[] args) {
        Engine engine = new Engine(4.33, "GMC");
        Driver driver = new Driver("PATRIARH", "KILL-REAL", 5);
        Car car = new Car("HUMMER", engine, driver, 244, "SPORT");
        String fullInfo = car.toString();
        System.out.println(fullInfo);
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();

        Car car2 = new Lorry("Грузовик SCANIA", engine, driver, 879, "HIGH WEIGHT", 2000);
        String lorryInfo = car2.toString();
        System.out.println(lorryInfo);
    }
}
