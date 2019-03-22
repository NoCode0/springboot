<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${ctp }/main.html" method="post">
	<input type="text" name="loginacct"/><br>
	<span style="color:red;">${errorInfo }</span>	
	<c:remove var="errorInfo" scope="session"/>
	<br>
	<input type="password" name="userpswd"/><br>
	<input type="submit" value="Submit"/>
</form>
</body>
</html>