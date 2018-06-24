
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Tourist</title>
</head>


<c:out value="${sessionScope.message}"/>
<form name="AddTouristForm" method="post" action="${pageContext.servletContext.contextPath}/AddTourist">

    Name: <input type="text" name="name"/> <br/>
    Surname: <input type="text" name="surname"/> <br/>
    phone: <input type="text" name="phone"/> <br/>
    email: <input type="text" name="email"/> <br/>
    Password: <input type="text" name="group_id"/> <br/>

    <input type="submit" value="AddTourist" />
</form>
</body>
</html>



