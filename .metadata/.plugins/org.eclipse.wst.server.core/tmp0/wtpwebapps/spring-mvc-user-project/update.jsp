<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post" >

<div>
<input type ="hidden" value = "id" value = "${u.getId() }">
Name : <input type = "text" name = "name" value = "${u.getName() }">
Email : <input type = "email" name = "email" value = "${u.getEmail() }">
Phone : <input type = "tel" name = "phone" value = "${u.getPhone() }">
Age : <input type = "number" name = "age" value = "${u.getAge() }">
Password : <input type = "password" name = "password" value = "${u.getPassword() }">
 <input type = "submit" value="update">



</div>

</form>

</body>
</html>