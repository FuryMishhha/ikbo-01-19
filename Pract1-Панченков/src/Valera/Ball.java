package Valera;

public class Ball {
    private double radius;
    private String magaz;
    public Ball(double r, String m) {
        radius = r;
        magaz = m;
    }
    public double getRadius() {
        return radius;
    }
    public String getMagaz() {
        return magaz;
    }
    public String toString(){
        return "Radius: "+getRadius()+" || Magaz:"+getMagaz();
    }
}