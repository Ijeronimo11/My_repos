package Lesson7;

public class B {
	int id;
	int age;
	String name;
	double salary;
	String department;
		B(int id2, int age2, String name2) {
			this(id2, age2, name2, 0.0, null);			
		}
		B(int age3, String name3) {
			this(0, 28, name3, 0.0, null);
		}
		B(int id4, int age4, String name4, double salary4, String department4) {
			id = id4;
			age = age4;
			name = name4;
			salary = salary4;
			department = department4;
		}
	
	public static void main(String[] args) {
		B b1 = new B(1, 25, "CLOWN");
		B b2 = new B(55, "LOH");
		System.out.println(b2.age);
		B b3 = new B(2, 26, "VAS9|", 41.55, "IT");
		System.out.println(b3.department);
	}
}
























