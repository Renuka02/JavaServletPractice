package com.firstproject.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
private static List <Todo> todos = new ArrayList<>(); 

static{
	todos.add(new Todo("learn web application"));

	todos.add(new Todo("learn hibernate application"));

	todos.add(new Todo("learn spring application"));
}

public List<Todo> retrieveTodos(){
	return todos;
}
}
