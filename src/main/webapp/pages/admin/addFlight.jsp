
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Tourist</title>
</head>


<c:out value="${sessionScope.message}"/>
<form name="addFlightForm" method="post" action="${pageContext.servletContext.contextPath}/addFlight">

    transferId: <input type="text" name="transferId"/> <br/>
    price: <input type="text" name="price"/> <br/>
    arrival Point: <input type="text" name="arrivalPoint"/> <br/>
    destination Point: <input type="text" name="destinationPoint"/> <br/>
    time: <input type="text" name="time"/> <br/>
    arrivalTime: <input type="text" name="arrivalTime"/> <br/>

    <input type="submit" value="addFlight" />
</form>
</body>
</html>

