package src.flowControl.ifElse.FirstDz;

public class Aspirant extends Student {
    public Aspirant(String firstName, String group, double averageMark, String lastName) {
        super(firstName, group, averageMark, lastName);
        System.out.println("СОЗДАНА НАУЧНАЯ РАБОТА");
    }

    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
