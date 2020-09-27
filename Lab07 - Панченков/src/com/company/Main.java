package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        ArrayList<Book> arrayList=new ArrayList<>(3);
        arrayList.add(new Book(1937, "Mumu", "Albert"));
        arrayList.add(new Book(1815, "Calipso", "Alex"));
        arrayList.add(new Book(1902, "Globus", "Eugene"));
        Collections.sort(arrayList,Book::changeByDateOfPublication);
        for(Book book:arrayList){
            System.out.println(book);
        }
    }
}
