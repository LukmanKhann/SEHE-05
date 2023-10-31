<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"  %>
    
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>help page </h1>

<%
/* String name = (String)request.getAttribute("name");
Integer num = (Integer)request.getAttribute("number");
LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
%>

<%-- <h1>the name is <%= name %></h1>
<h1>the number is <%= num %></h1>
<h1>the time is <%= time %></h1> --%>

<!-- short form we can directly write the code and we can avoid the above code  -->
<h1>my name is ${name}</h1>
<h1>number is ${number}</h1>
<h1>The time is ${time }</h1>
<hr>


<c:forEach var="item" items="${marks }">
<h1>${item }</h1>
</c:forEach>
</body>
</html>