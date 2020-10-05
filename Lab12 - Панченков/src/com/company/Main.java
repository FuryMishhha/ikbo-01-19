package com.company;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(\\d+\\.\\d{2} (USD|RUB|EU))";
        System.out.println("Введите в строку все значения, которые должны входить в список: ");
        String string = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find())
            System.out.println("Список цен: " + matcher.group());
    }
}