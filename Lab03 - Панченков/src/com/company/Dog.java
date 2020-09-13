package com.company;

public abstract class Dog {
    private double weight;
    private int height, age;

    public Dog(double weight, int age, int height){
        this.weight=weight;
        this.age=age;
        this.height=height;
    }

    public int getHeight(){return height;}

    public int getAge(){return age;}

    public double getWeight(){return weight;}

    public abstract void displayInfo();
}
