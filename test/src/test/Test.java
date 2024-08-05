package test;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import test.Student;

public class Test {
	private static ArrayList<Student> list;

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("강건강", 84));
		list.add(new Student("남나눔", 78));
		list.add(new Student ("도대담", 96));
		list.add(new Student("류라라", 67));
		
		for(int i = 0; i < list.size() ; i++) {
		Student s = list.get(i);
			System.out.println(s);
			// System.out.printf("%s 학생의 점수 : %d \n", s.getName, i.getScore);
		}
	}
}
