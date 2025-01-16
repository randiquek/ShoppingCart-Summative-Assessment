package com.example.view;

import java.util.Scanner;

public class ConsoleIO {

    private Scanner console = new Scanner(System.in);

    public String getInput(String prompt) {
        return console.nextLine();
    }

    public double getDouble(String prompt) {
        return console.nextDouble();
    }

    public int getInteger(String prompt) {
        return console.nextInt();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
