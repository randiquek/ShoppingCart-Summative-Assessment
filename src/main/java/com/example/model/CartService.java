package com.example.model;

import com.example.view.ConsoleIO;

import java.util.Map;

public class CartService {
    private ConsoleIO io;
    public Cart cart = new Cart();

    public CartService(ConsoleIO io, Cart cart) {
        this.io = io;
        this.cart = cart;
    }

    public void addItem(Item item, int quantity) {
        cart.getCart().put(item, quantity); //takes the HashMap cart created in Cart class
    }

    public void removeItem(Item item, int quantity) {
        Map<Item, Integer> cartList = cart.getCart();
        if(cartList.containsKey(item)) {
            int currentQuantity = cartList.get(item);
            if(currentQuantity <= quantity) {
                cartList.remove(item);
            } else {
                cartList.put(item, currentQuantity - quantity);
            }
        }
    }
    public double getTotal() {
        return 0;
    }
    public void checkout() {

    }
    public void displayCart() {
        Map<Item, Integer> cartList = cart.getCart();
        if(cartList.isEmpty()) {
            io.displayMessage("Your cart is empty");
        } else {
            int counter = 1;
            for(Item item : cartList.keySet()) {
                int quantity = cartList.get(item);
                io.displayMessage(counter++ + ". " + item.getName() + ": " + quantity);
            }
        }
    }

    public void clearCart() {

    }
}
