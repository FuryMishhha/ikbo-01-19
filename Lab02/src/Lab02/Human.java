package Lab02;

import java.util.Scanner;

public class Human {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Integer iq, fingers;
        Double size, weight, length, scope;
        System.out.print("Введите iq человека и размер его головы: ");
        Head head = new Head (scanner.nextInt(), scanner.nextDouble());
        System.out.print("Введите размах ног и количество пальцев: ");
        Leg leg = new Leg (scanner.nextDouble(), scanner.nextInt());
        System.out.print("Введите длину и вес руки: ");
        Hand hand = new Hand (scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Параметры частей тела: "+"\nГолова: "+head.getIq()+"iq "+head.getSize()+"куб.см\nНога: "+leg.getScope()+"см "+leg.getFingers()+"пальца(ев)\nРука: "+hand.getLength()+"см "+hand.getWeight()+"кг");
    }
}
