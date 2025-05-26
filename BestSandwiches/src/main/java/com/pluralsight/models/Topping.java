package com.pluralsight.models;

import java.util.Scanner;

public class Topping {
    public void topping(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Extra topping (optional):\n" +
                " - lettuce\n" +
                " - peppers\n" +
                " - onions\n" +
                " - tomatoes\n" +
                " - jalapeños\n" +
                " - cucumbers\n" +
                " - pickles\n" +
                " - guacamole\n" +
                " - mushrooms");

        String userReguInput = scanner.nextLine();

        System.out.println("Select Sauces (optional):\n" +
                " - mayo\n" +
                " - mustard\n" +
                " - ketchup\n" +
                " - ranch\n" +
                " - thousand islands\n" +
                " - vinaigrette");

        String userSaucesInput = scanner.nextLine();

        System.out.println("Select sides:\n" +
                " - au jus\n" +
                " - sauce");

        String userSidesInput = scanner.nextLine();

        System.out.println("Do you want Drinks?");
        String userDrinksInput = scanner.nextLine();

        // You can optionally print the selections here
        System.out.println("\nYour selections:");
        System.out.println("Topping: " + userReguInput);
        System.out.println("Sauce: " + userSaucesInput);
        System.out.println("Side: " + userSidesInput);
        System.out.println("Drinks: " + userDrinksInput);

        scanner.close();
    }
}
