package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private int num = 8, c = 0;
    private JLabel jLabel = new JLabel();
    private Timer timer;
    protected ImageIcon[] images = new ImageIcon[num];

    public Main() {
        for (int i = 0; i < num; i++)
            images[i] = new ImageIcon(this.getClass().getResource("/Im/image_part_00" + (i+1) + ".jpg"));
        start();
    }

    public void start() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = (c + 1) % num;
                jLabel.setIcon(images[c]);
            }
        };
        jLabel.setIcon(images[0]);
        timer = new Timer(150, listener);
        timer.start();
    }

    public JComponent Ani() {
        return jLabel;
    }

    public static void main(String[] args) {
        Runnable go = new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                JFrame jFrame = new JFrame("Animation");
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.add(main.Ani());
                jFrame.pack();
                jFrame.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(go);
    }
}
