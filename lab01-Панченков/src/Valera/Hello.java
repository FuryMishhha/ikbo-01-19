package Valera;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Double year, radius;
        String color, magaz, name, author;
        System.out.print("Введите возраст и окрас вашего питомца: ");
        Scanner scanner= new Scanner(System.in);
        year=scanner.nextDouble();
        color=scanner.nextLine();
        System.out.print("Введите радиус мяча и магазин покупки: ");
        radius=scanner.nextDouble();
        magaz=scanner.nextLine();
        System.out.print("Введите название книги и её автора: ");
        name=scanner.next();
        author=scanner.next();
        Dog dog = new Dog(year,color);
        Ball ball = new Ball(radius, magaz);
        Book book = new Book(name, author);
        System.out.println(dog.toString() + "\n"+ball.toString()+"\n"+book.toString());
    }
}
