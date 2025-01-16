package com.example;

import com.example.controller.MenuController;
import com.example.view.ConsoleIO;

public class App {
    public static void main(String[] args) {

        ConsoleIO io = new ConsoleIO();
        MenuController cartMenu = new MenuController(io);

        cartMenu.runPOS();
    }
}
