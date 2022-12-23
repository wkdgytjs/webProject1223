package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.LoginOkDo;
import org.project.commend.LoginOutDo;
import org.project.commend.MemberCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;

@SuppressWarnings("serial")
@WebServlet("*.do")
public class MemberController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("GET");
		webApp(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("POST");
		webApp(request, response);
	}

	private void webApp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String basicURL = uri.substring(path.length());

		String fowardURL = "";

		MemberCommend commend;

		if (basicURL.equals("/joinView.do")) {
			fowardURL = "/join.jsp";
		} else if (basicURL.equals("/memberInsert.do")) {
			commend = new MemberInsertDo();
			commend.excuteQueryCommend(request, response);
			fowardURL = (String) request.getAttribute("fowardURL");
		} else if (basicURL.equals("/memberSelect.do")) {
			commend = new MemberSelectDo();
			commend.excuteQueryCommend(request, response);
			fowardURL = (String) request.getAttribute("fowardURL");
		} else if (basicURL.equals("/memberUpdate.do")) {
			commend = new MemberUpdateDo();
			commend.excuteQueryCommend(request, response);
			fowardURL = (String) request.getAttribute("fowardURL");
		} else if (basicURL.equals("/memberDelete.do")) {
			commend = new MemberDeleteDo();
			commend.excuteQueryCommend(request, response);
			fowardURL = (String) request.getAttribute("fowardURL");
		} else if (basicURL.equals("/loginOk.do")) {
			commend = new LoginOkDo();
			commend.excuteQueryCommend(request, response);
			fowardURL = (String) request.getAttribute("fowardURL");
		} else if (basicURL.equals("/logout.do")) {
			commend = new LoginOutDo();
			commend.excuteQueryCommend(request, response);
			fowardURL = (String) request.getAttribute("fowardURL");
		} else if (basicURL.equals("/index.do")) {
			fowardURL = "/index.jsp";
		} else if (basicURL.equals("/loginView.do")) {
			fowardURL = "/login.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(fowardURL);
		dispatcher.forward(request, response);
	}
}
