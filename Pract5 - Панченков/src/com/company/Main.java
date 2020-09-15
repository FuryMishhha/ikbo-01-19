package com.company;

import java.util.Scanner;

public class Main {

    boolean f=false;

    public static void main(String[] args) {
        System.out.println(palindrome_8());
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(null_9(a,b));
        int c = in.nextInt();
        System.out.println(razvorot_10(c,0));
    }

    public static boolean palindrome_8() {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
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
