
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Tourist</title>
</head>


<c:out value="${sessionScope.message}"/>
<form name="addHotelForm" method="post" action="${pageContext.servletContext.contextPath}/addHotel">

    name: <input type="text" name="name"/> <br/>
    adress: <input type="text" name="adress"/> <br/>
    stars: <input type="text" name="stars"/> <br/>
    description: <input type="text" name="description"/> <br/>
    price: <input type="text" name="price"/> <br/>

    <input type="submit" value="addHotel" />
</form>
</body>
</html>

