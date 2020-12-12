package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActivitiesQuestion {
    public static JFrame getActivitiesQuestion(){

        JFrame activitiesframe = new JFrame();               // настройки
        activitiesframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        activitiesframe.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        Container contentPane = activitiesframe.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        Color colorback1 = new Color(224,255,255);
        activitiesframe.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 20);
        Font font3 = new Font("Century Gothic", Font.BOLD, 18);


        JButton button1 = new JButton("Back");               // кнопки
        JButton button2 = new JButton("Films");
        JButton button3 = new JButton("Music");
        JButton button4 = new JButton("Books");
        JButton button5 = new JButton("Painting");




        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button2, 170, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, button2, 340, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button3, 250, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, button3, 340, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button4, 330, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, button4, 340, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button5, 410, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, button5, 340, SpringLayout.WEST, contentPane);


        JLabel label = new JLabel("Choose your type of activity");

        label.setFont(font2);

        Dimension buttonSize = new Dimension(160,40);
        Dimension buttonSize1 = new Dimension(300,50);

        button1.setPreferredSize(buttonSize);         // кнопочки размер
        button2.setPreferredSize(buttonSize1);
        button3.setPreferredSize(buttonSize1);
        button4.setPreferredSize(buttonSize1);
        button5.setPreferredSize(buttonSize1);



        button1.setFont(font1);
        button2.setFont(font3);
        button3.setFont(font3);
        button4.setFont(font3);
        button5.setFont(font3);




        button1.setBackground(colorback); button1.setForeground(new Color(255,255,255)); // размеры кнопочек
        button2.setBackground(colorback1); button2.setForeground(new Color(0,0,0));
        button3.setBackground(colorback1); button3.setForeground(new Color(0,0,0));
        button4.setBackground(colorback1); button4.setForeground(new Color(0,0,0));
        button5.setBackground(colorback1); button5.setForeground(new Color(0,0,0));






        layout.putConstraint(SpringLayout.WEST , label, 350,               // размещаем тексты
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 30,
                SpringLayout.NORTH, contentPane);


        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);
        contentPane.add(label);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoodQuestion MoodQuestion = new MoodQuestion();
                MoodQuestion.getMoodQuestion();
                activitiesframe.setVisible(false);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Films Films = new Films();
                Films.getFilms();
                activitiesframe.setVisible(false);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Music Music = new Music();
                Music.getMusic();
                activitiesframe.setVisible(false);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Books Books = new Books();
                Books.getBooks();
                activitiesframe.setVisible(false);
            }
        });

        activitiesframe.setVisible(true);

        return activitiesframe;
    }
}
