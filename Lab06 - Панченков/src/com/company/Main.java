package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame {
    private JTextField field = new JTextField(0);
    private JButton button = new JButton("Угадать!");
    private JLabel result = new JLabel("Угадайте число в диапазоне от 0 до 20. На это Вам даётся 3 попытки. Удачи!");
    Main() {
        final int[] x = {0};
        final boolean[] win={false};
        field.setBounds(0,180,500,20);
        button.setBounds(0,200,500,50);
        result.setBounds(17,160,500,20);
        setSize(new Dimension(500, 500));
        Random rand = new Random();
        int chislo = rand.nextInt(2);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x[0]++;
                int a = Integer.parseInt(field.getText());
                if (a == chislo) {
                    win[0]=true;
                    result.setText("Верно! Поздравляем!");
                    button.setVisible(false);
                }
                else {
                    if (a > chislo)
                        result.setText("Загаданное число меньше вашего. Осталось " + (3 - x[0]) + " попыток ");
                    else
                        result.setText("Загаданное число больше вашего. Осталось " + (3 - x[0]) + " попыток ");
                }
                if (x[0] == 3 && !win[0]) {
                    result.setText("Вы проиграли. Загаданное число: " + chislo);
                    button.setVisible(false);
                }
            }
        });
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.getContentPane().add(button);
        this.getContentPane().add(field);
        this.getContentPane().add(result);
    }
    public static void main(String arg[]) {
        new Main().setVisible(true);
    }
}
