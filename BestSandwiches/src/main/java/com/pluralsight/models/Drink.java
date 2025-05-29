package com.pluralsight.models;

import com.pluralsight.ui.IPriceable;

import java.util.Scanner;

public class Drink implements IPriceable{
    private String name;
    private double size;

    // Constructor
    public Drink(String name, double size) {
        this.name = name;
        this.size = size;
    }

    // Static method to prompt user and return a Drink object
    public static Drink addDrinks () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want drink (yes/no)");
        String userChoice = scanner.nextLine();
        if (userChoice.equalsIgnoreCase("yes")) {

        }



        System.out.println("Select drink: \nCoke \nSprite \nWater");
        String userDrinkInput = scanner.nextLine().trim();

        System.out.println("Select size:\n4) $2.00\n8) $2.50\n12) $3.00");
        double userSizeInput =scanner.nextDouble();
      //  double size =  Double.parseDouble(userSizeInput);


        Drink drink = new Drink(userDrinkInput, userSizeInput);
        System.out.printf("Added drink: %s (Size %s)  $%.2f\n", userDrinkInput, userSizeInput, drink.getPrice());
        return drink;
    }

    @Override
    public double getPrice() {
        return switch ((int) size) {
            case 4 -> 2.00;
            case 8 -> 2.50;
            case 12 -> 3.00;
            default -> 0.0;
        };
    }


    @Override
    public String getName() {
        return name + " (" + size + ")";
    }

    //public double getPrice() {
      //  return getPrice(this.size);
    //}

    //public String getSize() {
     //   return size;
    //}
}
