package list.run;

import list.service.BookService;
import view.BookView;

public class BookRun {
	public static void main(String[] args) {
		// 변수 : 메모리에 값을 저장하는 공간 -> 변수에 저장하면 계속 호출 가능(재사용 가능)	
		
		// 객체를 1회성으로 사용하는 방법
		new BookView().mainMenu();
		
		// 포함된 문자열 확인하는 법
		// String.contains("검색어") : 포함이면 trus / 아니면 false
//		System.out.println("너무 친한 친구들".contains("너무"));
//		System.out.println("너무 친한 친구들".contains("친구"));
//		System.out.println("너무 친한 친구들".contains("페스트"));
	}
}
