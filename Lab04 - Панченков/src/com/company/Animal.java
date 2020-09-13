package com.company;

public class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Название животного: "+name);
    }
}
