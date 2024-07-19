package field.pkg2;

import field.pkg1.FieldTest1;

public class FieldRun2 extends FieldTest1 {
						// 상속 구문
	public static void main(String[] args) {
		
		// FieldTest1 객체 생성
		FieldTest1 f1 = new FieldTest1();
		
		// public
		System.out.println(f1.publicValue);
		
		// protected -> 문제 발생(상속 관계가 아니기에 안됨, 상속 관계 x)
		// System.out.println(f1.protectedValue);
		
		
		// (default) -> 문제 발생
		// System.out.println(f1.defaultValue);
		
		// private -> 문제 발생
		// System.out.println(f1.privateValue);
	}
	public void method() {
		
		// 상속 관계이기 때문에 protected 직접 접근 가능
	System.out.println(protectedValue);
	}
}
