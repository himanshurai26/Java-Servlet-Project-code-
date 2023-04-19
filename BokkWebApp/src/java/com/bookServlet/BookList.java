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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookList")
public class BookList extends HttpServlet {
      public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        
       response.setContentType("text/html");
       //get printwritter
       PrintWriter out = response.getWriter(); 
      // out.println("Creating servlet");
     
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
    
          // CREATING A CONNECTION 
          String url = "jdbc:mysql://localhost:3306/form";
          String username = "root";
          
          String password = "26112002";
           try (Connection con = DriverManager.getConnection(url,username,password)) {
               String q = "select Id, BookName, BokkEdition, BookPrice from book";
               PreparedStatement pstmt = con.prepareStatement(q);
              //  ResultSet res;
              ResultSet rs = pstmt.executeQuery();
        out.println("<table border='1'align='center'>");
        out.println("<tr>");
        out.println("<th>Book Id</th>");
        out.println("<th>Book Name</th>");
        out.println("<th>Book Edition</th>");
        out.println("<th>Book Price</th>");
        out.println("<th>Edit</th>");
        out.println("<th>Delete</th>");
        out.println("</tr>");
              
              while(rs.next()){
            out.println("<tr>");
            out.println("<td>"+rs.getInt(1)+"</td>");
         out.println("<td>"+rs.getString(2)+"</td>");
         out.println("<td>"+rs.getString(3)+"</td>");
          out.println("<td>"+rs.getFloat(4)+"</td>");
          out.println("<td><a href='editScreen?id="+rs.getInt(1)+"'>Edit</a></td>");
           out.println("<td><a href='deleteurl?id="+rs.getInt(1)+"'>Delete</a></td>");
          
              }
              
              out.println("</table>");
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
