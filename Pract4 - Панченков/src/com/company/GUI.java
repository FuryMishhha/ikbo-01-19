package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    int milan=0, madrid=0;

    private JButton Milan = new JButton("AC Milan");
    private JButton Madrid = new JButton("Real Madrid");
    private JLabel Result = new JLabel("Result: 0 X 0");
    private JLabel Score = new JLabel("Last Scorer: N/A");
    private Label Winner = new Label("Winner: DRAW");

    public GUI(){

        super("Football!");

        setSize(new Dimension(800, 400));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Milan.setBounds(50,200,300,75);
        Madrid.setBounds(445,200,300,75);

        Result.setBounds(167,125,200,45);
        Score.setBounds(350,125,200,45);
        Winner.setBounds(550,125,200,45);

        Milan.addActionListener(new Millan_ButtonEventListener());
        Madrid.addActionListener(new Madrid_ButtonEventListener());
        setLayout(null);
        this.getContentPane().add(Milan);
        this.getContentPane().add(Madrid);
        this.getContentPane().add(Result);
        this.getContentPane().add(Winner);
        this.getContentPane().add(Score);
    }

    public void difference(String team){
        if(madrid<milan)
            Winner.setText("Winner: AC Milan");
        else if(madrid>milan)
            Winner.setText("Winner: Real Madrid");
        else
            Winner.setText("Winner: DRAW");
        Score.setText("Last Scorer: " + team);
        Result.setText("Result: "+ milan +" X "+ madrid);
    }

    class Millan_ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            milan++;
            difference("AC Milan");
        }
    }
    class Madrid_ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            madrid++;
            difference("Real Madrid");
        }
    }
}

