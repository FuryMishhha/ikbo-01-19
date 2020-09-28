package com.company;

import java.util.Scanner;

public class ThrowsDemo_2 {
    public static void main(String[] args) {
        printDetails("");
        printDetails("Key");
    }
    public static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.nextLine();
        printDetails( key );
    }
    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    private static String getDetails(String key) throws Exception {
        if(key.equals("")) throw new Exception( "Key set to empty string" );
        return "data for " + key;
    }
}