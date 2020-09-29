package com.company;

public class Main {

    public static void main(String[] args) {
        Complex complex = new ConcreteFactory().createComplex(5, 7);
        System.out.print(complex);
    }
}
