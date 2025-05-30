package com.pluralsight.models;


import com.pluralsight.ui.IPriceable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Sandwich implements IPriceable {
    private static String breadType;
    private static int size;
    private static boolean toasted;
    private static List<String> meats = new ArrayList<>();
    private static List<String> cheese = new ArrayList<>();
    private static List<String> toppings = new ArrayList<>();
    private static Drink drink;
    private static Chips chips;

    private static double price;
    private static String orderNumber;

    public Sandwich(String breadType, String size, boolean toasted) {
        Sandwich.breadType = breadType;
        Sandwich.size = Integer.parseInt(size);
        Sandwich.toasted = toasted;
        Sandwich.orderNumber = generateOrderNumber();
    }


    public String getBreadType() {return breadType;}

    public int getSize() {return size;}

    public boolean isToasted() {return toasted;}

    public void addMeat(String meat) {meats.add(meat);}

    public void addCheese(String cheeseItem) {cheese.add(cheeseItem);}

    public void addTopping(String topping) {toppings.add(topping);}

    private String generateOrderNumber() {
        return UUID.randomUUID().toString().substring(0, 9).toUpperCase();
    }

    public static String getOrderNumber() {return orderNumber;}


    public void addDrink(Drink drink) {
        this.drink = drink;
        price += drink.getPrice();
    }
    public void addChips(Chips chips) {
        this.chips = chips;
        if (chips != null) price += chips.getPrice();
    }
    public static void addToPrice(double amount) {price += amount;}

    public static String getSummary() {
        return  "======Order Summary======" +"\nDate:"+ LocalDateTime.now() + "\nOrder #:" + orderNumber + "\nBread: " + breadType +
                    "\nSize: " + size + "\"\nToasted: " + (toasted ? "Yes" : "No") +
                    "\nMeats: " + meats + "\nCheese:" + cheese +
                    "\nTopping:" + toppings + "\nDrinks:" +  (drink != null ? drink.getName() : "None") +  " " +
                    "\nChips:" + (chips != null ? chips.getName() : "None") +
                    "\n---------------------" + "\nTotal: $" + String.format("%.2f", price);


    }

    @Override
    public String getName() {
        return breadType + size;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
