package field.pkg3;

public class StaticTestRun {
	public static void main(String[] args) {
		
		// Korean 객체 2개 생성
		Korean k1 = new Korean();
		k1.setName("김철수");
		k1.setId("990102-1234567");
		
		Korean k2 = new Korean();
		k2.setName("박영희");
		k2.setId("990304-2345678");
		
		System.out.println("[생성된 객체의 필드 값 확인]");
		
		System.out.printf("k1 : %d / %s / %s \n", k1.nationalCode, k1.getName(), k1.getId());
		System.out.printf("k2 : %d / %s / %s \n", k2.nationalCode, k2.getName(), k2.getId());
		
		System.out.println("\n\n[static 변수 값 변경 확인]");
		
		// static은 값은 공유하고 있기 때문에 한 번만 바꾸면 공유하는 고든 객체의 값이 변경
		k1.nationalCode = 10;
		// k2.nationalCode = 10; // 불필요한 코드
		
		System.out.printf("k1 : %d / %s / %s \n", k1.nationalCode, k1.getName(), k1.getId());
		System.out.printf("k2 : %d / %s / %s \n", k2.nationalCode, k2.getName(), k2.getId());
		
		// 왜 k1.nationalCode / k2.nationalCode에 노란줄이 떠있는가?
		// The static field Korean.nationalCode should be accessed in a static way
		// == 정적 방식으로 접근하는 것이 좋다
		// -> Static 영역에 생성된 이름으로 호출 하는게 더 효율적이다
		
		System.out.println("\n");
		System.out.println("[static에 선언된 이름 사용하기]");
		System.out.println("Korean.nationalCode : " + Korean.nationalCode);
		
		System.out.println("-- 값 변경 --");
		
		Korean.nationalCode = 1;
		System.out.println("Korean.nationalCode : " + Korean.nationalCode);
		System.out.println(k1.nationalCode);
		System.out.println(k2.nationalCode);
		
		// final 변수명 == 상수
		// static 변수 == 공유하는 변수
		// static final / final static -> 공유 가능한 상수
		// 용도 : 전체적으로 사용되면서 변하면 안되는 값
		// ex) Math.PI(원주율), 
		// Integer.MAX_VALUE(int최대값)
		// Integer.MIX_VALUE(int최소값)
		
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
