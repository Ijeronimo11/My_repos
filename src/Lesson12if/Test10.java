package Lesson12if;

import Lesson11.Student;

public class Test10 {
	void maximum(int i1, int i2, int i3) {
		if (i1 > i2 && i1 > i3) {
			System.out.println("Maximum - " + i1);
		} else if (i2 > i1 && i2 > i3) {
			System.out.println("Maximum - " + i2);
		} else {
			System.out.println("Maximum - " + i3);
		}
	}

	public static void main(String[] args) {
		Test10 t = new Test10();
		t.maximum(4, 7, 0);
		
	}
}



/*
public static void methodDVA(Student st1, Student st2) {
	if (st1.name.equals(st2.name)) {
		if (st1.course == st2.course) {
			if (st1.grade == st2.grade) {
				System.out.println("Имена, курсы и оценки студентов одинаковые!");
			} else {
				System.out.println("Имена, курсы и оценки студентов отличаются!");
			}
			System.out.println("Имена и курсы студентов одинаковые!");
		} else {
			System.out.println("Имена и курсы отличются");
		}
	} else {
		System.out.println("Имена студентов отличаются");
	}
}
*/















































