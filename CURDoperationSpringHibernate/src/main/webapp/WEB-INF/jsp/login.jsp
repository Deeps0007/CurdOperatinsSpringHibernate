<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>  
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login user</title>
</head>

<body>
<h1>${msg }</h1>
<h1>${loginmsg}</h1>
<form:form action="signin" modelAttribute="bean">
Name:<form:input path="name"/><br>
Password:<form:password path="pass"/><br>
<input type="submit" value="Sign-in">
</form:form>
</body>
</html>