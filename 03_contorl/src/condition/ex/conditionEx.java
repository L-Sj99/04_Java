package condition.ex;

import java.util.Scanner;

/* 조건문 예시 기능용 클래스 */

public class conditionEx {
	// import 자동 완성 = Scanner + ctrl + spacebar + 1번째 선택 
	// 필드(field) == 멤버 변수 == 인스턴스 변수(전역 변수 비슷, 전역 변수는 아님)
	Scanner sc = new Scanner(System.in);
	
	/* 1~ 10 사이 난수가 짝수인지 홀수인지 출력 */
	public void method1() {
		int ran = (int)(Math.random() * 10 + 1);
		if(ran % 2 !=1) {
			System.out.println("짝수 입니다.");
		} else
			System.out.println("홀수 입니다.");
	}
	/* 나이를 입력 받아
	 * 13세 이하 : 어린이
	 * 14세 이상 19세 이하 : 청소년
	 * 20세 이상 : 성인
	 * 구분하여 출력하기
	 */
	public void method2() {
		System.out.println("나이 입력 : ");
		int age = sc.nextInt(); // 필드 sc 이용
		String result;
		if(age <= 13) {
			result = "어린이";
		} else if(/* age >= 14 && 얘가 없어도 됨 */ age <= 19) {
			result = "청소년";
		} else {
			result = "성인";
		}
		System.out.println(result);
	}
	/* 나이를 입력 받아
	 * 13세 이하 : 어린이
	 * 14세 이상 19세 이하 : 청소년
	 * - 14~16 : 청소년(중)
	 * - 17~19 : 청소년(고)
	 * 20세 이상 : 성인
	 * 0 이하 또는 100 초과 : 잘못 입력하셨습니다.
	 * 구분하여 출력하기 
	 */
	public void method3() {
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		String result1;
		
		// 방법1
		/* if(age <= 0 || age > 100) result1 = "잘못 입력하셨습니다";
		else if(age <= 13) {
			result1 = "어린이";
		} else if(age <= 16) {
			result1 = "청소년(중)";
		} else if(age <= 19) {
			result1 = "청소년(고)";
		} else if(age >= 20 && age <= 100){
			result1 = "성인";
		} else {
			result1 = "잘못 입력하셨습니다.";
		}
		System.out.println(result1); */
		
		// 방법 2
		if(age <= 0 || age > 100) result1 = "잘못 입력하셨습니다";
		else if(age <= 13)	result1 = "어린이";
		else if(age <= 19)	result1 = "청소년" + ((age<=16) ? "(중)" : "(고)");
		else result1 = "성인";
		System.out.println(result1);
	}
	/* [switch를 이용한 메서드 호출] */
	public void displayMenu() {
		System.out.println("1. method1() - 난수 홀짝");
		System.out.println("2. method2() - 나이 구분1");
		System.out.println("3. method3() - 나이 구분2");
		System.out.println("4. method4() - 계절 찾기");
		System.out.println("5. method5() - 성적 나오기");
		System.out.print("번호 선택 >>");
		int num = sc.nextInt();
		
		System.out.print("------------------\n");
		
		switch(num) {
		case 1 : method1(); break; // 1입력 시 method1() 호출
		case 2 : method2(); break;
		case 3 : method3(); break;
		case 4 : method4(); break;
		case 5 : method5(); break;
		default : System.out.println("잘못 입력 하셨습니다.");
		}
	}
	/* [switch]입력된 달(월)의 계절 출력하기 */
	public void method4() {
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		switch(month) {
		
		// case를 연속해서 작성하는 여러가지 방법
		// 1) 세로로 작성
		case 3 : 
		case 4 : 
		case 5 : result = "봄"; break;
		// 2) 가로로 작성
		case 6 : case 7 : case 8 : result = "여름"; break;
		// 3) case 값, 값, 값 형식
		case 9, 10, 11 : result = "가을"; break;
		// 4) 처음 배웠을 때 배운 방식
		case 12 : result = "겨울"; break;
		case 1 : result = "겨울"; break;
		case 2 : result = "겨울"; break;
		default : result = "잘못 입력";
		} // switch end
		System.out.println(result);
	}
	/* [성적 판별기] 
	 * 중간고사, 기말고사, 과제 점수를 입력 받아 성적 부여
	 * - 중간고사 (40%), 기말고사(50%), 과제(10%)
	 * - 입력 시 각각 100점 만점으로 입력 받음
	 * - 합산된 점수에 따라 성적 부여
	 * 95점 이상 : A+
	 * 90점 이상 : A
	 * 85점 이상 : B+
	 * 80점 이상 : B
	 * 75점 이상 : C+
	 * 70점 이상 : C
	 * 65점 이상 : D+
	 * 60점 이상 : D
	 * 나머지 : F
	 * 
	 * [실행 화면]
	 * 이름 : 
	 * 중간고사 점수(40%) : 100
	 * 기말고사 점수(50%) : 80
	 * 과제 점수(10%) : 50
	 * 
	 * 최종 점수 : 85점
	 * 성적 : B+
	 */
	public void method5() {
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("중간고사(40%) : ");
		int sum1 = sc.nextInt();
		
		System.out.print("기말고사(50%) : ");
		int sum2 = sc.nextInt();
		
		System.out.print("과제(10%) : ");
		int sum3 = sc.nextInt();
		
		double sum = (sum1 * 0.4) + (sum2 * 0.5) + (sum3 * 0.1);
		String result;
		
		/* [방법 4] */
		switch((int)sum/10) {
		case 10, 9 : result = "A"; break;
		case 8 : result = "B"; break;
		case 7 : result = "C"; break;
		case 6 : result = "D"; break;
		default : result = "F";
		}
		
		// 60 초과된 sum 중에서 1의 자리고 5 이상인 값들만 + 추가
		if(sum > 60 && sum % 10 >= 5)  result += "+";
		
		System.out.println(); // 줄바꿈
		System.out.println(name + "의 최종 점수 : " + sum + "점");
		System.out.println("성적 : " + result);
	}
		
		/* [방법 1]
		 if(sum >= 95 ) {
			result = "A+";
		} else if(sum >= 90) {
			result = "A";
		} else if(sum >= 85) {
			result = "B+";
		} else if(sum >= 80) {
			result = "B";
		} else if(sum >= 75) {
			result = "C+";
		} else if(sum >= 70) {
			result = "C";
		} else if(sum >= 65) {
			result = "D+";
		} else if(sum >= 60) {
			result = "D";
		} else{result = "F";} */ 
		/* [방법 2] 
		if(sum >= 90) result = "A" + ( sum>=95 ? "+" : "" );
		else if(sum >= 80) result = "B" + ( sum>=85 ? "+" : "" );
		else if(sum >= 70) result = "C" + ( sum>=75 ? "+" : "" );
		else if(sum >= 60) result = "D" + ( sum>=65 ? "+" : "" );
		else  result = "F"; */
		/* [방법 3] switch문 ()에 들어갈 수 있는 값은 int, String
		switch((int)sum/5) {
		case 20, 19 : result = "A+"; break;
		case 18 : result = "A"; break;
		case 17 : result = "B+"; break;
		case 16 : result = "B"; break;
		case 15 : result = "C+"; break;
		case 14 : result = "C"; break;
		case 13 : result = "D+"; break;
		case 12 : result = "D"; break;
		default : result = "F";
		} */
		
		/** [연습 문제]
		 * 국어, 영어, 수학, 사탐, 과탐 점수를 입력 받아
		 * 40점 미만 과목이 있으면 FAIL
		 * 평균이 60점 미만인 경우도 FAIL
		 * 모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
		 * 
		 * [출력 예시]
		 * 점수 입력(국 영 수 사 과) : 100 50 60 70 80
		 * 
		 * 
		 * 1) 40점 미만 과목이 존재하는 경우
		 * FAIL [40점 미만 과목 : 국어 영어]
		 * 
		 * 
		 * 2) 평균 60점 미만인 경우
		 * FAIL [점수 : 50.4 (평균 미달)]
		 * 
		 * 
		 * 3) PASS인 경우
		 * PASS [점수 : 83.4 / 100]
		 */
		public void practice() {
			System.out.print("점수 입력(국 영 수 사 과) : ");
			
			int kor = sc.nextInt(); // 국
			int eng = sc.nextInt(); // 영
			int mat = sc.nextInt(); // 수
			int soc = sc.nextInt(); // 사
			int sci = sc.nextInt(); // 과
			
			// 40점 미만인 과목 검사
			boolean flag = false;
			
			String str = ""; // 빈칸(자료형 : String, 내용x)
			
			if(kor < 40) {
				flag = true;
				str += "국어 ";
			}
			if(eng < 40) {
				flag = true;
				str += "영어 ";
			}
			if(mat < 40) {
				flag = true;
				str += "수학 ";
			}
			if(soc < 40) {
				flag = true;
				str += "사회 ";
			}
			if(sci < 40) {
				flag = true;
				str += "과학 ";
			}
			
			// 40점 미만 과목이 존재하는 경우
			if(flag) {
				System.out.printf("FALE [40점 미만 과목 : %s]", str);
				return;
			}
			
			// 평균(double형 결과를 반환 받기 위해 5.0으로 나눔)
			double avg = (kor + eng + mat + soc + sci) / 5.0;
			
			if(avg < 60.0) {
				System.out.printf("FAIL[점수 : %.1f (평균 미달)]", avg);
				return; // Esrly retyrn; (중간에 메서드를 종료)
			}
			
			System.out.printf("PASS [점수 : %.1f / 100]", avg);
	}
}
