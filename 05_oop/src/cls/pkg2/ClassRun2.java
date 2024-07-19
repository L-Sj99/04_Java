package cls.pkg2;

import cls.pkg1.ClassTest1;

public class ClassRun2 {
	public static void main(String[] args) {
		
		//public class + 다른 패키지
		// ClassTest1 객체 생성하기 -> 문제 X
		
		ClassTest1 t1 = new ClassTest1();
		t1.method();
		
		// (default) class + 같은 패키지
		// DefaultClass 객체 생성 -> 문제 O
		// -> 다른 패키지라서 접근 불가능
		// DefaultClass d1 = new DefultClass();
		// d1.method();
}
}
