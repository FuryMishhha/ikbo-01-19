package com.company;

public class Car implements Nameable {
    private String sound;

    public Car(String sound) {
        this.sound = sound;
    }

    @Override
    public void print() {
        System.out.println("Звук машины: "+sound);
    }
}
