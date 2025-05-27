package com.pluralsight.util;

import com.pluralsight.models.Sandwich;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReceiptWriter {
    public static void checkout() {
        try {
            FileWriter fileDeposit = new FileWriter("transactions.csv", true);
            BufferedWriter bufferDeposit = new BufferedWriter(fileDeposit);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static void cancelOrder() {
    }
}
