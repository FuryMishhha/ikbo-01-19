package com.company;

import java.util.ArrayList;

public class Main extends Student{
    public static void main(String[] args) {
        ArrayList<Student> mas = new ArrayList<Student>();
        mas.add(new Student(4090, 3, "Sergey"));
        mas.add(new Student(103, 4, "Alex"));
        mas.add(new Student(2003, 1, "Eugene"));
        Insertion_Sort(mas);
        for(Student str: mas)
            System.out.println(str);
    }
}
