
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<jsp:include page="/TourServlet" flush="true">--%>


<html>
<head>
    <title>All tours</title>

</head>
<body>
<p>asdasdasd</p>

    <c:forEach items="${tourList}" var="tourList">
        <p><c:out value="${tourList.price}"/></p>
        <p>${tourList.price}</p>
    </c:forEach>





</body>

</html>
