package list.service;

import java.util.ArrayList;
import java.util.List;

/* Collection Framework : java에서 제공하는 자료 구조를 모아둔 것
 * (java.util 패키지에 존재)
 * 
 * [특징]
 * 1. 크기 제한 없음
 * 2. 추가, 수정, 삭제 정렬 다양한 기능 제공됨
 * 3. 객체만 저장 가능(정확히 객체 참조 주소만 저장 가능)
 * 
 * [List]
 * - 자료(Data)를 순차적으로 나열한 자료 구조(배열 비슷)
 * index가 존재함 -> 각 Data를 index(순서)로 구분할 수 있음, 중복된 Data를 저장할 수 있음
 */

public class ListService {
	public void test1() {
	
		// ArrayList 객체 생성 -> List 인터페이스를 상속 받은 자식 클래스로 가장 많이 사용하는 List
		
		// List : 부모 인터페이스 -> 객체 생성 불가 / 부모 참조 변수 가능
		// List list = new ArrayList(); // 10칸 생성
		
		List list = new ArrayList(3); // 3칸 생성
		
		// E(Element) : 요소를 뜻하는 상징적인 글자(특정 자료형 x, Object 타입)
		
		// 1. doolean add(E e) - List애 주어진 객체(e)를 맨 끝에 추가
		list.add("아무거나");
		list.add(new Object());
		list.add(new int[4]); // 3번째
		
		// 4번째 -> 크기 초과 오류 발생 안함 -> List 크기가 자동으로 증가
		list.add(123); // int 기본 자료형은 추가 불가 -> Integer Wrapper class로 변환되어 저장됨
		System.out.println(list.toString());
		
		// 2. void add(int index, E e) : index 번째에 e를 추가 -> 중간에 삽입한다
		list.add(2, "중간");
		System.out.println(list); // toString() 생략 가능
		
		// 3. int size() : 저장된 Data(객체)의 수를 반환
		System.out.println("현재 저장된 data 개수 : " + list.size());
		
		// E == Object
		// 4. E Get(int index) : index 번째 요소를 반환
		System.out.println(list.get(0));
		
		// List + 일반 for문
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.printf("\n%d 번쩨 인덱스 요소 : %s", i, list.get(i));			
		}
		
		System.out.println("\n");
		
		// List + 향상된 for문
		for(Object obj : list) {
			String str = null;
			
			// obj가 참조하는 객체가 String 타입이라면
			if(obj instanceof String) str = "[String] ";
			else if(obj instanceof int[]) str = "[int[]] ";
			else if(obj instanceof Integer) str = "[Integer] ";
			else str = "[Object] ";
			System.out.println(str + obj);
		}
	}
	/*List + 제네릭(타입제한) 확인 + List 메서드 몇가지 더 확인 */
	public void test2() {
		
		/* 제네릭(Generics, <>)
		 * 1. 컬렉션 타입을 제한하여 한가지 자료형만 저장할 수 있게 하는 기능
		 * 2. 클래스나 메서드가 다룰 타입을 지정하는 기능
		 */
		
		// String으로 타입이 제한된 List 생성
		List<String> menuList = new ArrayList<String>();
		
		// add() 확인
		// menuList.add(123); // String으로 제한되어서 다른 자료형 추가 불가능
		menuList.add("냉모밀");
		menuList.add("갑오징어회");
		menuList.add("회냉면");
		menuList.add("탄탄면");
		menuList.add("우육면");
		menuList.add("돈코츠라멘");
		menuList.add("텐동");
		
		// 향상된 for문
		for(String menu : menuList) {
			System.out.println(menu);
		}
		
		// 5. E set(int index, E e) : 지정된 index 번째 요소를 e(두 번째 매개 변수)로 수정 -> 메서드 반환 값으로 이전 객체가 반환된다 
		System.out.println();
		System.out.println(menuList);
		
		String before = menuList.set(3, "소갈비");
		System.out.println(before + "이 " + menuList.get(3) + "로 변경됨");
		System.out.println(menuList);
		
		// 6. boolean contains(E e) : List 내부에 e와 같은 객체가 존재하면, true, 없으면 false 반환(확인 기능)
		System.out.println("냉모밀 : " + menuList.contains("냉모밀"));
		System.out.println("탄탄면 : " + menuList.contains("탄탄면"));
		
		// 7. int indexOf(E e) : List 내부에 e와 같은 객체가 존재하면 해당 index를 반환, 존재 하지 않으면 -1 반환
		System.out.println("텐동 : " + menuList.indexOf("텐동"));
		System.out.println("텐부라 : " + menuList.indexOf("텐부라"));
		
		// 8. E remove(int index) : List에서 지정된 index 번쨰 요소를 제거 -> 중간이 제거되면 뒤쪽 요소를 앞으로 이동
		// - 제거된 요소는 메서드 결과로 반환됨
		System.out.println(menuList.remove(4) + "제거");
		System.out.println(menuList);
	}
}
