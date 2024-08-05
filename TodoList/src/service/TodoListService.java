package service;

import java.io.IOException;
import java.util.List;

import dto.Todo;

public interface TodoListService {

	/**
	 * 전체 목록 조회
	 * @return TodoList
	 */
	public abstract List<Todo> getMainList() throws IOException;

	/**
	 * 
	 * @return
	 */
	public abstract List<Todo> getTodoList();
	
	/**
	 * 
	 * @param todoIndex
	 * @return
	 */
	public abstract List<Todo> selectAll(int todoIndex);

	/**
	 * 
	 * @param title
	 * @param detail
	 * @return
	 */
	public abstract boolean mainList(String title, String detail);

	List<Todo> selectAll(String index);



	
}
