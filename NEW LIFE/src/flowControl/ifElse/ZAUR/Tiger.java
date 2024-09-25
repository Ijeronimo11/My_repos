package src.flowControl.ifElse.ZAUR;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eat");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Tiger sleep");
    }

    public void hunt() {
        System.out.println("Tiger hunt");
    }
}
