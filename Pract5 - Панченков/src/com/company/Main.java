package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        String s=an.next();
        int p=0;
        palindrome_8(s,p);
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(null_9(a,b));
        int c = in.nextInt();
        System.out.println(razvorot_10(c,0));
    }

    public static void palindrome_8(String s, int i) {
        if (s.charAt(i)==s.charAt(s.length()-i-1)) {
            if (i<=(s.length()/2)) palindrome_8(s, i+1);
            else System.out.println("Yes");
        }
        else System.out.println("No");
    }

    public static int null_9(int a, int b){
        if (a>b+1) return 0;
        if (a==0 || b==0) return 1;
        return null_9(a,b-1)+null_9(a-1,b-1);
    }

    public static int razvorot_10(int a,int b){
        if(a>0){
            b=10*b+a%10;
            a/=10;
            return razvorot_10(a,b);
        }
        else{
            return b;
        }
    }
}
