package com.company;

class Ovcharka extends Dog{
    private String color;
    public Ovcharka(double weight, int age, int height, String color){
        super(weight, age, height);
        this.color=color;
    }
    public String getColor(){return color;}

    @Override
    public void displayInfo() {
        System.out.println("Вес: "+super.getWeight()+" Возраст: "+super.getAge()+" Высота: "+super.getHeight()+" Окрас: "+getColor());
    }
}
