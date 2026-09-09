package com.dhurka.dhurkabookmart.controller;

import com.dhurka.dhurkabookmart.service.BookService;

public class BookController {

    private BookService bookService = new BookService();

    public void displayBooks() {
        System.out.println(bookService.getAllBooks());
    }
}
