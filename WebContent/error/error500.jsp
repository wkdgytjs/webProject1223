<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%
	response.setStatus(200);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>500 에러</title>
</head>
<body>
	JSP 코드 에러 또는 DB연결 실패가 발생되었습니다.
	<br/>다시 시도바랍니다.
</body>
</html>