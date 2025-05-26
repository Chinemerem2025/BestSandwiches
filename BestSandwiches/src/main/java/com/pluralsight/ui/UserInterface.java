package com.pluralsight.ui;

import com.pluralsight.models.*;
import com.pluralsight.util.ReceiptWriter;

import java.util.List;
import java.util.Scanner;


public class UserInterface {
    Scanner scanner = new Scanner(System.in);


// Start the app
    public void run(){
        boolean mainMenu = true;
        while (mainMenu) {
            System.out.println("Welcome to Best Sandwich");
            System.out.println("1) New Order \n0) Exit");
            String userMainMenuInput = scanner.nextLine();

            switch (userMainMenuInput) {
                case "1" -> OrderMenu();
                case "0" -> {
                    System.out.println( "Exiting...");
                    mainMenu = false;
                }
                default -> System.out.println("Invalid input");
            }
        }
    }
    public void OrderMenu(){
        boolean orderMenu = true;

        while (orderMenu) {
        System.out.println("Choose from these option");
        System.out.println("1) Add Sandwich \n2) Add Drinks \n3) Add Chips \n4) Checkout \n5) Cancel Order");
        String userOderInput = scanner.nextLine();


            switch (userOderInput) {
            case "1" -> SandwichBuilder.buildSandwich();
            case "2" -> Drinks.addDrinks();
            case "3" -> Chips.addChips();
            case "4" -> ReceiptWriter.checkout();
            case "5" -> {
                ReceiptWriter.cancelOrder();
                orderMenu = false;
            }
            default  -> System.out.println("Invalid input");
        }




    }

}}
