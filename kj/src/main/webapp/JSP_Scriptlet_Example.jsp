<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Scriptlet Example</title>
</head>
<body>
	<h1>Welcome to our website!</h1>



    <%-- JSP Scriptlet to get the current date --%>

    <% java.util.Date currentDate = new java.util.Date(); %>



    <%-- JSP Scriptlet to set a variable --%>

    <% int numberOfItems = 10; %>



    <p>Today's date: <%= currentDate %></p>

    <p>We have <%= numberOfItems %> items in stock.</p>
</body>
</html>