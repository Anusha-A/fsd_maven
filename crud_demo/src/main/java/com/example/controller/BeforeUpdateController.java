package com.example.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.CustomerDao;
import com.example.dao.CustomerDaoImpl;
import com.example.model.Customer;

@WebServlet("/update.do")
public class BeforeUpdateController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private CustomerDao dao;

	@Override
	public void init() throws ServletException {
		dao = new CustomerDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Customer c=dao.getCustomerById(Integer.parseInt(request.getParameter("customerId").toString()));
		request.setAttribute("customer", c);
		RequestDispatcher view=request.getRequestDispatcher("customer_update.jsp");
		view.forward(request, response);

	}

}