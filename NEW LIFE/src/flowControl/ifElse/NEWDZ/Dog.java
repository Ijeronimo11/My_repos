package src.flowControl.ifElse.NEWDZ;

public class Dog extends Animal {
    public String name;
    public int age;
    public Dog(String food, String location, String name, int age) {
        super(food, location);
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("DOG EAT");
    }
    @Override
    public void makeNoise() {
        System.out.println("DOG KRICHIT");
    }
}
