package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Item dish1 = new Dish(50, "Chocolate", "A bar of chocolate");
        Item dish2 = new Dish(215, "Fried potato", "Pottato on the plate");
        Item drink1 = new Drink(70, "Pepsi", "A bottle of pepsi");
        Item drink2 = new Drink(120, "Coffee", "A cup of coffee");

        Order Order1 = new RestaurantOrder();
        Order1.add(dish1);
        Order1.add(drink1);
        System.out.println("Order №1:");
        System.out.println(Arrays.toString(Order1.getSortedArray()));

        Order Order2 = new InternetOrder();
        Order2.add(dish2);
        Order2.add(drink2);
        System.out.println("Order №2:");
        System.out.println(Arrays.toString(Order2.getSortedArray()));
        
        InternetOrder order3 = new InternetOrder();
        order3.add("ul. Shipilovskaya", Order2);
        order3.add("ul. Shipilovskaya", drink1);
        System.out.println("Order №3:");
        order3.getOrders();
        System.out.println(Arrays.toString(Order1.getArrayOfNames()));
        Order1.add(dish2);
        System.out.println("Add item to order №1:");
        System.out.println(Arrays.toString(Order1.getArrayOfNames()));
        System.out.println("Num of orders in order №1: " + Order1.numOfOrders());
        System.out.println("Total sum in order №1: " + Order1.getSumPrice());
        Order1.delete("Mango");
        System.out.println(Arrays.toString(Order1.getArrayOfNames()));
        Order1.add(drink1);
        Order1.add(drink1);
        System.out.println(Arrays.toString(Order1.getArrayOfNames()));
        System.out.println("Deleted: " + Order1.deleteAll("Pepsi"));
        System.out.println(Arrays.toString(Order1.getArrayOfNames()));
    }
}