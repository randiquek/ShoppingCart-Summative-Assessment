package com.example.controller;

import com.example.view.ConsoleIO;

import java.io.Console;

public class MenuController {
    ConsoleIO io;
    boolean isRunning = false;

    public MenuController(ConsoleIO io) { this.io = io;}

    public void runPOS() {

        boolean isRunning = true;

        while(isRunning) {

            io.displayMessage("Shopping Inc. POS");
            printMenu();

            int userChoice = io.getInteger("Please choose an action from the menu.");

            switch(userChoice) {

                case 1:
                    //addItem();
                    break;
                case 2:
                    // removeItem();
                    break;
                case 3:
                    // displayCart()
                    break;
                case 4:
                    // checkout()
                    break;
                case 5:
                    io.displayMessage("Exiting application");
                    isRunning = false;
                    break;
            }


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

}
