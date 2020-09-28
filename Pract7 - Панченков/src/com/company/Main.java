package com.company;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque <Integer> Player1 = new ArrayDeque(5), Player2 = new ArrayDeque(5);
        Player1.add(1);Player1.add(3);Player1.add(5);Player1.add(7);Player1.add(9);
        Player2.add(2);Player2.add(4);Player2.add(6);Player2.add(8);Player2.add(0);
        int i = 0, p1, p2;
        while (i < 106 && !Player1.isEmpty() && !Player2.isEmpty()) {
            p1 = Player1.getFirst();
            p2 = Player2.getFirst();
            Player1.removeFirst();
            Player2.removeFirst();
            if (p1 == p2) {
                Player1.addLast(p1);
                Player2.addLast(p2);
            }
            if ((p1 > p2 && p1 != 9 && p2 != 0) || (p1 == 0 && p2 == 9)) {
                Player1.addLast(p1);
                Player1.addLast(p2);
            }
            else {
                if (p1 < p2 || (p1 == 9 && p2 == 0)) {
                    Player2.addLast(p2);
                    Player2.addLast(p1);
                }
            }
            i++;
        }
        if (Player1.isEmpty())
            System.out.print("second " + i);
        else {
            if (Player2.isEmpty())
                System.out.print("first " + i);
            else
                System.out.print("botva");
        }
    }
}