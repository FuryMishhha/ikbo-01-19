package com.company;

import java.util.Scanner;

public class Main {
    static int Factorial(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            number = number * i;
        }
        return number;
    }
    public static void main(String[] args) {
        Integer factorial;
        System.out.print("Введите число, для которого Вы хотите вычислить факториал: ");
        Scanner scanner = new Scanner(System.in);
        factorial = scanner.nextInt();
        System.out.println(Factorial(factorial));
    }
}

