package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	/* [실습 문제 1]
		길이가 9인 배열을 선언 및 할당하고, 
		1부터 9까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		짝수 번째 인덱스 값의 합을 출력하세요. 
		(0 번째 인덱스는 짝수로 취급)
	 */
	public void practice1() {
		// 배열 요소 초기화
		int[] arr = new int[9];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i + 1; }
		// 출력 및 합계
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
			if(i % 2 == 0) { // 짝수번쨰 인덱스 요소 합
			sum += arr[i]; }
		}
		// \n 줄바꿈(개행) 문자
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		int[] arr = new int[9];
		
		// i : 0 1 2 3 4 5 6 7 8
		// arr.length : 9 9 9 9 9 9 9 9 9
		// arr.length - i : 9 8 7 6 5 4 3 2 1
		// arr[i] : 9 8 7 6 5 4 3 2 1
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			arr[i] = arr.length - i; }
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(i % 2 != 0) {
			sum += arr[i]; }
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
	/* [실습 문제 3]
	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	*/
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt(); 
		int[] arr = new int[num];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");	}
	}
    /*[실습 문제 4]
    정수 5개를 입력 받아 배열을 초기화 하고
    검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
    배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
    */
	
	public void practice4() {
		int[] arr = new int[5];
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt(); // 요소 마다 입력 값 대입
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		// 검색 값이 존재하면 true
		// 없으면 false
		boolean flag = false;		
		for(int i = 0 ; i < arr.length ; i++) { // 검색
			if(arr[i] == search) { // i번째 요소에 저장된 값과 검색할 값이 같은 경우
				System.out.println("인덱스 : " + i);
				flag = true; // 같은 값이 있으니 true로 변경
				}
			}
		
		if(!flag) {  // flag == false
			System.out.println("일치하는 값이 존재하지 않습니다"); }
	}
	
	/* [실습 문제 5]
	사용자가 배열의 길이를 직접 입력하여 그 값만큼 
	정수형 배열을 선언 및 할당하고
	배열의 크기만큼 사용자가 직접 값을 입력하여 
	각각의 인덱스에 값을 초기화 하세요.
	그리고 배열 전체 값을 나열하고 
	각 인덱스에 저장된 값들의 합을 출력하세요.
	*/
	public void practice5() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("배열 %d번쨰 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			sum += arr[i]; // 합계 누적
		}
		// 출력
		for(int value : arr) System.out.print(value + " ");
		
		// 합계 출력
		System.out.println("\n 총 합 : " + sum);
	}
	/* [실습 문제 6]
	주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
	단, char 배열 저장 시 
	성별을 나타내는 숫자 이후부터 *로 저장하세요.
	
	문자열.length() : 문자열의 길이
	문자열.charAt(index) : 문자열 중 index번째 문자(char) 반환
	*/
	public void practice6() {
		// 991122-1234567
		char[] arr = new char[14];
		System.out.print("주민등록번호 (-포함) : ");
		String str = sc.next();
		
		// 주민등록번호를 char 배열 요소로 하나씩 대입
		for(int i = 0 ; i < str.length() ; i++) {
			if(i <= 7)arr[i] = str.charAt(i); // 성별 까지
			else arr[i] = '*';  // 성별 이후
			System.out.print(arr[i]);
		}
	}
	
	/*3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
	다시 정수를 받도록 하세요.
	 */
	public void practice7() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 3 ; i >= arr.length ; i++) {
			for(int y = arr.length - 1 ; y <= 3 ; y++ ) {
				System.out.print(i + " ");	
				System.out.print(" " + y); }
		}
	}
}