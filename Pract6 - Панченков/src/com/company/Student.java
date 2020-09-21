package com.company;

import java.util.ArrayList;

public class Student {
    private int num_stud, kurs;
    private String name;

    public Student(){}

    public Student(int num_stud, int kurs, String name){
        this.num_stud=num_stud;
        this.kurs =kurs;
        this.name=name;
    }

    public int getNum_stud() {
        return num_stud;
    }

    public void setNum_stud(int id) {
        this.num_stud = num_stud;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void Insertion_Sort(ArrayList<Student>mas){
        Student student;
        for (int i = 0; i < mas.size(); i++) {
            int value = mas.get(i).getNum_stud();
            int x = i - 1;
            for (; x >= 0; x--) {
                if (value < mas.get(x).getNum_stud()) {
                    student=mas.get(x+1);
                    mas.set(x+1,mas.get(x));
                    mas.set(x,student);
                } else
                    break;
            }
            student=mas.get(x + 1);
            student.setNum_stud(value);
            mas.set(x+1,student);
        }
    }

    @Override
    public String toString(){
        return "Student {"+"num_stud: "+ num_stud+" kurs: "+kurs+ " name: "+name+"}";
    }
}
