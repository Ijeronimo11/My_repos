package CLOWN;

public class KEKW {
	public static void method(int a) {
		boolean b = true;
		int i = 1;
		while (b) {
			if (a == i) {
				b = false;
			}
			System.out.println(i + " * " + i + " = " + (i*i));
			i++;
		}		
	}

	public static void main(String[] args) {
		method(7);

	}
}

