package src.flowControl.ifElse.Student;

public class StudentService {
    public void method(Student[]st) {
        for (Student sttt: st) {
            if (sttt.avgRating == 5) {
                System.out.println("Нашли отличника: " + sttt.name);
            }
        }
    }
}
