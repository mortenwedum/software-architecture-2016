<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees List</title>
<!-- Bootstrap CSS -->
<%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<style type="text/css">
.myrow-container {
margin: 20px;
}
</style>
</head>
<body class=".container-fluid">
<div class="container myrow-container">
<div class="panel panel-success">
<div class="panel-heading">
<h3 class="panel-title">
<div align="left"><b>Item List</b> </div>
<div align="right"><a href="createItem">Add New Item</a></div>
</h3>
</div>
<div class="panel-body">
<c:if test="${empty itemList}">
There are no Items
</c:if>
<c:if test="${not empty itemList}"> 

<form action="searchItem">
<div class="row">
<div class="col-md-6"><div class="col-md-6">Search Items:</div><div class="col-md-6"> <input type="text" name="searchName" id="searchName"> </div></div>
<div class="col-md-4"><input class="btn btn-success" type='submit' value='Search'/></div>
</div>
</form> 

<table class="table table-hover table-bordered">
<thead style="background-color: #bce8f1;">
<tr>
<th>Id</th>
<th>Name</th>
<th>Price</th>
<th>Description</th>
<th>Edit</th>
<th>Delete</th>
</tr>
</thead>
<tbody>
<c:forEach items="${itemList}" var="item">
<tr>
<th><c:out value="${item.id}"/></th>
<th><c:out value="${item.name}"/></th>
<th><c:out value="${item.price}"/></th>
<th><c:out value="${item.description}"/></th> 
<th><a href="editItem?id=<c:out value='${item.id}'/>">Edit</a></th>
<th><a href="deleteItem?id=<c:out value='${item.id}'/>">Delete</a></th> 
</tr>
</c:forEach>
</tbody>
</table>
</c:if>
</div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script> 
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<%-- <script src="<c:url value="/resources/js/jquery-2.1.3.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
--%>

</body>
</html>