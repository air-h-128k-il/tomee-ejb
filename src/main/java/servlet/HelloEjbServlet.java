/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;

/**
 *
 * @author akiba
 */
@WebServlet("/hello")
public class HelloEjbServlet extends HttpServlet {

  @EJB
  private HelloEjb ejb;
  
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
              
        out.print("<html><head></head><body><h1>TomEE sample</h1>");
        out.print("<h2>Following message comes from ejb -> "+this.ejb.hello()+"</h2>");
        out.print("</body>");        
        out.print("</html>");
        
        this.ejb.hello();
    }  
  
}
