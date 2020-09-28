package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> user=new HashMap<String, Integer>();
        user.put("Valera",841039391);
        user.put("Joo",828202333);
        user.put("Ben",913883133);
        try {
            INN(user,841039391,"Valera");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            INN(user,1223444444,"Ben");
        } catch (NoSuchElementException  e) {
            System.out.println(e);
        }
    }

    static void INN(Map<String,Integer> user, int INN, String name){
        int new_INN = user.get(name);
        if(INN!=(new_INN))
            throw new NoSuchElementException("INN is wrong!");
        else
            System.out.println("All right!");
    }
}
