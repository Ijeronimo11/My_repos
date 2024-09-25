package Lesson7;

public class Employee {
	double salary;
	
	void dvoynayaZP() {
		double result = salary * 2;
		System.out.println("Новая ЗП = " + result);
	}
	
	Employee(double salary2) {
		salary = salary2;
	}

	
	public static void main(String[] args) {
		Employee emp = new Employee(500);
		System.out.println(emp.salary);
		emp.dvoynayaZP();
	}
}


