package com.company;

class Taksa extends Dog{
    private String wool;
    public Taksa(double weight, int age, int height, String wool){
        super(weight, age, height);
        this.wool=wool;
    }
    public String getWool(){return wool;}

    @Override
    public void displayInfo(){
        System.out.println("Вес: "+super.getWeight()+" Возраст: "+super.getAge()+" Высота: "+super.getHeight()+" Тип шерсти: "+getWool());
    }
}
