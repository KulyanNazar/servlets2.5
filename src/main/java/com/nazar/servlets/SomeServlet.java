package com.nazar.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/some.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("mainInput");
        Cookie cookie = new Cookie("input",value);
        resp.addCookie(cookie);
        HttpSession session = req.getSession();
        session.setAttribute("text",value);
        doGet(req,resp);
    }
}
