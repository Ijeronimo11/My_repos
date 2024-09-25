package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String mark;
    private String classAuto;
    private int weight;
    private Driver driver = new Driver();
    private Engine engine = new Engine();
    public Car(String mark, Engine engine, Driver driver, int weight, String classAuto) {
        this.mark = mark;
        this.engine = engine;
        this.driver = driver;
        this.weight = weight;
        this.classAuto = classAuto;
    }

    public void start() {
        System.out.println("ПОЕХАЛИ");
    }
    public void turnRight() {
        System.out.println("ПОВОРОТ НАПРАВО");
    }
    public void turnLeft() {
        System.out.println("ПОВОРОТ НАЛЕВО");
    }
    public void stop() {
        System.out.println("ОСТАНАВЛИВАЕМСЯ");
    }
    public String toString() {
        return "Автомобиль марки: " + mark + ", класса: " + classAuto + ", с весом в: " + weight + " кг. Им управляет водитель: "+ driver.getName() + " " + driver.getSurname() + " с опытом вождения: " + driver.getDrivingExperience() + " лет" + ". У машины мощность: " + engine.getPower() + " и производитель: " + engine.getCreator() + ".";
    }
}
