package HOMEWORK;

public class Student {
	int nomer;
	String firstName;
	String lastName;
	double srMath;
	double srEconomy;
	double srEnglish;
	
	Student(int nomer2, String firstName2, String lastName2, double srMath2, double srEconomy2, double srEnglish2) {
		nomer = nomer2;
		firstName = firstName2;
		lastName = lastName2;
		srMath = srMath2;
		srEconomy = srEconomy2;
		srEnglish = srEnglish2;
	}
	
	Student(int nomer3, String firstName3, String lastName3) {
		this(nomer3, firstName3, lastName3, 0.0, 0.0, 0.0);
	}
	
	Student(double srMath4, double srEconomy4, double srEnglish4) {
		this(0, null, null, 9.31, 7.83, 8.11);
	}
	
	Student() {
		this(0, null, null, 0.0, 0.0, 0.0);
	}
	
	double srednee(Student st) {
		double kekw = (st.srMath + st.srEconomy + st.srEnglish) / 3;
		System.out.println("Студент " + st.firstName + " " + st.lastName + " с номером " + st.nomer + " имеет средний балл: " + kekw + ".");
		return kekw;
	}

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.nomer = 11111;
		st1.firstName = "ПЕРВЫЙ";
		st1.lastName = "СТУДЕНТ";
		st1.srMath = 7.31;
		st1.srEconomy = 9.41;
		st1.srEnglish = 5.41;
		st1.srednee(st1);
		
		Student st2 = new Student(22222, "ВТОРОЙ", "Студент");
		st2.srMath = 1.44;
		st2.srEconomy = 7.91;
		st2.srEnglish = 1.88;
		st2.srednee(st2);
		
		Student st3 = new Student(6.92, 5.51, 13.0);
		st3.nomer = 33333;
		st3.firstName = "ТРЕТИЙ";
		st3.lastName = "СТУДЕНТ";
		st3.srednee(st3);
		
	}
}



































