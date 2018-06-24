
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin page</title>
</head>
<body>

<h3>Admin page</h3>
<li><a href="addTour.jsp">Add Tour</a></li>
<li><a href="addFlight.jsp">Add Transfer</a></li>
<li><a href="addTourist.jsp">Add Tourist</a></li>

<form name="SessionForm" method="post" action="${pageContext.servletContext.contextPath}/admins">

</form>
</body>
</html>
