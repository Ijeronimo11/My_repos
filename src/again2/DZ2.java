package again2;

public class DZ2 {

	public static void main(String[] args) {
		byte a1 = 12;
		byte a2 = 0b1100;  //двоичная
		byte a3 = 014;     //восьмеричная
		byte a4 = 0xC;     //16ричная
		
		short s1 = -1300;
		short s2 = -0b10100010100;
		short s3 = -02424;
		short s4 = -0x514;
		
		int i1 = 0;
		int i2 = 0b0;
		int i3 = 00;
		int i4 = 0x0;
		
		long l1 = 123456789L;
		long l2 = 0b111010110111100110100010101L;
		long l3 = 0726746425L;
		long l4 = 0x75BCD15L;
		System.out.println(a4 + " = байт в 16");
		System.out.println(s4 + " = шорт в 16");
		System.out.println(i4 + " инт в 16");
		System.out.println(l4 + " = лонг в 16");
		System.out.println();
		System.out.println();
		
		float f1 = 7.1f;
		float f2 = 14.55f;
		
		double d1 = 1.51;
		double d2 = 5.5;
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("Флоат f1 = " + f1);
		System.out.println("Флоат f2 = " + f2);
		
		System.out.println();
		
		System.out.println("Дабл d1 = " + d1);
		System.out.println("Дабл d2 = " + d2);
		
		System.out.println();
		
		System.out.println("Булеан b1 = " + b1);
		System.out.println("Булеан b2 = " + b2);
		
		System.out.println();
		System.out.println();
		
		char c1 = 'Ж';
		char c2 = 164;
		char c3 = '\u0144';
		System.out.println("Просто чар = " + c1);
		System.out.println("10ричный чар '164' = " + c2);
		System.out.println("16ричный чар = " + c3);
	}

}























































