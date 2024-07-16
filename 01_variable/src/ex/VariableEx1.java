package ex;

/* 자바 코드 실행 방법
 * 1) 위에 run 버튼(>)
 * 2) ctrl + f11
 * 
 * System.out.println() 자동완성
 * - sysout -> ctrl + space -> enter
 * */
public class VariableEx1 {
	/** [main method]
	 * <p>
	 * 자바 프로그램을 실행 시키기 위한 구문(기능)
	 * </p> */
	
	public static void main(String[] args) {
		
		// 변수 : 메모리에 값을 저장하는 공간, 변수에 저장된 값은 바꿀 수 있다(상수는 안됨)
		/*자료형(Data type)
		 * - 변수에 저장되는 값의 종류/크기
		 * 
		 * [Java 기본 자료형 8가지]
		 * boolean (1byte) : 논리형 - true/false
		 * byte (1byte) : 정수형 
		 * short (2byte) : 정수형 
		 * int (4byte) : 정수형 - 정수 기본형(123 -> int로 인식)
		 * long (8byte): 정수형 - 숫자 뒤에 소문자 l 또는 대문자 L을 붙임(123L, 123l)
		 * float (4byte) : 실수형 - 숫자 뒤에 f 또는 F (3.14f, 3.14F)
		 * double (8byte) : 실수형 - 실수 기본형
		 * char (2byte) : 문자형 - 문자 하나를 의미, 'A'
		 * */
		
		// 변수 선언 : 메모리에 값의 저장할 공간을 만든다(== 할당)
		
		int num1; // 메모리에 int형 데이터(정수)를 저장하기 위한 공간 4byte를 할당하고 변수 이름을 num1이라고 지정
		
		// 자바는 초기화 (처음 값 대입)되지 않은 지역 변수를 출력, 연산할 수 없다(대입 연산만 가능)
		// The local variable num1 may not have been initialized -> num1 변수가 초기화 되지 않았다
		// System.out.println(num1);
		
		// 변수에 값 대입
		num1 = 2000;
		System.out.println(num1); // 값이 대입되면 오류x
		
		System.out.println("-----------");
		System.out.println("[자료형별 리터럴 작성법]");
		
		//논리형(1byte)
		boolean isTrue = true;
		boolean isFalse = false;
		
		// 문자열 이어쓰기
		System.out.println("isTrue : " + isTrue);
		System.out.println("isFalse : " + isFalse);
		
		// JS에서는 true == 1 비교 가능 했으나 Java는 안됨
		// 자료형이 같지 않아서 비교 불가
		// Sytem.out.println(true == 1);
		
		// [정수형]
		int intNum = 2147483647; // int 최대 값
		// The literal 2147483648 of type int is out of range -> int 범위 초과 대입으로 오류
		// int intNum2 = 2147483648; // int 최대 값 + 1
		
		// long longNum = 2147483648; // 일반 정수값 == int(기본형)
		long longNum = 2147483648L; // 뒤에 L == long 표기
		
		System.out.println("intNum : " + intNum);
		// longNum 뒤에 L은 안붙어서 출력된다 -> 코드에만 리터럴 표기법 작성 / 출력 시 미표기 됨
		System.out.println("longNum : " + longNum);
		
		// [실수형]
		
		// Type mismatch: cannot convert from double to float -> float 변수에 double 값을 저장할 수 없다(실수 기본형은 double이다. 1.23처럼 보통 실수 표기법이 double로 인식됨)
		// float floatNum = 1.23;
		float floatNum = 1.23F; // 뒤에 f == float 자료형
		
		double doubleNum = 3.14;
		
		System.out.println("floatNum : " + floatNum);
		System.out.println("doubleNum : " + doubleNum);
		
		// [문자형]
		char ch1 = 'A'; // char == 2byte, 리터럴 표기법('') 
		char ch2 = '가'; 
		char ch3 = '★'; 
		char ch4 = '昭'; 
		// char ch5 = 'AB'; // 문자 2개는 안됨 
		// char ch6 = "A"; // 쌍따옴표 안됨
		
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		System.out.println("ch4 : " + ch4);
		
		System.out.println("---------------");
		
		System.out.println("[float와 double의 차이점]");
		/* float(4byte), double(8byte)
		 * byte(크기)가 float의 2배라서 double이 아님 -> 정확도가 2배 ==> 소수점 표현 자릿수가 2배라서 double
		 * */
		
		// 소수점 아래 19자리
		float test1 = 1.1234567890123456789F;
		double test2 = 1.1234567890123456789;
		
		System.out.println(test1); // 1.12345678 : 소수점 7~8자리만 표현
		System.out.println(test2); // 12345678901234567 : 소수점 15~16 자리만 표현
		
		// --------------------------------------------------
		/* String(문자열)
		 * - 기본 자료형(8가지)에 포함되지 않는다
		 * - 기본 자료형 o : 변수에 직접 값을 저장
		 * - 기본 자료형 x : 변수에 값의 위치(주소)를 저장 == 참조형(기본 자료형이 아닌 애들)
		 */
		
		String str1 = "문자열 리터럴 표기법은 쌍따옴표";
		String str2 = "String은 주소를 저장하고 찾아가는 참조형";
		
		System.out.println(str1);
		System.out.println(str2);
		
	}
}
