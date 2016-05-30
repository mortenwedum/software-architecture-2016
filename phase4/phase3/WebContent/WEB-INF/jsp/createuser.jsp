<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Users</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>
<body>
    <h2>List of Users</h2>  
    <table>
        <tr>
            <td>Firstname</td><td>Joining Date</td><td>Address</td><td>Phone number</td><td></td>
        </tr>
        <c:forEach items="${user}" var="user">
            <tr>
            <td>${user.name}</td>
            <td>${user.joiningDate}</td>
            <td>${user.address}</td>
            <td>${user.phoneNumber}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/new' />">Add New User</a>
    <a href="/phase3/">Back to the start</a>
</body>
</html>