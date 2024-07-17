package loop.ex;

import java.util.Scanner;

public class LoopEx1 {
	Scanner sc = new Scanner(System.in);
	/* 1부터 10까지 출력 */
	public void method1 () {
		
		// Java는 초기식 변수 선언 시 let x -> Java 자료형
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
		}
	}
	public void method2() {
		System.out.print("시작 끝 증가값 : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int value = sc.nextInt();
		
		for(int i = start ; i <= end ; i += value) {
			System.out.println(i);
		}
	}
	public void method3() {
		/* 두 수를 입력 받아 작은 수 부터 큰 수 이하까지 1씩 증가하며 반복 */
		System.out.println("숫자 2개 입력 : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("------------------------------");
		
		if(a < b) {
			for(int i = a ; i <= b; i++) { // a가 작은 경우
				System.out.println(i);
			}
		} else { // b가 작거나 같은 경우
			for(int i = b ; i <= a; i++) {
				System.out.println(i);
			}			
		}
		
		System.out.println("------------------------------");
		// 추가 변수를 이용해서 시작, 종료 값 지정하기
		
		int start = a;
		int end = b;
		
		if(a > b) { // 시작이 끝 보다 큰 경우
			start = b;
			end = a;
		}
		for(int i = start ; i <= end ; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		// a에 작은 값, b에는 큰 값 저장하게 만들기
		
		if(a > b) { // a 값이 b 보다 큰 경우 a <-> b 값 변경
			int temp = a; // a값을 보관하는 임시 변수
			a = b;
			b = temp;
		}
		for(int i = a ; i <= b ; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		// 자바에서 제공하는 기능(메서드) 이용
		
		int min = Math.min(a, b); // a, b중 작은 값
		int max = Math.max(a, b); // a, b중 큰 값
		
		for(int i = min ; i <= max ; i++) {
			System.out.println(i);
		}
	}
	/* 1부터 100 사이의 정수 중 5의 배수의 합, 개수 구하기 (sum, count) */
	public void method4() {
		
		int sum = 0;
		int count = 0;
		
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 5 == 0) { // 5의 배수인 경우
				sum += i; // sum에 i값(5의 배수) 누적
				count++; // count 1증가(5의 배수 카운트)
			}
		}
		System.out.printf("합계 : %d / 개수 : %d", sum, count);
	}
	
	/* 구구단 3단 출력하기 */
	public void method5() {
		
		System.out.print("3단\n");
		for(int i = 1; i <= 9 ; i++) {
			System.out.printf("3 x %d = %d \n", i, 3*i);
		}
	}
	
	/* 입력 받은 단 출력하기.
	 * 단, 입력 받은 단이 2~9사이 숫자가 아니면 "잘못 입력 하셨습니다" 출력
	 */
	public void method6() {
		System.out.println("단 입력 : ");
		int dan = sc.nextInt();
		
		 if(2 > dan || 9 < dan ) {
			 System.out.println("잘못 입력 하셨습니다");
			 return;
		 }
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d x %d = %d \n", dan, i ,dan*i);
		}
	}
	/* while문 기본 작성법
	 *  
	 */
	public void method7() {
		int num = 1;
		
		// while(조건식) -> 조건식이 true인 경우 반복 수행
		while(num <= 10) {
			System.out.print(num + " ");
			num++;
		}
	}
	
	// for(초기식;조건식;증감식) -> 지정 횟수 만큼 반복
	// while(조건식) -> 조건 식이 false가 될 때 까지 반복 == 몇회인지 모르겠지만 일단 끝날 때 까지 반복
	
	/** [구구단 출력하기 version.2]
	 * 입력 받은 단 출력하기
	 * 단, 입력 받은 단이 2 ~ 9 사이 숫자가 아니면 "잘못 입력 하셨습니다" 출력
	 */
	public void method8() { // 무한 반복
		int dan;
		while(true) {
			System.out.println("단 입력 : ");
			dan = sc.nextInt();
			
			 if( dan >= 2 && dan <= 9 ) { // 2 ~ 9 사이
				 break; // 가까운 반복문 정지(분기문)
				 
			 }
			 System.out.println("잘못 입력 하셨습니다");
		}
			 // 구구단 출력
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d x %d = %d \n", dan, i ,dan*i);
		}
	}
}