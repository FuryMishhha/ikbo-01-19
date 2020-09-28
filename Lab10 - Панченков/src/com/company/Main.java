package com.company;

public class Main {
    public static void main(String[] args) {
        Array<Object>a=new Array<Object>();
        Object a1[]= new Object[7];
        a1[0]="lol";a1[1]="rar";a1[2]=979;
        a1[3]=123;a1[4]="Corn";a1[5]=11.3;
        a1[6]=2;
        a.set_A(a1);
        System.out.println(a.getElem(4));
        System.out.print(a.getLength());
    }
}
