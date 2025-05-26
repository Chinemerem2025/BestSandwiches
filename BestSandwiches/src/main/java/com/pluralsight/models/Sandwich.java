package com.pluralsight.models;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandwich {
    private String breadType;
    private int size;
    private boolean toasted;
    private List<String> meats = new ArrayList<>();
    private List<String> cheese = new ArrayList<>();
    private List<String> toppings = new ArrayList<>();
    private List<String> Sauces = new ArrayList<>();
    private List<String> sides = new ArrayList<>();
    private static double price;

    public Sandwich(String breadType, int size, boolean toasted) {
        this.breadType = breadType;
        this.size = size;
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

    public static void addToPrice(double amount) {
        price += amount;
    }
    public String getSummary() {
        return "Bread: " + breadType + "\nSize: " + size + "\"\nToasted: " + (toasted ? "Yes" : "No") +
                "\nMeats: " + meats + "\nTotal: $" + String.format("%.2f", price);
}}
