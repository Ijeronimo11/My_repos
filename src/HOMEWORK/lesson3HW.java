package HOMEWORK;

public class lesson3HW {

	public static void main(String[] args) {
		int a = 5;
		int b = a-- - --a + ++a + a++ + a;
		System.out.println(b);
		System.out.println(a);
		
		int c = 8;
		int d = ++b -b++ + ++b - --b;
		System.out.println(d);
		System.out.println(c);
	}

}
