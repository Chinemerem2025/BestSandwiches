package com.pluralsight.models;
import java.util.Scanner;
import java.util.*;

public class SandwichBuilder {


    public static Sandwich buildSandwich() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Select your bread (Required)");
        System.out.println("White, Wheat, Rye, Wrap");
        String bread = scanner.nextLine().toLowerCase().trim();

        System.out.println("Select Sandwich Size (4, 8, 12)");
        int size = Integer.parseInt(scanner.nextLine());

        System.out.println("Toasted? (yes/no)");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(bread, size, toasted);
        addMeat(sandwich);

        System.out.println("\n" + sandwich.getSummary());
        return sandwich;
    }

    public static void addMeat(Sandwich sandwich) {
        Scanner scanner = new Scanner(System.in);
        int size = sandwich.getSize(); // you'd need a getSize() method for this
        System.out.println("Select Meat: Steak, Ham, Salami, Roast Beef, Chicken, Bacon");
        String meat = scanner.nextLine();

        System.out.println("Extra meat? (yes/no)");
        boolean extra = scanner.nextLine().equalsIgnoreCase("yes");

        double basePrice = 0, extraPrice = 0;
        if (size == 4) { basePrice = 1.00; extraPrice = 0.50; }
        else if (size == 8) { basePrice = 2.00; extraPrice = 1.00; }
        else if (size == 12) { basePrice = 3.00; extraPrice = 1.50; }

        double total = basePrice + (extra ? extraPrice : 0);
        sandwich.addMeat(meat + (extra ? " (extra)" : ""));
        Sandwich.addToPrice(total);

        System.out.printf("Added %s %s for $%.2f\n", extra ? "extra" : "", meat, total);
    }

}
