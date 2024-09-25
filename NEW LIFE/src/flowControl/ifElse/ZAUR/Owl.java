package src.flowControl.ifElse.ZAUR;

public class Owl extends Animal {
    @Override
    public void eat() {
        System.out.println("Owl eat");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Owl sleep");
    }
}
