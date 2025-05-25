package com.pluralsight.models;

import java.util.List;

public class Sandwich {
    private  String name;
    private  double price;
    private List<String> ingredients;

    public Sandwich(String name, List<String> ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public String getName() {return name;}

    public double getPrice() {return price;}

    public List<String> getIngredients() {return ingredients;}

}
