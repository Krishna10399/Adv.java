<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Example</title>
</head>
<body>
	<%-- Define a variable --%>

    <% int age = 25; %>

    

    <%-- Display the value of the variable using JSP Expression --%>

    <p>Age: <%= age %></p>

    

    <%-- Perform a calculation using JSP Expression --%>

    <% int yearsUntilRetirement = 65 - age; %>

    <p>Years until retirement: <%= yearsUntilRetirement %></p>
</body>
</html>