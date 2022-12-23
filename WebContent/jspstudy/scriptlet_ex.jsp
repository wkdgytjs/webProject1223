<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setAttribute("sessionId", "admin");
	String sessionId=(String) session.getAttribute("sessionId");
	//세션 아이디가 admin이면
	if(!sessionId.equals("admin")){
		//자바스크립트 "admin"이 아니면 네이버로 이동
		out.write("<script>");
		out.write("  alert('관리자만 이용할 수 있습니다.');");
		out.write("  location.href='http://naver.com'    ");
		out.write("</script>");
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립틀릿(scriptlet)</title>
</head>
<body>
	<h1>관리자 페이지</h1>
	<span>관리자 아이디: <%= sessionId %></span><br/>
	<%
		int total=0;
		for(int i=1;i<=100;i++){
			total+=i;//0+1+2+3+4,,,+100
		}
	%>
	<div>1부터 100까지 합=<%= total %></div>
	<%
		for(int i=101;i<=200;i++){
			total+=i;
		}
	%>
	<div>1부터 200까지 합=<%= total %></div>
</body>
</html>