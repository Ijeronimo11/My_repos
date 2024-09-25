package HOMEWORK;

public class L17HW {
	public static boolean ravenstvo(StringBuilder text, StringBuilder text2) {
		boolean result = true;
		if (text.length() == text2.length()) {
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) != text2.charAt(i)) {
					result = false;
					break;
				}
			}
		} else {
			result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		StringBuilder sb3 = new StringBuilder("hello");
		StringBuilder sb4 = new StringBuilder("hello");
		StringBuilder sb5 = new StringBuilder("Hello");
		boolean a = L17HW.ravenstvo(sb3, sb4);
		//System.out.println(a);
		
	}
}
