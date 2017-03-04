package com.firstproject.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.firstproject.todo.TodoService;

@WebServlet(urlPatterns = "/todo.do")
public class ListTodoServlet extends HttpServlet {

	private TodoService todoservice = new TodoService();

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

	{
		// String name = request.getParameter("name");
		request.setAttribute("todos", todoservice.retrieveTodos());

		// request.setAttribute("password",request.getParameter("password"));
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);

	}

}