package Lesson5;

public class Employee {
	int id;
	String surname;
	int age;
	double salary;
		Employee(int id2, String surname2, double salary2) {
			id = id2;
			surname = surname2;
			salary = salary2;
		}
		double uvelichenieZP(Employee emp) {
			double kekw = emp.salary * 2;
			System.out.println(emp.surname + "ZP: " + kekw);
			return kekw;
		}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "ANTOHA", 50.50);
		emp1.uvelichenieZP(emp1);
		
		Employee emp2 = new Employee(2, "VAL9|", 25.50);
		emp2.uvelichenieZP(emp2);
	}
}










































