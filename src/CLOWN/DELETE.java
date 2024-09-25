package CLOWN;

public class DELETE {

	public static void main(String[] args) {
		int p, q;
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = 1; 
		q = 1;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (p--));
		
//		p = true;
//		q = false;
//		System.out.print(p + "\t" + q + "\t");
//		System.out.print((p&q) + "\t" + (p|q) + "\t");
//		System.out.println((p^q) + "\t" + (!p));
//		
//		p = false;
//		q = true;
//		System.out.print(p + "\t" + q + "\t");
//		System.out.print((p&q) + "\t" + (p|q) + "\t");
//		System.out.println((p^q) + "\t" + (!p));
//		
//		p = false;
//		q = false;
//		System.out.print(p + "\t" + q + "\t");
//		System.out.print((p&q) + "\t" + (p|q) + "\t");
//		System.out.println((p^q) + "\t" + (!p));
	}
}



















