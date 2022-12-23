<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
String userId="m1";
String userPw="1111";

	private int method1(int num1,int num2){
		int result=1;
		for(int i=0;i<num2;i++){
			result*=num1;
		}
		return result;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2의 거듭제곱</title>
</head>
<body>
아이디: <%= userId %>, 비밀번호:<%= userPw %> <br/>
	2^1=<%= method1(2, 1) %> <br/>
	2^2=<%= method1(2, 2) %> <br/>
	2^3=<%= method1(2, 3) %> <br/>
	2^4=<%= method1(2, 4) %> <br/>
	2^5=<%= method1(2, 5) %> <br/>
</body>
</html>