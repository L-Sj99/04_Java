package dao;

import java.io.IOException;
import java.util.List;

import dto.Todo;

public interface TodoListDao<Todo> {
	List<Todo> getTodoList();
	
	boolean addTodo(Todo list) throws IOException;
	
}
