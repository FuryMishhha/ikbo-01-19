package com.company;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            System.out.println("Делим на 0");
        }
    }
}