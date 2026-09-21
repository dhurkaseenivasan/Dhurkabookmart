package com.dhurka.dhurkabookmart.dao;

import com.dhurka.dhurkabookmart.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    private static List<Book> books = new ArrayList<>();

    public BookDAO() {
        if(books.isEmpty()){
        books.add(new Book(1, "Java Programming", "James Gosling", 500));
        books.add(new Book(2, "Python Programming", "Guido van Rossum", 450));
        books.add(new Book(3, "Data Science Basics", "Unknown", 600));
        }
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void updateBook(Book updatedBook) {

    for (Book book : books) {

        if (book.getId() == updatedBook.getId()) {

            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setPrice(updatedBook.getPrice());

            break;
        }
    }
}
public void deleteBook(int id){
    books.removeIf(book ->book.getId()==id);
}
}