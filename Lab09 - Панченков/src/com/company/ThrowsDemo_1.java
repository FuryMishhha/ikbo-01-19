package com.company;

import java.util.Scanner;

public class ThrowsDemo_1 {
    public static void main(String[] args) {
        printDetails(null);
        printDetails("Key");
    }
    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch (NullPointerException e) {
            throw e;
        }
    }
    private static String getDetails(String key) {
        if(key == "") throw new NullPointerException( "null key in getDetails" );
        return "data for " + key;
    }
}
