package Lesson18Mass;

import java.util.Arrays;
public class Test4 {

	public static void main(String[] args) {
		int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println(" ");
		Arrays.sort(array1);
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		//binarySearch
		System.out.println(" ");
//		int index1 = Arrays.binarySearch(array1, 1);
//		System.out.println(index1);
		System.out.println(array1);
	}
}
