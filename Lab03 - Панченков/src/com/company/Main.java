package com.company;

public class Main {

    public static void main(String[] args) {
        Ovcharka Dunya=new Ovcharka(15, 5, 70, "black");
        Taksa Margo = new Taksa(8, 7, 30, "brown");
        Dunya.displayInfo();
        Margo.displayInfo();
        System.out.print(Dunya.getAge());
    }
}
