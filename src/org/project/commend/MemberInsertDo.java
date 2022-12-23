package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberInsertDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		System.out.println("회원가입");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String gender=request.getParameter("gender");
		String[] hobbys=request.getParameterValues("hobbys");
		
		String hobbysArry="";
		for(String hobby:hobbys) {
			hobbysArry += hobby+" ";
		}
		
		System.out.println(hobbysArry+" hobbysArry");
		String hometown=request.getParameter("hometown");
		String memo=request.getParameter("memo");
		
		
		MemberDao dao=MemberDao.getInstance();
		int result=dao.insertDo(userId,userPw,gender,hobbysArry,hometown,memo);
		
		String fowardURL="";
		if(result!=1) {
			System.out.println("회원가입 Fail");
			fowardURL="/index.jsp";
		}else {
			System.out.println("회원가입 Success");
			fowardURL="/login.jsp";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("fowardURL", fowardURL);
		
	}

}
