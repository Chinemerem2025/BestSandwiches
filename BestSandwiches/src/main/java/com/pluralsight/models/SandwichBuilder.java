package com.pluralsight.models;
import com.pluralsight.util.ReceiptWriter;

import java.util.Scanner;

public class SandwichBuilder {
    public static void buildSandwich() {
        Scanner scanner = new Scanner(System.in);
        //Bread input
        System.out.println("Select your bread (Required)");
        System.out.println("White \nWheat \nRye \nWrap");//
        String userBreadInput = scanner.nextLine().toLowerCase().trim();

        //input validation
       // while (!userBreadInput.matches("[White,Wheat,Rye,Wrap]")) {
        //    System.out.println("oops! we dont have" + userBreadInput);
        //    userBreadInput = scanner.nextLine();
       // }
//Select Bread Size to determine the price
        System.out.println("Select Sandwich Size: \n4) $5.50, \n8) $7.00, \n12) $8.50)");
        String userSizeInput = scanner.nextLine().trim();

        //Input Validation
        //while (!userSizeInput.matches("[4,8,12]")) {
          //  System.out.println("Invalid input. Please enter a number between 1 and 5.");
          //  userSizeInput = scanner.nextLine().trim();
       // }
        if (userSizeInput.equalsIgnoreCase("4")) Sandwich.addToPrice(5.50);
        else if (userSizeInput.equalsIgnoreCase("8")) Sandwich.addToPrice(7.00);
        else if (userSizeInput.equalsIgnoreCase("12")) Sandwich.addToPrice(8.50);
// If the customer wants to toast sandwich
        System.out.println("Toasted? (yes/no)");
        boolean userToastInput = scanner.nextLine().equalsIgnoreCase("yes");


        //(userBreadInput, userSizeInput, userToastInput);
        Sandwich sandwich = new Sandwich(userBreadInput, userSizeInput, userToastInput);
        addMeat(sandwich);
        addCheese(sandwich);
        toppings(sandwich);
        Drinks.addDrinks();
        Chips.addChips();



        //System.out.println("\n" + sandwich.getSummary());
    }


    //Add meat method
    public static void addMeat(Sandwich sandwich) {
        Scanner scanner = new Scanner(System.in);
        int size = sandwich.getSize(); // size from the sandwich class
        System.out.println("Select Meat (premium): Meats\n" +
                " - steak\n" +
                " - ham\n" +
                " - salami\n" +
                " - roast beef\n" +
                " - chicken\n" +
                " - bacon\n");
        String userMeatInput = scanner.nextLine();//scanner to choose meat type

        System.out.println("Extra meat? (yes/no)");// prompt the user for extra meet
        boolean extra = scanner.nextLine().equalsIgnoreCase("yes");//scanner to return if extra meat

        double basePrice = 0, extraPrice = 0;
        if (size == 4) { basePrice = 1.00; extraPrice = 0.50; }
        else if (size == 8) { basePrice = 2.00; extraPrice = 1.00; }
        else if (size == 12) { basePrice = 3.00; extraPrice = 1.50; }

        double total = basePrice + (extra ? extraPrice : 0);
        sandwich.addMeat(userMeatInput + (extra ? " (extra)" : ""));
        Sandwich.addToPrice(total);

        System.out.printf("Added %s %s for $%.2f\n", extra ? "extra" : "", userMeatInput, total);
    }
    public static void addCheese(Sandwich sandwich) {
        Scanner scanner = new Scanner(System.in);
        int size = sandwich.getSize();
        System.out.println("Select Cheese:  \n- american\n" +
                " - provolone\n" +
                " - cheddar\n" +
                " - swiss\n");
        String userCheeseInput = scanner.nextLine();

        System.out.println("Do you want extra cheese? (Yes/No)");
        boolean extra = scanner.nextLine().equalsIgnoreCase("yes");

        double basePrice = 0, extraPrice = 0;
        if (size == 4) { basePrice = 0.75; extraPrice = 0.30; }
        else if (size == 8) { basePrice = 1.50; extraPrice = 0.60; }
        else if (size == 12) { basePrice = 2.25; extraPrice = 0.90; }

        double total = basePrice + (extra ? extraPrice : 0);
        sandwich.addCheese(userCheeseInput + (extra ? " (extra)" : ""));
        Sandwich.addToPrice(total);

        System.out.printf("Added %s %s for $%.2f\n", extra ? "extra" : "", userCheeseInput, total);

    }
    public static void toppings(Sandwich sandwich){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Extra topping (Regular):\n" +
                " - lettuce\n" +
                " - peppers\n" +
                " - onions\n" +
                " - tomatoes\n" +
                " - jalapeños\n" +
                " - cucumbers\n" +
                " - pickles\n" +
                " - guacamole\n" +
                " - mushrooms");
        String userToppingInput = scanner.nextLine();
        sandwich.addTopping(userToppingInput.toLowerCase());


        System.out.println("Select Sauces (Regular):\n" +
                " - mayo\n" +
                " - mustard\n" +
                " - ketchup\n" +
                " - ranch\n" +
                " - thousand islands\n" +
                " - vinaigrette");
        String userSaucesInput = scanner.nextLine();
        sandwich.addTopping(userSaucesInput.toLowerCase());

        System.out.println("Select sides:\n" +
                " - au jus\n" +
                " - sauce");
        String userSidesInput = scanner.nextLine();
        sandwich.addTopping(userSidesInput.toLowerCase());

        System.out.println("\n" + sandwich.getSummary());

    }

}
