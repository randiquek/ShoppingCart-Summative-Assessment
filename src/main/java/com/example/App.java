package com.example;

import com.example.controller.MenuController;
import com.example.model.Cart;
import com.example.model.CartService;
import com.example.view.ConsoleIO;

public class App {
    public static void main(String[] args) {

        ConsoleIO io = new ConsoleIO();
        Cart cart = new Cart();
        CartService cartService = new CartService(io, cart);

        MenuController cartMenu = new MenuController(io, cartService, cart);

        cartMenu.runPOS();
    }
}
