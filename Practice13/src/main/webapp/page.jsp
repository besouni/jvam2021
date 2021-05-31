<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            out.print("<h2>Hello JSP</h2>");
        %>
        <jsp:include page="forms/getForm.jsp" />
        <hr>
        <%@include file="forms/postForm.jsp"%>
    </body>
</html>
