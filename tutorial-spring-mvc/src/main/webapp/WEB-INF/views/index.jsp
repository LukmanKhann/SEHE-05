<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>this is home page</h1>
<h1>called by home controller</h1>
<h1> url/home </h1>
<h1>my name is lukman</h1>
<%

String name = (String) request.getAttribute("name");
Integer num= (Integer) request.getAttribute("id");
List<String> friends = (List<String>)request.getAttribute("f");

%>
<h1> Name is <%= name %></h1>
<h1>Id is <%= num %></h1>

<%

for(String s:friends){
	out.print(s);
	
}
%>
</body>

</html>