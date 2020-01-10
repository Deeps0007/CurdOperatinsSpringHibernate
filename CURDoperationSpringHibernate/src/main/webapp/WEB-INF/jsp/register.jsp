<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Details</title>
</head>
<body>
    <div align="center">
        <h1>Add/Edit User</h1>
        <form:form action="saveuser" method="post" modelAttribute="user">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr><br>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr><br>
            <tr>
                <td>Password:</td>
                <td><form:password path="pass" /></td>
            </tr><br>
            <tr>
                <td>Mobile:</td>
                <td><form:input path="mobile" /></td>
            </tr><br>
             <tr>
                <td>Country:</td>
                <td><form:input path="country" /></td>
            </tr><br>
            
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Submit Details"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>