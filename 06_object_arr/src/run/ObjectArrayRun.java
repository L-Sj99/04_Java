package run;

import service.MemberService;

public class ObjectArrayRun {
	public static void main(String[] args) {
		
		// MemberService 객체 생성 : MemberService 생성자를 작성 한 적이 없기에, 컴파일러가 "기본 생성자"를 만들어 준다
		MemberService service = new MemberService();
		service.method1();
	}
}
