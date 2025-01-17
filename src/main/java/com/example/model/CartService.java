package com.example.model;

public class CartService {
    Cart cart = new Cart();

    public void addItem(Item item, int quantity) {
        cart.getCart().put(item, quantity); //takes the HashMap cart created in Cart class
    }

    public void removeItem() {

    }
    public double getTotal() {
        return 0;
    }
    public void checkout() {

    }
    public void displayCart() {

    }
}
