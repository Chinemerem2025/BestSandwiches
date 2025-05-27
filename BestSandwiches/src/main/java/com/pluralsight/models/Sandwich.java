package com.pluralsight.models;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String breadType;
    private int size;
    private boolean toasted;
    private List<String> meats = new ArrayList<>();
    private List<String> cheese = new ArrayList<>();
    private List<String> toppings = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();
    private List<String> sides = new ArrayList<>();

    private String drink;
    private String chips;
    private static double price;

    public Sandwich(String breadType, String size, boolean toasted) {
        this.breadType = breadType;
        this.size = Integer.parseInt(size);
        this.toasted = toasted;
    }

    public String getBreadType() {
        return breadType;
    }

    public int getSize() {
        return size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public double getPrice() {
        return price;
    }
    public void addMeat(String meat) {
        meats.add(meat);
    }
    public void addCheese(String cheese) {
        this.cheese.add(cheese);
    }
    public void addTopping(String topping) {
        toppings.add(topping);
    }
    public void addSauce(String sauce) {
        sauces.add(sauce);
    }

    public void addSide(String side) {
        sides.add(side);
    }

    public void addDrink(String drink) {
        this.drink = drink;
    }

    public void addChips(String chips) {
        this.chips = chips;
    }

    public static void addToPrice(double amount) {
        price += amount;
    }
    public String getSummary() {
        String summary;
        try {
            FileWriter fileDeposit = new FileWriter("transactions.csv", true);
            BufferedWriter bufferDeposit = new BufferedWriter(fileDeposit);

            summary = "======Order Summary======" + "\nBread: " + breadType +
                    "\nSize: " + size + "\"\nToasted: " + (toasted ? "Yes" : "No") +
                    "\nMeats: " + meats + "\nCheese:" + cheese +
                    "\nTopping:" + toppings + "\nDrinks:" + drink +
                    "\nChips:" + chips +
                    "\n---------------------" + "\nTotal: $" + String.format("%.2f", price);

            bufferDeposit.write(LocalDate.now() + " " + LocalTime.now() + "\n" + summary + "\n\n");
            bufferDeposit.close();
        } catch (IOException e) {
            throw new RuntimeException("Failed to write transaction summary", e);
        }

        return summary;

    }
}
