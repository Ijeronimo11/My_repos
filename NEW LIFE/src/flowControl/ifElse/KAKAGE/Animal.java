package src.flowControl.ifElse.KAKAGE;

public class Animal {
    public String food;
    public String location;
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void eat() {
        System.out.println("ANIMAL EAT");
    }
    public void sleep() {
        System.out.println("ANIMAL SLEEP");
    }
    public void makeNoise() {
        System.out.println("ANIMAL KRICHIT");
    }
}
