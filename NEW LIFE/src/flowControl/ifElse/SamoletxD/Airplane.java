package src.flowControl.ifElse.SamoletxD;

public class Airplane {
    String producer;
    int year;
    double lenght;
    double weighth;
    int fuel;
    public Airplane(String producer, int year, double lenght, double weighth, int fuel) {
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weighth = weighth;
        this.fuel = fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + lenght + ", вес: " + weighth + ", топлива в баке: " + fuel);
    }
}
