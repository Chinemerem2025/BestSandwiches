package com.pluralsight;

import com.pluralsight.models.*;
import com.pluralsight.ui.UserInterface;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserInterface ui = new UserInterface();
        ui.run();

        Order<Sandwich> sandwichBasket = new Order<>();

        //SandwichBuilder.buildSandwich();
        sandwichBasket.addItem(new Sandwich("Italian BMT", "8", true));

        //Order<Drink> drinkBasket = new Order<>();
       // Drink.addDrinks();
       // drinkBasket.addItem(new Drink("Coke", 1.80));

        Order<Chips> chipBasket = new Order<>();
        Chips.addChips();
        chipBasket.addItem(new Chips("Paprika"));

       // public static void printOrderSummary(Order<? extends IPriceable>... Order) {
         // double grandTotal = 0;
        //  for (Order<? extends IPriceable> Order : orders) {
          //     orders.printReceipt();
          //     grandTotal += order.getTotalPrice();
          //  }
          // System.out.println("Grand Total: €" + String.format("%.2f", grandTotal));
     //   }

    }

}