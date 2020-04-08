<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.7.js"></script>
<script type="text/javascript" src="../js/jquery.form.js"></script>
</head>
<body>
Hello
恭喜！
整合成功
<form id="editForm">
<table border="2">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>password</th>
		<th>operation1</th>
		<th>operation2</th>
	</tr>
	<tr>
		<td><input type="text" value="${user.id }" name="id"></td>
		<td><input type="text" value="${user.name }" name="name"></td>
		<td><input type="text" value="${user.password }" name="password"></td>
		<td><input type="button" value="save" id="save"></td>
		<td><input type="button" value="back" id="back"></td>
	</tr>
</table>
</form>
</body>
<script>

$(function(){
	$("#save").click(function(){
	
		var url;
			url="${pageContext.request.contextPath}/ssh/updateUser.do";
		
		//异步提交表单
		var options = {
			url:	   url,
	        success:   callback, 
	        type:      'post',      
	        dataType:  'json'
		};

		$("#editForm").ajaxSubmit(options);
		
		alert("修改ing");
	});
	
	$("#back").click(function(){
		window.location.href="${pageContext.request.contextPath}/ssh/findAllUser.do";
	});
	
	function callback(data){
		alert("chenggong");
	};
});

</script>
</html>