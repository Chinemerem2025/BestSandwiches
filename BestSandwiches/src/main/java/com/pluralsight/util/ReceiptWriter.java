package com.pluralsight.util;

import com.pluralsight.models.Chips;
import com.pluralsight.models.Drink;
import com.pluralsight.models.Order;
import com.pluralsight.models.Sandwich;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReceiptWriter {
    public static void checkout(Sandwich sandwich) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check out (yes/no)");
        String userCheckoutInput = scanner.nextLine();
        if (userCheckoutInput.equalsIgnoreCase("yes")) {
            String summary = Sandwich.getSummary();
            System.out.println("Your Order:\n" + summary);
        try {
            FileWriter fw = new FileWriter("transactions.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

}}

    public static void cancelOrder() {
        System.out.println("Order has been canceled");
    }

    public static void checkout(Order<Sandwich> sandwichOrder, Order<Drink> drinkOrder, Order<Chips> chipsOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check out (yes/no)");
        String userCheckoutInput = scanner.nextLine();
        if (userCheckoutInput.equalsIgnoreCase("yes")) {
            String summary = Sandwich.getSummary();
            System.out.println("Your Order:\n" + summary);
            try {
                FileWriter fw = new FileWriter("transactions.csv", true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(summary);  // write the summary string to the file
                bw.newLine();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Order canceled");
        }
    }   }
