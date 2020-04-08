<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.7.js"></script>
</head>
<body>
Hello
恭喜！
整合成功啦
<table border="2">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>password</th>
		<th>look</th>
		<th>del</th>
		<th><a href="javascript:void(0);" class="add" >add</a></th>
	</tr>
	
	
<c:forEach items="${list }" var="user" >
	<tr>
		<td><c:out value="${user.id }"></c:out></td>
		<td><c:out value="${user.name }"></c:out></td>
		<td><c:out value="${user.password }"></c:out></td>
		<td><a href="javascript:void(0);" class="look" rel="${user.id }">look</a></td>
		<td><a href="javascript:void(0);" class="del" rel="${user.id }">del</a></td>
	</tr>
</c:forEach>

</table>

</body>
<script>
$(function(){
	$(".look").click(function(){
	
	var id = $(this).attr('rel');
		window.location.href="${pageContext.request.contextPath}/ssh/get.do?id="+id;
	});

	$(".add").click(function(){
	
		window.location.href="${pageContext.request.contextPath}/ssh/add.do";
	});
	
	$(".del").click(function(){
	var id = $(this).attr('rel');
		window.location.href="${pageContext.request.contextPath}/ssh/del.do?id="+id;
	});
	

});

</script>
</html>