package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {

    public JFrame getMenu() {
        JFrame Menu = new JFrame();
        Menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        Menu.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        Container contentPane = Menu.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        Color buttColor = new Color(47, 79, 79);                           //цвет кнопок


        Color colorback = new Color(0, 128, 128);                      //цвет фона окна
        Menu.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);

        JButton button1 = new JButton("LET'S START");
        JButton button2 = new JButton("OBJECTIVES");
        JButton button3 = new JButton("OPTIONS");             //насоздавал кнопок
        JButton button4 = new JButton("Exit");
        JButton button5 = new JButton("MOOD CALENDAR");

        layout.putConstraint(SpringLayout.NORTH, button1, 200, SpringLayout.NORTH, contentPane);    //
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, button1, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button2, 250, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, button2, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);  //расположил ёмаё
        layout.putConstraint(SpringLayout.NORTH, button3, 300, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, button3, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.SOUTH, button4, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.EAST, button4, -10, SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button5, 400, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button5, 100, SpringLayout.WEST, contentPane);

        Dimension buttonSize = new Dimension(160,40);

        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);
        button5.setPreferredSize(new Dimension(200,40));

        button1.setFont(font1);
        button2.setFont(font1);
        button3.setFont(font1);
        button4.setFont(font1);
        button5.setFont(font1);

        JLabel background=new JLabel(new ImageIcon("C:\\Users\\MagicBook\\Desktop\\XmPSDbJ"));

        button1.setBackground(buttColor); button1.setForeground(new Color(255,255,255));
        button2.setBackground(buttColor); button2.setForeground(new Color(255,255,255));
        button3.setBackground(buttColor); button3.setForeground(new Color(255,255,255));
        button5.setBackground(buttColor); button5.setForeground(new Color(255,255,255));

        button4.setBackground(colorback); button4.setForeground(new Color(255,255,255));


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoodQuestion moodQuestion = new MoodQuestion();
                moodQuestion.getMoodQuestion();
                Menu.setVisible(false);
            }
        });



        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);

        contentPane.add(background);

        Menu.setVisible(true);
        return Menu;
    }


}
