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
<h3>SUCCESS2</h3>
<table cellpadding="10" cellspacing="0" border="1" id="table">
	<tr>
		<th>id</th>
		<th>username</th>
		<th>loginacct</th>
		<th>userpswd</th>
		<th>email</th>
		<th>createtime</th>
		<th>d_id</th>
		<th>deptName</th>
	</tr>
</table>
<script type="text/javascript" src="${ctp }/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			url:"${ctp}/emps2",
			dataType:"json",
			success:function(data){
// 				for(var o in data){   // o 是索引 
// 			        alert("id:"+data[o].id+" username:"+data[o].username );  
// 			      } 
// 				alert("each...");
				$.each(data,function(index,obj){
// 					alert(obj.id + " username:"+obj.username);
					
					$("#table").append(
							"<tr>" +
								"<td>" + obj.id  + "</td>" +
								"<td>" + obj.username + "</td>" +
								"<td>" + obj.loginacct + "</td>" +
								"<td>" + obj.userpswd + "</td>" +
								"<td>" + obj.email + "</td>" +
								"<td>" + obj.createtime + "</td>" +
								"<td>" + obj.dept.id + "</td>" +
								"<td>" + obj.dept.deptName + "</td>" +
							"</tr>");
				});
			},
			error:function(){
				alert("chucuole");
			}
		});
	});
</script>
</body>
</html>