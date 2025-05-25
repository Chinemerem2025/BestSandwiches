package com.pluralsight.ui;

import com.pluralsight.models.Chips;
import com.pluralsight.models.Drinks;
import com.pluralsight.models.Order;
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
        System.out.println("Choose from these option");
        System.out.println("1) Add Sandwich \n2) Add Drinks \n3) Add Chips \n4) Checkout \n5) Cancel Order");
        String userOderInput = scanner.nextLine();

        switch (userOderInput) {
            case "1" -> addSandwich();
            case "2" -> Drinks.addDrinks();
            case "3" -> Chips.addChips();
            case "4" -> ReceiptWriter.checkout();
            case "5" -> ReceiptWriter.cancelOrder();
            default  -> System.out.println("Invalid input");
        }
    }

    public void addSandwich() {
        System.out.println("Select your bread (Required)");
        System.out.println("White Bread \nWheat Bread \nRye Bread \nWrap Bread");
        String userBreadInput = scanner.nextLine();
        System.out.println();

        System.out.println("Select Sandwich Size (Required) \nBase Price");
        System.out.println("4\" $5.50 \n8\" $7.00 \n12\" $8.50");
        String userBSizeInput = scanner.nextLine();

        double basePrice = 0.0;
        if (userBSizeInput.equals("4")) {
            basePrice = 5.50;
        } else if (userBreadInput.equals("8")) {
            basePrice = 7.00;
        } else if (userBreadInput.equals("12")) {
            basePrice = 8.50;
        } else {
            System.out.println("Invalid size selected.");
        System.out.println();

        System.out.println("Select Meat (required)\n" +
                "Meats         4\" $1.00     8\" $     12\"\n" +
                "Steak    \n" +
                "Ham         \n" +
                "Salami       \n" +
                "Roast Beef  \n" +
                "Chicken     \n" +
                "Bacon       \n");
            System.out.println(" Do you want extra meat");
            System.out.println(" Extra Meat \n4\" $0.50  \n8\" $1.00  \n12\" $1.50\");");
        String userMeatInput = scanner.nextLine();
        System.out.println();
        System.out.println("Select Cheese (optional)\n" +
                "Type           4\"     8\"     12\"\n" +
                "American \n" +
                "Provolone\n" +
                "Cheddar  \n" +
                "Swiss    \n" +
                "Extra Cheese   $0.30  $0.60  $0.90");
        String userCheeseInput = scanner.nextLine();
        System.out.println();
        System.out.println("Select Extra topping(optional)\n" +
                "- lettuce\n" +
                " - peppers\n" +
                " - onions\n" +
                " - tomatoes\n" +
                " - jalapeños\n" +
                " - cucumbers\n" +
                " - pickles\n" +
                " - guacamole\n" +
                " - mushrooms\n");
        String userReguInput = scanner.nextLine();
        System.out.println("Select Sauces(Required)\n" +
                "- mayo\n" +
                " - mustard\n" +
                " - ketchup\n" +
                " - ranch\n" +
                " - thousand islands\n" +
                " - vinaigrette\n");
        String userSaucesInput = scanner.nextLine();
        System.out.println("Select sides \n" +
                "- au jus\n" +
                " - sauce\n");
        String userSidesInput = scanner.nextLine();
        System.out.println();
        System.out.println("Do you want Drinks");
        String userDrinkInput = scanner.nextLine();

    }

}}
