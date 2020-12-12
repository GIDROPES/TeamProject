package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondQ {
    public static JFrame getSecondQ() {

        JFrame SQ = new JFrame();

        SQ.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        SQ.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        Container contentPane = SQ.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        SQ.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 20);
        Font font3 = new Font("Century Gothic", Font.BOLD, 24);


        JButton button1 = new JButton("Back");
        JButton button2 = new JButton("Man");
        JButton button3 = new JButton("Woman");

        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button2, 250, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, button2, 220, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button3, 250, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, button3, 520, SpringLayout.WEST, contentPane);


        Dimension buttonSize = new Dimension(160,40);
        Dimension buttonSize1 = new Dimension(200, 70);

        // кнопочки
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize1);
        button3.setPreferredSize(buttonSize1);

        button1.setFont(font1);
        button2.setFont(font3);
        button3.setFont(font3);



        JLabel label = new JLabel("Choose your gender"); // текст


        label.setFont(font2);



        button1.setBackground(colorback); button1.setForeground(new Color(255,255,255));
        button2.setBackground(colorback); button2.setForeground(new Color(255,255,255));
        button3.setBackground(colorback); button3.setForeground(new Color(255,255,255));


        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(label);


        layout.putConstraint(SpringLayout.WEST , label, 390,               // размещаем тексты и др. хурму
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 100,
                SpringLayout.NORTH, contentPane);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstQ FirstQ = new FirstQ();
                FirstQ.getFirstQ();
                SQ.setVisible(false);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThirdQ ThirdQ = new ThirdQ();
                ThirdQ.getThirdQ();
                SQ.setVisible(false);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThirdQ ThirdQ = new ThirdQ();
                ThirdQ.getThirdQ();
                SQ.setVisible(false);
            }
        });



        SQ.setVisible(true);

        return SQ;
    }

}
