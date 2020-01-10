<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page isELIgnored="false" %>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Management System</title>
</head>
<body>
    <div align="center">
        <h1>All User !!</h1>
        <h3>
            <a href="adduser">New User</a>
        </h3>
        <table border="1">
 
            <th>Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>Mobile</th>
            <th>Country</th>
            <th>Action </th>
 
            <c:forEach var="user" items="${listUsers}">
                <tr>
 
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.pass}</td>
                    <td>${user.mobile}</td>
                    <td>${user.country}</td>
                    <td><a href="edituser?id=${user.id}">Edit</a>
                             <a
                        href="deleteuser?id=${user.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>