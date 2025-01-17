package com.example.controller;

import com.example.model.CartService;
import com.example.model.Item;
import com.example.view.ConsoleIO;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class MenuController {
    ConsoleIO io;
    CartService cartService;
    boolean isRunning = false;
    ArrayList<Item> items;

    public MenuController(ConsoleIO io, CartService cartService) {
        this.io = io;
        this.cartService = cartService;
        items = new ArrayList<>();
        items.addAll(Arrays.asList(
                new Item("Energy drink", 3.50),
                new Item("Almond milk", 3.00),
                new Item("Cheese", 2.50),
                new Item("Cookies", 3.50),
                new Item("Orange", 0.50),
                new Item("Tortilla", 2.00),
                new Item("Eggs", 4.00),
                new Item("Chips", 5.00) ));
    }

    public void runPOS() {

        boolean isRunning = true;

        while(isRunning) {

            io.displayMessage("Shopping Inc. POS");
            printMenu();

            int userChoice = io.getInteger("Please choose an action from the menu.");

            switch(userChoice) {

                case 1:
                    addItemMenu();
                    break;
                case 2:
                    removeItemMenu();
                    break;
                case 3:
                    // displayCart()
                    break;
                case 4:
                    confirmCheckout();
                    break;
                case 5:
                    io.displayMessage("Exiting application");
                    isRunning = false;
                    break;
            }
            break;
        }
    }

    public void printMenu() {
        io.displayMessage("********POS MENU********");
        io.displayMessage("1. Add Item");
        io.displayMessage("2. Remove Item");
        io.displayMessage("3. Display Cart");
        io.displayMessage("4. Checkout");
        io.displayMessage("5. Exit POS system");
    }

    public void addItemMenu() {
        io.displayMessage("********Add Item********");
        for(int i = 0; i < items.size(); i++) {
            io.displayMessage((i + 1) + ". " + items.get(i).getName() + ": $" + items.get(i).getPrice());
        }
        int userChoice = io.getInteger("Choose an item to add to cart");
        if(userChoice > 0 && userChoice <= items.size()) {
            Item itemSelected = items.get(userChoice -1);
            int quantity = io.getInteger("How many of this item would you like to add?");
            cartService.addItem(itemSelected, quantity);
            io.displayMessage("Successfully added " + quantity + " of " + itemSelected);
        } else {
            io.displayMessage("Please choose a valid selection");
        }

    }
    public void removeItemMenu() {
        io.displayMessage("********Remove Item********");
    }

    public void confirmCheckout() {

        int confirm = io.getInteger("Are you sure you want to checkout?");
        io.displayMessage("1. Yes");
        io.displayMessage("2. No");

        switch(confirm) {
            case 1:
                //checkout()
                break;
            case 2:
                io.displayMessage("Returning to main menu...");
                printMenu();
                break;
        }

    }

}
