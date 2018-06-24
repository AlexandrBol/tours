<%@ taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Tourist</title>
</head>


<c:out value="${sessionScope.message}"/>
<form name="AddTourForm" method="post" action="${pageContext.servletContext.contextPath}/AddTour">

    number Of Person: <input type="text" name="numberOfPerson"/> <br/>
    number of Kids: <input type="text" name="numberKids"/> <br/>
    start Date: <input type="text" name="startDate"/> <br/>
    end Date: <input type="text" name="endDate"/> <br/>
    transferId: <input type="text" name="transferId"/> <br/>
    price: <input type="text" name="price"/> <br/>

    <input type="submit" value="AddTour" />
</form>
</body>
</html>
