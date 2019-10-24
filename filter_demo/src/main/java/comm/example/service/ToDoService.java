package comm.example.service;


import java.util.ArrayList;
import java.util.List;

import comm.example.model.Todo;

public class ToDoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn Web Application Development"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn Spring Rest Services"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodo(Todo todo) {
		todos.add(todo);
	}

	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}
