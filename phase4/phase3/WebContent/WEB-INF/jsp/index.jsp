<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Phase3</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>
<body>
	<br>
	<div style="text-align:center">
		<h2>
			Phase3<br> <br>
		</h2>
		<h3>
			<a href="<c:url value='/new' />">Add New User</a>
			<a href="<c:url value='/FileUpload' />">File Upload</a>
			<a href="<c:url value='/createItem' />">Item creation and search</a>
		</h3>
	</div>
</body>
</html>