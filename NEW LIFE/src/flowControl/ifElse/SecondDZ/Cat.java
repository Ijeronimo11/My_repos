package src.flowControl.ifElse.SecondDZ;

public class Cat extends Animal {
    public String name;
    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println("CAT EAT");
    }
    @Override
    public void makeNoise() {
        System.out.println("CAT SAY MEOW");
    }
}
