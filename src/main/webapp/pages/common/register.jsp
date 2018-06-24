
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>


<c:out value="${sessionScope.message}"/>
<form name="registerForm" method="post" action="${pageContext.servletContext.contextPath}/register">

    Name: <input type="text" name="name"/> <br/>
    birthday:<input type="text" name="DOB"/> <br/>
    phone: <input type="text" name="phone"/> <br/>
    email: <input type="text" name="email"/> <br/>
    Password: <input type="text" name="password"/> <br/>

    <input type="submit" value="Register" />
</form>
</body>
</html>

