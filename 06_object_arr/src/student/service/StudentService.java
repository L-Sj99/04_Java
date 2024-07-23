package student.service;

import java.util.Random;

import student.dto.StudentDTO;

// 기능(비즈니스 로직) 제공용 클래스
public class StudentService {
	// StudentDTO 객체를 참조하는 Student DTO 참조 변수 5개 묶음 배열 생성
	// 인덱스 0~4번까지
	// 각 인덱스 요소 : 초기 값 null
	private StudentDTO[] students = new StudentDTO[5];
	
	/* 기본 생성자 생성 */
	public StudentService() {
		
		// 학생 객체 배열(students)에 샘플 학생 3명 추가
		//students[0] : (StudentDTO) 자료형 참조 변수
		students[0] = new StudentDTO("24001", "짱구", '남');
		students[1] = new StudentDTO("24002", "철수", '남' );
		students[2] = new StudentDTO("24003", "유리", '여' );
		
		// student[3] / [4] == null
		
		// 0~100 사이 난수 발생
		// 1) Math.floor(Math.random()*101) ==0~100
		// 2) Random random = new Random();
		// random.nextInt(101); == 0~100
		
		Random random = new Random();
		for( StudentDTO std : students) { //향상된 for문
			
			// 현재 접근한 요소가 참조하는 객체가 없다면 반복을 종료
			if(std == null) break;
			
			// random.nextInt(101) : 0 이상 101 미만 정수형 난수
 			std.setHtml(random.nextInt(101));
 			std.setCss(random.nextInt(101));
 			std.setJs(random.nextInt(101));
 			std.setJava(random.nextInt(101));
		}
	}
	/** 학생 객체 배열 student 중 비어있는 인덱스에 전달받은 학생 객체(std) 대입
	 * 
	 * @param std : 입력 받은 값을 저장한 학생 객체 주소
	 * @return : true = 추가 성공 / false = 추가 실패
	 * - 실패 조건 : students 배열이 꽉 차있는데 추가 학생이 전달된 경우
	 */
	
	public boolean addStudent(StudentDTO std) {
		
		// 0번 인덱스 부터 순서대로 비어있는(null) 요소를 찾아 전달받은 std를 대입
		for(int i = 0 ; i < students.length ; i ++) {
			if(students[i] == null) { // i번째 요소가 비어있는 있는 경우
				students[i] = std;
				return true;
			}
		}
		// 비어있는(null)인 요소가 없을 경우 false 반환
		return false;
	}
	
	/**
	 * students 객체 배열에 저장된 주고를 얻어가게 하는 메서드
	 * @return : students 객체 배열에 저장된 주소
	 */
	public StudentDTO[] getStudents() {
		return students;
	}
	/**
	 * 학생 1명 정보 조회 (index 검색)
	 * @param index
	 * @return 조회된 학생 객체 주소 || null
	 */
	public StudentDTO selectIndex(int index) {
		
		// 전달 받은 index 범위가 students의 인덱스 범위 밖인 경우
		if(index < 0 || index >= students.length) {
			return null;
		}
		return students[index];
	}
	
	/**
	 * 전달 받은 이름과 이름이 일치하는 학생 객체를 반환 
	 * @param targetName
	 * @return null 또는 일치하는 학생 객체(주소 값)
	 */
	public StudentDTO selectName(String targetName) {
		
		// 향상된 for문
		for(StudentDTO std : students) {
			
			// 저장된 학생이 없는 경우 -> 뒤에도 없기 때문에 그냥 여기서 검색 종료
			if(std == null) return null;
			
			// == : 기본 자료형 비교
			// A.equals(B) : 참조형(객체) 비교
			if(std.getName().equals(targetName)) {
				return std;
			}
			
		}
		return null;
	}
	/**
	 * 전달 받은 index가 students 범위 내인지 + 정상 범위라면 해당 index가 학생 객체를 참조 하는지 확인
	 * @param index
	 * @return 1 또는 2 또는 3(정상)
	 */
	public int checkIndex(int index) {
		 // 입력 받은 index가 정상인지 판별
		 // 1 == 범위 초과
		 // 2 == 학생 없음
		 // 3 == 정상
		
		if(index < 0 || index >= students.length) return 1;
		
		if(students[index] == null) return 2;
		
		return 3;
	}
	
	/**
	 * 전달 받은 index 번째 학생의 점수 수정
	 * @param index
	 * @param scores
	 */
	public void updateScores(int index, StudentDTO other) {
		
		// 객체 배열 : 객체 참조형 변수들을 묶음으로 다루는 것
		StudentDTO s = students[index]; // students[index] 번째에 저장된 주소 얕은 복사
		s.setHtml(other.getHtml());
		s.setCss(other.getCss());
		s.setJs(other.getJs());
		s.setJava(other.getJava());
		// return; 안써도 컴파일러가 자동으로 추가
	}
	/**
	 * 평균 최대 / 최소 구하기
	 * @return
	 * 최고점 : 짱구(85.4)
	 * 최저점 : 맹구(61.5)
	 */
	public String selectMaxMin() {
		 double maxAvg = 0;
		 double minAvg = 0;
		 
		 String maxName = null;
		 String minName = null;
		 
		 // 최조/최저점 판별
		for(StudentDTO std : students) {
			if(std == null) break; // 학생이 없으면 반복 멈춤
			
			int sum = std.getHtml() + std.getCss() + std.getJs() + std.getJava();
			double avg = sum / 4.0;
			
			// for문 첫 반복일 떄
			if(maxAvg == 0.0){
				maxAvg = avg;
				maxName = std.getName();
				minAvg = avg;
				minName = std.getName();
				continue;
			}
			
			if(avg > maxAvg) { // 기존 최대값 보다 현재 평균이 클 때
				maxAvg = avg;
				maxName = std.getName();
			}
			
			if(avg < minAvg) { // 기존 최소값 보다 현재 평균이 작을 때
				minAvg = avg;
				minName = std.getName();
			}
		}
		
		String result = String.format("최고점 : %s(%.1f)\n최저점 : %s(%.1f)\n", maxName, maxAvg, minName, minAvg);
		return result;
	}
}
