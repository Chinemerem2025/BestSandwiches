package com.pluralsight.models;

import com.pluralsight.ui.Items;

import java.util.Scanner;



public class Chips implements Items {
    private String name;

    public Chips(String name) {
        this.name = name;
    }

    public static void addChips() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want Chips (yes/no)");
        String userChipsInput = scanner.nextLine();

        if (userChipsInput.equals("yes")) {
            System.out.println("No chips added.");
            return ; // Return nothing if user says no

        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice(String size) {
        return 1.50;
    }
}
