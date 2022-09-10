package com.laptrinh.controller.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinh.model.UserModel;
import com.laptrinh.service.IUserService;
import com.laptrinh.service.impl.UserService;


@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {
	
	
/**
	 * 
	 */
	private static final long serialVersionUID = -8404487490153647739L;
	@Inject
	private IUserService userService;
	
	/**
	 * 
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {					
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.html");
		rd.forward(request, response);
		List<UserModel> results = userService.findAllUser();
		System.out.print(1);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
