package com.company;

import javax.swing.*;
import java.awt.*;


public class FirstQ {
    public static JFrame getFirstQ(){

        JFrame FQ = new JFrame();
        FQ.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        FQ.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        Container contentPane = FQ.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        FQ.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 20);
        Font font3 = new Font("Century Gothic", Font.BOLD, 20);

        JButton button8 = new JButton("Back");
        JButton button9 = new JButton("Next");

        layout.putConstraint(SpringLayout.SOUTH, button8, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button8, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.SOUTH, button9, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.EAST, button9, -10, SpringLayout.EAST, contentPane);


        Dimension buttonSize = new Dimension(160,40);

        button8.setPreferredSize(buttonSize);         // кнопочки
        button9.setPreferredSize(buttonSize);

        button8.setFont(font1);
        button9.setFont(font1);


        JLabel label = new JLabel("We invite you to answer a number of questions"); // тексты
        JLabel label1 = new JLabel("What's your name?");

        label.setFont(font2);
        label1.setFont(font2);

        JTextField field = new JTextField();                 // Добавили панель для ввода

        field.setPreferredSize(new Dimension(500,50));     // Указали размеры


        button8.setBackground(colorback); button8.setForeground(new Color(255,255,255)); // размеры кнопочек
        button9.setBackground(colorback); button9.setForeground(new Color(255,255,255));


        contentPane.add(button8);
        contentPane.add(button9);
        contentPane.add(label);
        contentPane.add(label1);
        contentPane.add(field);

        layout.putConstraint(SpringLayout.WEST , label, 250,               // размещаем тексты и др. хурму
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 50,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , label1, 370,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label1, 100,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , field, 240,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, field, 350,
                SpringLayout.NORTH, contentPane);





        FQ.setVisible(true);

        return FQ;
    }
}
