package com.company;

public class Main {
    public static void main(String[] args) {
        Nameable n1 = new Animal("Crocodile");
        n1.print();
        n1 = new Car("Врум-врум");
        n1.print();
    }
}
