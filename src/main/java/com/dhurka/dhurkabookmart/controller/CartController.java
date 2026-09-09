package com.dhurka.dhurkabookmart.controller;

import com.dhurka.dhurkabookmart.model.Book;
import com.dhurka.dhurkabookmart.service.CartService;

public class CartController {

    private CartService cartService = new CartService();

    public void addBook(Book book) {
        cartService.addBookToCart(book);
        System.out.println("Book added to cart successfully!");
    }

    public void displayCart() {
        System.out.println(cartService.getCart().getBooks());
        System.out.println("Total Price: " + cartService.getTotalPrice());
    }
}
