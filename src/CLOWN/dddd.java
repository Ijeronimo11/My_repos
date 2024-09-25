package CLOWN;

public class dddd {
	public static void maxMin(int[]array, int num) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				System.out.println("Значение: " + num + " находится в массиве под индексом " + i);
				break;
			} else {
				System.out.println("Значения - " + num + " в этом массиве нет.");
			}
		}
	}

	public static void main(String[] args) {
		int[]kekw = {5, -3, 6, 4, 1, 0};
		maxMin(kekw, 4);
	}
}

// найти в массиве значение, которое больше 2, но меньше 5;



















