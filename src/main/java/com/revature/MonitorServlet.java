package com.revature;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MonitorServlet", urlPatterns = { "health" })
public class MonitorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MonitorService service = new MonitorService();
        String command = req.getParameter("command");
        String output = "";
        try {
            output = service.service(command);
        } catch (Exception e) {
            e.printStackTrace();
        }
        resp.getWriter().println(output);
    }
}