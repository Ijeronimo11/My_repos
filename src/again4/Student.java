package again4;

public class Student {
	int num;
	String firstname;
	String surname;
	int year;
	double srMath;
	double srEconomy;
	double srEnglish;

	public static void main(String[] args) {
		Student st1 = new Student();		
		Student st2 = new Student();
		Student st3 = new Student();
		
		st1.num = 893127;
		st1.firstname = "Antoha";
		st1.surname = "Cherykh";
		st1.year = 2024;
		st1.srMath = 3.89;
		st1.srEconomy = 3.84;
		st1.srEnglish = 4.71;
		
		st2.num = 957381;
		st2.firstname = "Serega";
		st2.surname = "Olshi4";
		st2.year = 2023;
		st2.srMath = 2.63;
		st2.srEconomy = 3.81;
		st2.srEnglish = 4.00;
		
		st3.num = 758403;
		st3.firstname = "Pavel";
		st3.surname = "Ignatiev";
		st3.year = 2022;
		st3.srMath = 2.98;
		st3.srEconomy = 3.62;
		st3.srEnglish = 2.14;
		
		double srST1 = (st1.srMath + st1.srEconomy + st1.srEnglish) / 3;
		double srST2 = (st2.srMath + st2.srEconomy + st2.srEnglish) / 3;
		double srST3 = (st3.srMath + st3.srEconomy + st3.srEnglish) / 3;
		
		System.out.println("Студент " + st1.firstname + " " + st1.surname + ", в " + st1.year + " году обучения имеет средний бал по оценкам равный " + srST1);
		System.out.println("Студент " + st2.firstname + " " + st2.surname + ", в " + st2.year + " году обучения имеет средний бал по оценкам равный " + srST2);
		System.out.println("Студент " + st3.firstname + " " + st3.surname + ", в " + st3.year + " году обучения имеет средний бал по оценкам равный " + srST3);
	}
}





































