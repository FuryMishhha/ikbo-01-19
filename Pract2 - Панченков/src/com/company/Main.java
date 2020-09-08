package com.company;

public class Main {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(103, 201);
        Author author = new Author( "Evgeniy Scvorcov", "gg@mail.ru", 'M' );
        System.out.print(b1+"\n"+author);
    }
}
