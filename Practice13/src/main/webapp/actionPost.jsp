<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String user = request.getParameter("user");
            out.print(user);
            Enumeration par = request.getParameterNames();
            while(par.hasMoreElements()){
               String formName = (String)par.nextElement();
               out.print("<h3>"+formName+"</h3>");
               
            }
        %>
    </body>
</html>
