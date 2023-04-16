

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error1.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //fetch two number 

            String num1 = request.getParameter("n1");
            String num2 = request.getParameter("n2");

            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            int c = a / b;

            // out.println("The Divisible Number is: " + c);
%>

        <h1>Result is : <%= c%></h1>
    </body>
</html>
