package com.dhurka.dhurkabookmart.service;

import com.dhurka.dhurkabookmart.model.Book;
import com.dhurka.dhurkabookmart.model.Cart;

public class CartService {

    private Cart cart = new Cart();

    public void addBookToCart(Book book) {
        cart.addBook(book);
    }

    public Cart getCart() {
        return cart;
    }

    public double getTotalPrice() {
        return cart.getTotalPrice();
    }
}
