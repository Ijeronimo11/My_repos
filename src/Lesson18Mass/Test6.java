package Lesson18Mass;

public class Test6 {
	public static void maxMin(double[] array) {
		double max = array[0];
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Min element: " + min + " Maks element: " + max);
	}

	public static void main(String[] args) {
		double[] array1 = {1.05, -3.14, 8.0, 9.19, -3, 0};
		maxMin(new double [] {2.5, -1.3});
	}
}


//Написать метод который принимает в параметр массив
//и выводит на экран его наибольший и наименьший элемент.