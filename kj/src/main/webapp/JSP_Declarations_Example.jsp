<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Declarations Example</title>
</head>
<body>
		 <%-- JSP Declaration to define variables --%>

    <%!

        int count = 0;

        String message = "Hello, World!";

    %>



    <%-- JSP Declaration to define a method --%>

    <%!

        public String generateMessage() {

            count++;

            return message + " Count: " + count;

        }

    %>



    <h1>Welcome to our JSP Declarations Example</h1>

    

    <%-- Display the generated message using JSP Expression --%>

    <p><%= generateMessage() %></p>
</body>
</html>