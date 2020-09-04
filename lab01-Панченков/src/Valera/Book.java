package Valera;

public class Book {
    private String author;
    private String title;
    public Book(String r, String m) {
        author = m;
        title = r;
    }
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return title;
    }
    public String toString(){
        return "Title: "+getName()+" || Author: "+getAuthor();
    }
}