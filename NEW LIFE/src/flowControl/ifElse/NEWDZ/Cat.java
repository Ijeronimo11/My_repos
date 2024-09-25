package src.flowControl.ifElse.NEWDZ;

public class Cat extends Animal {
    public String name;
    public int age;
    public Cat(String food, String location, String name, int age) {
        super(food, location);
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("CAT EAT");
    }
    @Override
    public void makeNoise() {
        System.out.println("CAT KRICHIT");
    }
}
