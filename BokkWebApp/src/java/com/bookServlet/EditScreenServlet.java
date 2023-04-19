/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EditScreenServlet extends HttpServlet {

   //public static final String q = "select BookName, BokkEdition, BookPrice from book where id = ?";
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        
       response.setContentType("text/html");
       //get printwritter
       PrintWriter out = response.getWriter(); 
      // out.println("Creating servlet");
      
      //get the id of record
      int id = Integer.parseInt(request.getParameter("id"));
     
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
    
          // CREATING A CONNECTION 
          String url = "jdbc:mysql://localhost:3306/form";
          String username = "root";
          
          String password = "26112002";
           try (Connection con = DriverManager.getConnection(url,username,password)) {
           //    String q = "select Id, BookName, BokkEdition, BookPrice from book";
           String q = "select BookName, BokkEdition, BookPrice from book where id = ?";
               PreparedStatement pstmt = con.prepareStatement(q);
              //  ResultSet res;
             // ResultSet rs = pstmt.executeQuery();
         pstmt.setInt(1,id);
        // rs.next();
         ResultSet rs = pstmt.executeQuery(q);
         rs.next();
         out.println("<form action='editurl?id="+id+"' method='post'>" );
         out.println("<table align='center>");
         out.println("<tr>");
         out.println("<td>Book Name</td>");
         out.println("<td><input type='text' name='bookName' value ='"+rs.getString(1)+"'></td>");          
         out.println("</tr>");
         out.println("<tr>");
         out.println("<td>Book Name</td>");
         out.println("<td><input type='text' name='bookName' value ='"+rs.getString(1)+"'></td>");          
         out.println("</tr>");
         out.println("<tr>");
         out.println("<td>Book Edition</td>");
         out.println("<td><input type='text' name='bookEdition' value ='"+rs.getString(2)+"'></td>");          
         out.println("</tr>");
        out.println("<tr>");
         out.println("<td>Book Price</td>");
         out.println("<td><input type='text' name='bookPrice' value ='"+rs.getString(3)+"'></td>");          
         out.println("</tr>");
         out.println("<tr>");
         out.println("<ts><input type='submit' value='Edit'></td>");
        out.println("<ts><input type='reset' value='cancel'></td>");
         out.println("</tr>");
         
         out.println("</table>");
              out.println("</form>");
              
            
           }
      }
          
      catch(Exception e) {
       //  out.println("Error....");
       
    }
      out.println("<a href='index.html'>Home</a>");
    }


    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
       doGet(request,response);
    } 
    
    
    
}
