package Lesson6;

public class HomeworkL6 {
	int method() {
		int result = 0 + 0;
		System.out.println("Сумма равняется: " + result + ".");
		return result;
	}
	
	int method(int a) {
		int result2 = a + a;
		System.out.println("Сумма равняется: " + result2 + ".");
		return result2;
	}
	
	int method(int a, int b) {
		int result3 = a + b;
		System.out.println("Сумма равняется: " + result3 + ".");
		return result3;
	}
	
	int method(int a, int b, int c) {
		int result4 = a + b + c;
		System.out.println("Сумма равняется: " + result4 + ".");
		return result4;
	}
	
	int method(int a, int b, int c, int d) {
		int result5 = a + b + c + d;
		System.out.println("Сумма равняется: " + result5 + ".");
		return result5;
	}
		
	public static void main(String[] args) {
		HomeworkL6 hw = new HomeworkL6();
		hw.method();
		hw.method(1);
		hw.method(1, 2);
		hw.method(1, 2, 3);
		hw.method(1, 2, 3, 4);
		//hw.method(1, 2, 3, 4, 5); - Нету метода для пяти чисел!
	}
}
