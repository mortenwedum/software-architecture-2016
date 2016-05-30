<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Welcome</title>
</head>
<body>
<h2><a href="<c:url value='/uploadfile' />">Upload Example</a></h2>
<br>
<br>
<br>
<br>
<%
	if (session.getAttribute("uploadFile") != null
			&& !(session.getAttribute("uploadFile")).equals("")) {
%>
<h3>Uploaded File</h3>
<br>
<img
	src="<%=request.getRealPath("/") + "/images/"
						+ session.getAttribute("uploadFile")%>"
	alt="Upload Image" />
<%
	session.removeAttribute("uploadFile");
	}
%>
<a href="/phase3/">Back to the start</a>
</body>
</html>