<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Employee</h1>
<form action="update">
<input type = "hidden" name = "id" value="${u.getId() }">
Name :<input type = "text" name = "name" value="${u.getName() }">
email :<input type = "email" name = "email"  value = "${u.getEmail() }">
phone :<input type = "tel" name = "phone" value  = "${u.getPhone() }">
<input type = "submit" name = "register" >
</form>
</body>
</html>