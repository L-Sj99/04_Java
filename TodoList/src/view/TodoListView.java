package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import dto.Todo;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListView {
	private TodoListService service = null;
	private BufferedReader br = null;
	private String detail;
	
	public void mainList() {
		try {
			service = new TodoListServiceImpl();			
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			System.out.println("*** 작성된 인덱스만 입력해 주세요 ***");
			e.printStackTrace();
			System.exit(0);
		} 
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
	
	private void selectAll() throws IOException {
		System.out.println("\n===============[1. Todo List Full View]===============\n");

		List<Todo> todoList = service.getMainList();

		if(todoList.isEmpty()) {
			System.out.println("\n  \n");
			return;
		}
		String[] gradeArr = {"HTML 공부하기", "CSS 공부하기", "JAVA 공부하기"};
		System.out.printf("%-6s %-1s %4s %s \n", "[인덱스]", "[등록일]", "[완료여부]", "[할 일 목록]");

		for(Todo list : todoList) {
			// System.out.printf();
		}
	}
	private void selsctDetail() throws IOException {
		System.out.println("\n===============[2. Todo Detail View]===============\n");
		System.out.println("인덱스 번호 입력 : ");
		int todoIndex = br.read();
	}
	
	
	private void addTodo() throws IOException {
		System.out.println("\n===============[3. Todo Add]===============\n");
		System.out.print("할 일 제목 입력 : ");
		String title = br.readLine();
		
		while(true) {
		System.out.print("세부 내용 작성 (입력 종료 시 !wq 작성 후 엔터)");
		detail = br.readLine();
		} 	

		// boolean result = service.mainList(title, detail);
		
		// if(result) {
			// System.out.printf("\n [%s]인덱스에 추가 되었습니다. \n");	
		// }
	}
	
	private void Complete() throws IOException{
		System.out.println("\n===============[4. Todo Complete]===============\n");
		System.out.println("O <-> X 변경할 인덱스 번호 입력 : ");
		int todoIndex = br.read();
	}
	
	private void update() throws IOException{
		System.out.println("\n===============[5. Todo Update]===============\n");
		System.out.println("수정할 Todo인덱스 번호 입력 : ");
		int todoIndex = br.read();
		
		List<Todo> searchIndex = service.selectAll(todoIndex);
		
		if(searchIndex.isEmpty()) {
			System.out.println("### 입력한 인덱스 번호에 할 일(Todo)가 존재하지 않습니다 ###");
			return;
		}
		System.out.println("@@@@@@@@@@@[수정 전]@@@@@@@@@@@@@@@\r\n"
				+ "--------------------------------------------");
		System.out.println("제목 : \n등록일 : \n완료 여부 : \n");
		System.out.println("\n세부내용\n--------------------------------------------");
		System.out.println("수정할 제목 : ");
		String updateTitle = br.readLine();
		System.out.println("수정할 세부 내용 작성 (입력 종료 시 !wq 작성 후 엔터)\r\n"
				+ "-----------------------------------------------");
		String updateDetail = br.readLine();
		
		
	}
	
	private void deleteList() throws IOException{
		System.out.println("===============[6. Todo Delete]===============");
		System.out.println("삭제할 인덱스 번호 입력 : ");
		int index = br.read();
		int todoIndex = 0;
		List<Todo> searchIndex = service.selectAll(todoIndex);
	}
}
