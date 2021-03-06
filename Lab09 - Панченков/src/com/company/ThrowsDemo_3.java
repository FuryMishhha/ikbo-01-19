package com.company;

import java.util.Scanner;

public class ThrowsDemo_3 {

    public static void main(String[] args) {
        getKey();
    }
    public static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        while (myScanner.hasNextLine()) {
            try {
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Empty. Try again!");
            }
        }
    }
    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );

    }
    private static String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}