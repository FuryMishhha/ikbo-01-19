package com.company;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList <Integer> BWL = new BoundedWaitList<>(7);
        BWL.add(1);BWL.add(2);BWL.add(3);BWL.add(4);BWL.add(5);BWL.add(6);BWL.add(7);
        System.out.println(BWL);
        UnfairWaitList<Integer> UWF = new UnfairWaitList<>();
        UWF.add(1);UWF.add(2);UWF.add(3);UWF.add(4);UWF.add(5);UWF.add(6);UWF.add(7);UWF.add(8);UWF.remove(3);
        System.out.print(UWF);
    }
}
