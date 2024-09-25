package src.flowControl.ifElse.KAKAGE;

public class Dog extends Animal {
    public String name;
    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println("DOG EAT");
    }
    @Override
    public void makeNoise() {
        System.out.println("DOG SAY WOOOF!");
    }
}
