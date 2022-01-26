/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ProfileServlet extends HttpServlet {
 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
         throws IOException, ServletException{
   response.setContentType("text.html");  
   PrintWriter out = response.getWriter();
   
   request.getRequestDispatcher("link.html").include(request, response);
   
   Cookie ck[] = request.getCookies();
   if(ck!=null){
       String name = ck[0].getValue();
       if(!name.equals("")||name!=null){
           out.print("<b>Welcome to Profile </b>");
           out.print("<br>Welcome" +name);
       }
       }else{
           out.print("Please login first");
           request.getRequestDispatcher("login.html").include(request, response);
           
       }
    out.close();
   }
   
 }
  