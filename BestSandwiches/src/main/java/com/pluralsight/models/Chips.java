package com.pluralsight.models;

import com.pluralsight.ui.IPriceable;
import com.pluralsight.util.ReceiptWriter;

import java.util.Scanner;



public class Chips implements IPriceable {
    private String name;

    public Chips(String name) {
        this.name = name;
    }

    public static Chips addChips() {
        Scanner scanner = new Scanner(System.in);
        //prompt the user to choose chips
        System.out.println("Do you want Chips (yes/no)");
        String userChipsInput = scanner.nextLine().toLowerCase().trim();

        if (userChipsInput.equalsIgnoreCase("yes")) {
            System.out.println("Select chip type: \nPotato \nPlantain");
            String type = scanner.nextLine().trim();
            System.out.println("Added chips: " + type + " $1.50");
            return new Chips(type); //return chip type
        }

        return null;

    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
