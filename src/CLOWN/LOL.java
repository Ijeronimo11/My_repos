package CLOWN;

public class LOL {
	
	public static void method(String text) {
		StringBuilder result = new StringBuilder(text);
		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) == 'a') {
				result.setCharAt(i, 'o');
			}
		}
		System.out.println(result.toString());
	}

	public static void main(String[] args) {
		method("paravoz");
	}
}


/*
Напишите программу, которая будет принимать на вход строку
 и заменять все буквы "а" на "о" и выводить полученную строку.
*/