package again4;

public class Car {
	String color = "red";
	String engine = "V6";

	public static void main(String[] args) {
		int a;
		Car car1 = new Car();
		car1.color = "black";
		car1.engine = "V16";
		
		System.out.println("Цвет: " + car1.color);
		System.out.println("Мотор:" + car1.engine);
	}
}
