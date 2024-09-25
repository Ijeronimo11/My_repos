package src.flowControl.ifElse.NEWDZ;

public class Animal {
    public String food;
    public String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void eat() {
        System.out.println("Animal EAT");
    }
    public void sleep() {
        System.out.println("Animal SLEEP");
    }
    public void makeNoise() {
        System.out.println("Animal KRICHIT");
    }
}
