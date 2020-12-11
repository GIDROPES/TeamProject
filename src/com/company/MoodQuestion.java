package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoodQuestion {
    public static JFrame getMoodQuestion(){

        JFrame moodframe = new JFrame();
        moodframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        moodframe.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        Container contentPane = moodframe.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        Color colorback1 = new Color(0,255,0);
        Color colorback2 = new Color(255,0,0);
        moodframe.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 20);

        JButton button1 = new JButton("Back");
        JButton button2 = new JButton("Great!");
        JButton button3 = new JButton("Badly");



        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button2, 400, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button2, 200, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button3, 400, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button3, 500, SpringLayout.WEST, contentPane);


        Dimension buttonSize = new Dimension(160,40);
        Dimension buttonSize1 = new Dimension(250, 80);

        button1.setPreferredSize(buttonSize);         // кнопочки
        button2.setPreferredSize(buttonSize1);
        button3.setPreferredSize(buttonSize1);

        button1.setFont(font1);
        button2.setFont(font1);
        button3.setFont(font1);


        JLabel label = new JLabel("How Is your mood?");

        label.setFont(font2);


        button1.setBackground(colorback); button1.setForeground(new Color(255,255,255)); // размеры кнопочек
        button2.setBackground(colorback1); button2.setForeground(new Color(255,255,255));
        button3.setBackground(colorback2); button3.setForeground(new Color(255,255,255));


        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(label);


        layout.putConstraint(SpringLayout.WEST , label, 400,               // размещаем тексты
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 150,
                SpringLayout.NORTH, contentPane);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion ActivitiesQuestion = new ActivitiesQuestion();
                ActivitiesQuestion.getActivitiesQuestion();
                moodframe.setVisible(false);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion ActivitiesQuestion = new ActivitiesQuestion();
                ActivitiesQuestion.getActivitiesQuestion();
                moodframe.setVisible(false);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu Menu = new Menu();
                Menu.getMenu();
                moodframe.setVisible(false);

            }


        });





        moodframe.setVisible(true);
        return moodframe;
    }
}
