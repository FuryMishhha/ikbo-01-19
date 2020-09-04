package Valera;

public class Dog {
    private double year;
    private String color;
    public Dog(double r, String c) {
        year = r;
        color = c;
    }
    public double getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String toString(){
        return "Age: "+getYear()+" || Color:"+getColor();
    }
}