package com.company;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner scanner = new Scanner( System.in);
        System.out.print( "Введите целое число: ");
        String intString = scanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Вы делите на ноль");
        } catch (Exception e) {
            System.out.println("Число не целов");
        }
        finally {
            System.out.println("Окончено");
        }
    }
}