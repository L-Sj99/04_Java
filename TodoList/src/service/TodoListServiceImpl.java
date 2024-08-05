package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import dao.TodoListDao;
import dto.Todo;


public class TodoListServiceImpl implements TodoListService{
	private TodoListDao dao = null;
	
	@Override
	public List<Todo> getMainList() {

		return null;
	}
	public String deleteMember(Todo target) throws IOException {
	List<Todo> list = new List<Todo>();
	}
	@Override
	public List<Todo> getTodoList() {

		return null;
	}
	@Override
	public List<Todo> selectAll(String index) {

		return null;
	}
	@Override
	public boolean mainList(String title, String detail) {

		return false;
	}
	@Override
	public List<Todo> selectAll(int todoIndex) {

		return null;
	}


}

