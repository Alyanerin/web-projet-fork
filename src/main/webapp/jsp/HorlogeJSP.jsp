<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Horloge JSP</title>
</head>
<body>
	<% for(int i = 0; i < 3; ++i) { %>
  <h1>Actuellement il est <%= request.getAttribute("heure") %> heure française !</h1>
  	<% } %>
</body>
</html>