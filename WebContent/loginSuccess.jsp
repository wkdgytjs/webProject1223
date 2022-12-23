<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String sessionId=(String)session.getAttribute("sessionId");
	
	if(sessionId==null){//로그인이 안된 경우
			out.write("<script>");
			out.write("alert(' 로그인후 이용해 주세요.\n 로그인페이지로 이동합니다.');");
			out.write("location.href='loginView.do';");
			out.write("</script>");
	}
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
</body>
</html>