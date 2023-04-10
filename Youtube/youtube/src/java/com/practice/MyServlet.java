
package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        System.out.println("This is get Method.........");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> This is Get method of my Servlet</h1>");
    }
            }
