<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page errorPage="error.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form</title>
    </head>
    <body>
        
        
        <%
            
String num1 = request.getParameter("n1");
String num2 = request.getParameter("n2");

int a = Integer.parseInt(num1);
int b = Integer.parseInt(num2);
int c = a/b;
out.println("division of number is: " + c);
            
            %>
        
    </body>
    
</html>
