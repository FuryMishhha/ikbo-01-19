package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n|-Тест LinkedQueue-|");
        LinkedQueue Link = new LinkedQueue();
        System.out.println("Проверка на отсутствие элементов: " + Link.isEmpty());
        System.out.print("Сколько элементов вы хотите добавить в очередь? ");
        Integer a = scanner.nextInt();
        for (int i=0; i<a; i++){
            System.out.print("Введите " + (i+1) + " элемент: ");
            Link.enqueue(scanner.next());
        }
        System.out.println("Проверка на отсутствие элементов: " + Link.isEmpty());
        System.out.println("Первый элемент в очереди: "+ Link.element());
        System.out.println("Размер очереди: "+ Link.size());
        System.out.println("Удаление и возвращение первого элемента в очереди: "+ Link.dequeue());
        System.out.println("Удаление очереди");
        Link.clear();
        System.out.println("Размер очереди: "+Link.size()+"\n");

        System.out.println("|-Тест ArrayQueue-|");
        ArrayQueue Array = new ArrayQueue();
        System.out.println("Проверка на отсутствие элементов: " + Array.isEmpty());
        System.out.print("Сколько элементов вы хотите добавить в очередь? ");
        Integer b = scanner.nextInt();
        for (int i=0; i<b; i++){
            System.out.print("Введите " + (i+1) + " элемент: ");
            Array.enqueue(scanner.next());
        }
        System.out.println("Проверка на отсутствие элементов: " + Array.isEmpty());
        System.out.println("Первый элемент в очереди: "+ Array.element());
        System.out.println("Размер очереди: "+ Array.size());
        System.out.println("Удаление и возвращение первого элемента в очереди: "+ Array.dequeue());
        System.out.println("Удаление очереди");
        Array.clear();
        System.out.println("Размер очереди: "+Array.size());
    }
}
