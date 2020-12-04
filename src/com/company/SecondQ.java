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


        JButton button9 = new JButton("Back");
        JButton button10 = new JButton("Man");
        JButton button11 = new JButton("Woman");

        layout.putConstraint(SpringLayout.SOUTH, button9, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button9, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button10, 250, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, button10, 220, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button11, 250, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, button11, 520, SpringLayout.WEST, contentPane);


        Dimension buttonSize = new Dimension(160,40);
        Dimension buttonSize1 = new Dimension(200, 70);

        // кнопочки
        button9.setPreferredSize(buttonSize);
        button10.setPreferredSize(buttonSize1);
        button11.setPreferredSize(buttonSize1);

        button9.setFont(font1);
        button10.setFont(font3);
        button11.setFont(font3);



        JLabel label = new JLabel("Choose your gender"); // текст


        label.setFont(font2);



        button9.setBackground(colorback); button9.setForeground(new Color(255,255,255));
        button10.setBackground(colorback); button10.setForeground(new Color(255,255,255));
        button11.setBackground(colorback); button11.setForeground(new Color(255,255,255));


        contentPane.add(button9);
        contentPane.add(button10);
        contentPane.add(button11);
        contentPane.add(label);


        layout.putConstraint(SpringLayout.WEST , label, 390,               // размещаем тексты и др. хурму
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 100,
                SpringLayout.NORTH, contentPane);

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstQ FirstQ = new FirstQ();
                FirstQ.getFirstQ();
                SQ.setVisible(false);
            }
        });

        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThirdQ ThirdQ = new ThirdQ();
                ThirdQ.getThirdQ();
                SQ.setVisible(false);
            }
        });

        button11.addActionListener(new ActionListener() {
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
