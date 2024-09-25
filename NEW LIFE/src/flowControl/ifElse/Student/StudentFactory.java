package src.flowControl.ifElse.Student;

public class StudentFactory {
    public void CreateStudentsArray() {
        StudentService studentService = new StudentService();
        Student[] students = new Student[6];
        students[0] = new Student("AHTOH", 5);
        students[1] = new Student("PASHA", 3.94);
        students[2] = new Student("VOVA", 4.11);
        students[3] = new Student("MISHA", 2.96);
        students[4] = new Student("ANDREI", 5);
        students[5] = new Student("IGOR", 3.51);

        studentService.method(students);
    }
}
