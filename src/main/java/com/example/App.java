package com.example;

import com.example.controller.MenuController;
import com.example.model.CartService;
import com.example.view.ConsoleIO;

public class App {
    public static void main(String[] args) {

        ConsoleIO io = new ConsoleIO();
        CartService cartService = new CartService();
        MenuController cartMenu = new MenuController(io, cartService);

        cartMenu.runPOS();
    }
}
