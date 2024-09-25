package Lesson6;

public class overded {
	overded(int age2, String name2, String surname2, double salary2, String dep2) {
		age = age2;
		name = name2;
		surname = surname2;
		salary = salary2;
		dep = dep2;
	}
	
	overded(String name3, double salary2) {
		this(0, name3, null, salary2, null);
	}
	
	
	int age;
	String name;
	String surname;
	double salary;
	String dep;

	public static void main(String[] args) {
		
	}
}
































