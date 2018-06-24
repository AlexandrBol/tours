
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<c:out value="${sessionScope.message}"/>
<form action="${pageContext.request.contextPath}/login" method="get">
    Email:<br>
    <input type="text" name="email"/> <br>
    Password:<br>
    <input type="password" name="password"> <br><br>
    <input type="submit" value="login" >
</form>
</body>
</html>
