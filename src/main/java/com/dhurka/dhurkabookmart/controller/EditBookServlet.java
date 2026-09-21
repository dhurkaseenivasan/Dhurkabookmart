package com.dhurka.dhurkabookmart.controller;

import com.dhurka.dhurkabookmart.model.Book;
import com.dhurka.dhurkabookmart.service.BookService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/edit-book")
public class EditBookServlet extends HttpServlet {

    private BookService bookService = new BookService();

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));

        Book updatedBook = new Book(id, title, author, price);

        bookService.updateBook(updatedBook);

        response.sendRedirect("seller-dashboard.jsp");
    }
}
