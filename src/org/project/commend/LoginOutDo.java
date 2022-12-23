package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginOutDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		System.out.println("로그아웃");
	}

}