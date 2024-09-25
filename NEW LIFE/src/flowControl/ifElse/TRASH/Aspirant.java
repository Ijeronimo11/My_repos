package src.flowControl.ifElse.TRASH;

public class Aspirant extends Student {
    public Aspirant(String firstName, String group, double averageMark, String lastName) {
        super(firstName, group, averageMark, lastName);
        System.out.println("СОЗДАНА НАУЧНАЯ РАБОТА");
    }

//    public void createNewProject() {
//        System.out.println("НАУЧНАЯ РАБОТА СОЗДАНА");
//    }

    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
