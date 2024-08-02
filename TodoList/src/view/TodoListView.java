package view;

import java.io.BufferedReader;
import java.io.IOException;

import service.TodoListService;

public class TodoListView {
	private TodoListService service = null;
	private BufferedReader br = null;
	
	public TodoListView() {
		
	}
	public void mainMenu() throws NumberFormatException, IOException {
		int input = 0;
		do {
			try {
				input = selectMenu();
				switch(input) {
				case 1 :  break;
				case 2 :  break;
				case 3 :  break;
				case 4 :  break;
				case 5 :  break;
				case 6 :  break;
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴에 작성된 번호만 입력 해주세요.");
				}
				System.out.println("=====================================================");
			} catch(NumberFormatException e) {
				
			}
		} while(input != 0);
	}
	private int selectMenu() throws NumberFormatException, IOException {
		System.out.println("\n===== Todo List =====\n");
		
		System.out.println("1. Todo List Full View(해야할 일)");
		System.out.println("2. Todo Detail View(세부내용 보기)");
		System.out.println("3. Todo Add(내용 추가하기)");
		System.out.println("4. Todo Complete(번호 바꾸기)");
		System.out.println("5. Todo Update(제목 및 내용 수정하기)");
		System.out.println("6. Todo Delete(인덱스 삭제하기)");
		System.out.println("0. EXIT");
		
		System.out.println("select menu number >>> ");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		return input;
	}
}
