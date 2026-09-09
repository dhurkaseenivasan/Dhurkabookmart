package com.dhurka.dhurkabookmart.dao;

import com.dhurka.dhurkabookmart.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    private List<Book> books = new ArrayList<>();

    public BookDAO() {

        books.add(new Book(1, "Java Programming", "James Gosling", 500));
        books.add(new Book(2, "Python Programming", "Guido van Rossum", 450));
        books.add(new Book(3, "Data Science Basics", "Unknown", 600));

    }

    public List<Book> getAllBooks() {
        return books;
    }

}
