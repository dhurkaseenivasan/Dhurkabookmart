package com.dhurka.dhurkabookmart.service;

import com.dhurka.dhurkabookmart.dao.BookDAO;
import com.dhurka.dhurkabookmart.model.Book;
import java.util.List;

public class BookService {

    private BookDAO bookDAO = new BookDAO();

    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }
}

