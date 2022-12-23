package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.project.dao.MemberDao;

public class LoginOkDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		System.out.println("로그인");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		
		MemberDao dao=MemberDao.getInstance();
		int result=dao.loginOk(userId,userPw);
		String fowardURL="";

		HttpSession session=request.getSession();
		
		if(result!=1) {
			System.out.println("로그인 실패");
			fowardURL="/loginFail.jsp";
		}else {
			System.out.println("로그인 성공");
			fowardURL="/index.jsp";
			
			session.setAttribute("sessionId", userId);
			session.setMaxInactiveInterval(60*30);
		}
		request.setAttribute("fowardURL", fowardURL);
	}

}
