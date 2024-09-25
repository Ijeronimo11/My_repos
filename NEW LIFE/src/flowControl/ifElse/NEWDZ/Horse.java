package src.flowControl.ifElse.NEWDZ;

public class Horse extends Animal {
    public String name;
    public int age;
    public Horse(String food, String location, String name, int age) {
        super(food, location);
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("HORSE EAT");
    }
    @Override
    public void makeNoise() {
        System.out.println("HORSE KRICHIT");
    }
}
