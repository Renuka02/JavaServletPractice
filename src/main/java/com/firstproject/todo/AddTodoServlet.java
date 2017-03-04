package com.firstproject.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.firstproject.todo.TodoService;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {

	private TodoService todoservice = new TodoService();
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

	{
		String newTodo = request.getParameter("todo");
		todoservice.addTodo(new Todo(newTodo));
		response.sendRedirect("/todo.do");
		// request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request,
		// response);
		// request.setAttribute("todos",todoservice.retrieveTodos());

		// request.setAttribute("password",request.getParameter("password"));
		// request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request,
		// response);

	}
	/*
	 * { String todo = request.getParameter("todo"); if ("".equals(todo)) {
	 * request.setAttribute("errorMessage", "Enter a valid Todo"); } else {
	 * todoservice.addTodo(new Todo(todo)); } request.setAttribute("todos",
	 * todoservice.retrieveTodos());
	 * request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request,
	 * response); }
	 */

}