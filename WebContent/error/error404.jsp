<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %> <%-- 에러페이지 --%>
<%
	response.setStatus(200);
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404 에러</title>
</head>
<body>
	요청한 페이지는 존재하지 않습니다.
	<br/> 주소를 올바르게 입력했는지 확인 바랍니다.
</body>
</html>