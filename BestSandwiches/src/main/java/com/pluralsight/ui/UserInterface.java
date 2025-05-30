package com.pluralsight.ui;
import java.io.*;

import com.pluralsight.models.*;
import com.pluralsight.util.ReceiptWriter;

import java.util.Scanner;


public class UserInterface {
    FileWriter fw = new FileWriter("transactions.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    Order<Sandwich> sandwichOrder = new Order<>();
    Order<Drink> drinkOrder = new Order<>();
    Order<Chips> chipsOrder = new Order<>();
    Scanner scanner = new Scanner(System.in);

    public UserInterface() throws IOException {
    }


    // Start the app
    public void run() throws IOException {
        boolean mainMenu = true;
        while (mainMenu) {
            System.out.println("Welcome to Best Sandwich");
            System.out.println("1) New Order \n0) Exit");
            String userMainMenuInput = scanner.nextLine();

            switch (userMainMenuInput) {
                case "1" -> OrderMenu();
                case "0" -> {
                    System.out.println("Exiting...");
                    mainMenu = false;
                }
                default -> System.out.println("Invalid input");
            }
        }
    }
//Why is java suggesting for me to aad IOException or us try and catch
    public void OrderMenu() throws IOException {
        boolean orderMenu = true;

        while (orderMenu) {
            System.out.println("Choose from these option");
            System.out.println("1) Add Sandwich \n2) Add Drinks \n3) Add Chips \n4) Checkout \n5) Cancel Order");
            String userOrderInput = scanner.nextLine();

            while (!userOrderInput.matches("[1-5]")) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                userOrderInput = scanner.nextLine().trim();
            }
            switch (userOrderInput) {
                case "1" -> {
                    Sandwich sandwich = SandwichBuilder.buildSandwich();
                    sandwichOrder.addItem(sandwich);
                }
                case "2" -> {
                    Drink drink = Drink.addDrinks();
                    drinkOrder.addItem(drink);
                }
                case "3" -> {
                    Chips chips = Chips.addChips();
                    chipsOrder.addItem(chips);
                }
                case "4" -> {
                    ReceiptWriter.checkout(sandwichOrder, drinkOrder, chipsOrder);
                    orderMenu = false;
                }
                case "5" -> {
                    ReceiptWriter.cancelOrder();
                    orderMenu = false;
                }
            }
        }

        run();
    }
}