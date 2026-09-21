package com.dhurka.dhurkabookmart.controller;

import com.dhurka.dhurkabookmart.dao.BookDAO;
import com.dhurka.dhurkabookmart.model.Book;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/add-book")
public class AddBookServlet extends HttpServlet {

    private BookDAO bookDAO = new BookDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));

        int id = bookDAO.getAllBooks().size() + 1;

        Book book = new Book(id, title, author, price);

        bookDAO.addBook(book);

        response.sendRedirect("seller-dashboard.jsp");
    }
}
