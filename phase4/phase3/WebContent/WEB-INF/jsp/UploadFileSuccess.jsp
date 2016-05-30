<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Upload Files</title>
<style type="text/css">

</style>
</head>
<body>
    <br>
    <br>
    <div align="center">
        <ol>
            <c:forEach items="${files}" var="file">
           - ${file} <br>
            </c:forEach>
        </ol>
        <a href="http://localhost:8080/phase3/"><input
            type="button" value="Go Back" /></a> <br />
        <br />
        <br />

    </div>
</body>
</html>