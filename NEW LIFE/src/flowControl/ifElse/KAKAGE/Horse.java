package src.flowControl.ifElse.KAKAGE;

public class Horse extends Animal {
    public String name;
    public Horse(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println("HORSE EAT");
    }
    @Override
    public void makeNoise() {
        System.out.println("HORSE RJET XD");
    }
}
