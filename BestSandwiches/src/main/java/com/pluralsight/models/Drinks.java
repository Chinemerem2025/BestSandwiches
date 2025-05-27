package com.pluralsight.models;

import com.pluralsight.ui.Items;

import java.util.Scanner;

public class Drinks implements Items {
    private String name;
    private String size;

    // Constructor
    public Drinks(String name, String size) {
        this.name = name;
        this.size = size;
    }

    // Static method to prompt user and return a Drink object
    public static Drinks addDrinks() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select drink: \nCoke \nSprite \nWater");
        String userDrinkInput = scanner.nextLine().trim();

        System.out.println("Select size:\nSmall $2.00\nMedium $2.50\nLarge $3.00");
        String userSizeInput = scanner.nextLine().toLowerCase().trim();

        // Validate size
        while (!userSizeInput.matches("small|medium|large")) {
            System.out.println("Invalid size. Please enter: small, medium, or large.");
            userSizeInput = scanner.nextLine().toLowerCase().trim();
        }

        Drinks drink = new Drinks(userDrinkInput, userSizeInput);
        System.out.printf("Added drink: %s (%s) - $%.2f\n", userDrinkInput, userSizeInput, drink.getPrice(userSizeInput));
        return drink;
    }

    @Override
    public String getName() {
        return name + " (" + size + ")";
    }

    @Override
    public double getPrice(String size) {
        return switch (size.toLowerCase()) {
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 0.0;
        };
    }

    public double getPrice() {
        return getPrice(this.size);
    }

    public String getSize() {
        return size;
    }
}
