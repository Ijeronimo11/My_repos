package Lesson9;

public class Car {
	String color;
	String engine;
	static int count;
		public Car(String color, String engine) {
			count++;
			this.color = color;
			this.engine = engine;
		}
		
	public void showColor() {
		System.out.println("Цвет машины: " + color);
		this.changeColor("RED");
	}
	
	public void changeColor(String color3) {
		System.out.println("Цвет машины изменился.");
		int cena = 5000;
		color = color3;
		cena += 1000;
	}

	public static void main(String[] args) {

	}
}






























