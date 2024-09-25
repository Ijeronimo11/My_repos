package src.flowControl.ifElse.FirstDz;

public class MainClass {
    public static void main(String[] args) {
        Student[]students = new Student[5];
        Student student1 = new Student("MIXA", "IT", 4.99, "Pavlov");
        Student student2 = new Aspirant("VOVA", "IT", 5, "IGNATIEV");
        Student student3 = new Student("IGOR", "PHILOSOPHY", 5, "IVANOV");
        Student student4 = new Aspirant("PASHA", "MATH", 3.94, "PETROV");
        Student student5 = new Student("SEREGA", "PHYSIC", 5, "OLSHICH");
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;

        System.out.println(students[0].getScholarship());
        System.out.println(students[1].getScholarship());
        System.out.println(students[2].getScholarship());
        System.out.println(students[3].getScholarship());
        System.out.println(students[4].getScholarship());

    }
}
