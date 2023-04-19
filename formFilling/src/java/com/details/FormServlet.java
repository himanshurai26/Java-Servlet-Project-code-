package com.details;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class FormServlet extends HttpServlet {
   // public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome to Registration Servlet</h2>");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String street = request.getParameter("street");
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        String website = request.getParameter("website");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        String month = request.getParameter("month");
        String year = request.getParameter("year");
        String nation = request.getParameter("nation");
        String children = request.getParameter("child");
        String cond = request.getParameter("checkbox");
        if(cond!=null){
        if(cond.equals("checked")){
            out.println("<h3>Email : " + email + "</h3>");
            out.println("<h3>Password : " + password + "</h3>");
            out.println("<h3>Name : " + name + "</h3>");
            out.println("<h3>Phone : " +phone + "</h3>");
            out.println("<h3>Street : " + street + "</h3>");
            out.println("<h3>City : " + city + "</h3>");
            out.println("<h3>Country : " + country + "</h3>");
            out.println("<h3>Website: " + website + "</h3>");
            out.println("<h3>Gender : " + gender + "</h3>");
            out.println("<h3>Birthday: " + birthday + "</h3>");
            out.println("<h3>Month: " + month + "</h3>");
            out.println("<h3>Year: " + year + "</h3>");
            out.println("<h3>Nationality : " + nation + "</h3>");
            out.println("<h3>Children : " + children + "</h3>");
        }else{
            out.println("<h1> You have not accepted the term and condition </h1>");
        }
        
        }else{
            out.println("<h1> You have not accepted the term and condition </h1>");
        }
    
    }
    
}
