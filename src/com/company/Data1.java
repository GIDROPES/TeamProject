package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Data1 {

    public static JFrame getDataOk(){

        JFrame data1 = new JFrame();

        data1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        data1.setBounds(dimension.width/2 - 200, dimension.height/2 - 100, 400,250);


        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(400, 250));

        contentPane.setFilePath("src/Backgrounds/GoodOptionsBack.png");



        Color buttColor = new Color(47, 79, 79);                           //цвет кнопок

        Font font1 = new Font("Century Gothic", Font.BOLD, 20);
        Font font2 = new Font("Century Gothic", Font.BOLD, 16);


        JButton button1 = new JButton("OK");  // кнопки
        JLabel label = new JLabel("Restart the program"); // тексты


        Dimension buttonSize = new Dimension(120, 50);

        button1.setPreferredSize(buttonSize);   // размеры


        button1.setFont(font2);              // шрифты
        label.setFont(font1);


        button1.setOpaque(false);                                       //
        button1.setContentAreaFilled(false);
        button1.setForeground(new Color(255, 255, 255));

        label.setForeground(new Color(255, 255, 255));


        contentPane.add(button1);
        contentPane.add(label);


        layout.putConstraint(SpringLayout.NORTH, button1, 150, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 140, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.NORTH, label, 40, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, label, 105, SpringLayout.WEST, contentPane);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



        data1.setContentPane(contentPane);
        data1.setVisible(true);

        return data1;
    }
}

