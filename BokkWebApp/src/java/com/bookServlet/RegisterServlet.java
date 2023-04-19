/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

//@WebServlet("/Register");
public class RegisterServlet extends HttpServlet{
  // private static final String q = "insert into book(BookName,BokkEdition,BookPrice) values(?,?,?)";
    
   public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        
       response.setContentType("text/html");
       //get printwritter
       PrintWriter out = response.getWriter(); 
      // out.println("Creating servlet");
      String BookName = request.getParameter("bookName");
      String BookEdition = request.getParameter("bookEdition");
      String BookPrice = request.getParameter("bookPrice");
      
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
    
          // CREATING A CONNECTION 
          String url = "jdbc:mysql://localhost:3306/form";
          String username = "root";
          
          String password = "26112002";
           try (Connection con = DriverManager.getConnection(url,username,password)) {
               String q = "insert into book(BookName,BokkEdition,BookPrice) values(?,?,?)";
               PreparedStatement pstmt = con.prepareStatement(q);
               pstmt.setString(1,BookName);
               pstmt.setString(2,BookEdition);
               pstmt.setString(3,BookPrice);
               
               int count = pstmt.executeUpdate();
               if(count==1){
                   out.println("<h1>Record is Updated....</h1>");
               }else{
                   out.println("Record is not Updated..");
               }  }
      }
          
      catch(Exception e) {
       //  out.println("Error....");
       
    }
      
        out.println("<a href='index.html'>Home</a>");
        out.println("<br>");
          out.println("<a href='BookList'>Book List</a>");
    }

 
   

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
       doGet(request,response);
    } 
    
    
}
