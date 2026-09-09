package com.dhurka.dhurkabookmart.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Temporary login validation
        if (email != null && !email.isEmpty()
                && password != null && !password.isEmpty()) {

            response.sendRedirect("index.jsp");

        } else {

            response.sendRedirect("login.jsp");
        }
    }
}
