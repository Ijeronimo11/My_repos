package Lesson13;

public class Test1 {
	int grade;
		Test1(int grade) {
			this.grade = grade;
		}

	public static void main(String[] args) {
		Test1 tt = new Test1(3);
		switch(tt.grade) {
		case 2: 
			System.out.println("Студент двоечник");
			break;
		case 3: 
			System.out.println("Студент троечник");
			break;
		case 4:
			System.out.println("Студент хорошняк");
			break;
		case 5:
			System.out.println("Студент отличник");
			break;
			default: System.out.println("Оценка не верна");
		}
	}
}
