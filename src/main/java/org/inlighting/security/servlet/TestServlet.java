package org.inlighting.security.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        System.out.println("TestServlet doGet");
  
        resp.setContentType("text/html; charset=UTF-8");// 編碼要放在getWriter之前

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Test Servlet</title>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\"> ");  
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>TestServlet doGet</h1>");
        out.println("</body>");
        out.println("</html>");       
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("TestServlet doPost");

        resp.setContentType("text/html; charset=UTF-8");// 編碼要放在getWriter之前

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Test Servlet</title>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\"> ");  
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>TestServlet doPost</h1>");
        out.println("</body>");
        out.println("</html>");

    }

}