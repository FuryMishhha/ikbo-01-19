package com.company;

import java.util.Comparator;

public class Book {
    private int date_of_publication;
    private String name, author;

    public Book(int date_of_publication, String name, String author){
        this.date_of_publication=date_of_publication;
        this.name=name;
        this.author=author;
    }

    public Book(){}

    public int getDate_of_publication(){
        return date_of_publication;
    }

    public void setDate_of_publication(int date_of_publication){
        this.date_of_publication=date_of_publication;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public int changeByDateOfPublication(Book book){
        return this.getDate_of_publication()-book.getDate_of_publication();
    }

    public static Comparator<Book> BookComparator = new Comparator<Book>() {
        public int compare(Book book1, Book book2) {
            return book1.changeByDateOfPublication(book2);
        }
    };

    @Override
    public String toString(){
        return "Book {" +
                "date of publication: " + date_of_publication +
                " name: " + name +
                ", author: " + author +
                '}';
    }
}
