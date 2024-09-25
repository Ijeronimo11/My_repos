package Lesson12if;

public class Car {
	int engine;
	int doorCount;
		Car(int engine, int doorCount) {
			this.engine = engine;
			this.doorCount = doorCount;
		}

	public static void main(String[] args) {
		Car c1 = new Car(3, 4);
		Car c2 = new Car(2, 5);
		
		if (c1.engine > c2.engine) {
			if (c1.doorCount > c2.doorCount) {
				System.out.println("moshnost motora i dveri u 1 mashini bolshe");
			} else {
				System.out.println("moshnost motora u 1 mashini bol'she, a dverei men'she");
			}
		} else {
				System.out.println("moshnost motora u 1 mashini men'she");
			}
	}
}
