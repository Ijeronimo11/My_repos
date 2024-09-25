
public class Car {
	Car(String cvet, String motor) {
		color = cvet;
		engine = motor;
		System.out.println("Cvet mashini: " + color + ". Motor: " + engine + ".");
	}
	
	String color;
	String engine;

	public static void main(String[] args) {
		Car car1 = new Car("Black", "V8");
		Car car2 = new Car("White", "V6");
	}
}






























