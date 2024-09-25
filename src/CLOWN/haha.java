package CLOWN;

public class haha {
	public static void email(String text) {
		int a = 0; // @
		int b = 0; // .
		int c = 0; // ;
		while (c < text.length()-1) {
			a = text.indexOf('@', c);
			b = text.indexOf('.', c);
			c = text.indexOf(';', c + 1);
			System.out.println(text.substring(a + 1, b));
		}
	}

	public static void main(String[] args) {
		email("ya@yandex.ru; on@mail.ru; ona@yahoo.com;");
	}
}



//ya@yandex.ru; on@mail.ru; ona@yahoo.com;