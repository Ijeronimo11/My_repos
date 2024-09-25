package src.flowControl.ifElse.TRASH;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public Student(String firstName, String group, double averageMark, String lastName) {
        this.firstName = firstName;
        this.group = group;
        this.averageMark = averageMark;
        this.lastName = lastName;
    }

    public int getScholarship() {
        if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
