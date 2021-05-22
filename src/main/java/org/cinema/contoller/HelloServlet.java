package org.cinema.contoller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    private static final String INDEX = "/WEB-INF/view/index.jsp";

    @Override
    public void init() {
        System.out.println("~~~~~Servlet init~~~~~");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            req.getRequestDispatcher(INDEX).forward(req, res);
        } catch (ServletException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void destroy() {
        System.out.println("~~~~~Servlet destroy~~~~~");
    }
}
