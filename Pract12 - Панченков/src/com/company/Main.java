package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер, для которого вам необходима данная операция: ");
        String str = scanner.next();
        Integer len = str.length();
        char ch = str.charAt(0);
        System.out.print("Вывод по заданию: +");
        if (ch=='+')
            System.out.print("<"+str.substring(1,len-10)+">-<"+str.substring(str.substring(1,len-10).length()+1,len-7) +">-<"+str.substring(len-7,len-4) +">-<"+str.substring(len-4,len)+">");
        else
            System.out.print("<7>"+"-<" +str.substring(str.substring(1,len-10).length()+1,len-7) +">-<"+str.substring(len-7,len-4) +">-<"+str.substring(len-4,len)+">");
    }
}
