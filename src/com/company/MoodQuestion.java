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
        moodframe.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 20);

        JButton button6 = new JButton("Back");
        JButton button7 = new JButton("Next");


        layout.putConstraint(SpringLayout.SOUTH, button6, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button6, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.SOUTH, button7, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.EAST, button7, -10, SpringLayout.EAST, contentPane);


        Dimension buttonSize = new Dimension(160,40);

        button6.setPreferredSize(buttonSize);         // кнопочки
        button7.setPreferredSize(buttonSize);

        button6.setFont(font1);
        button7.setFont(font1);

        JLabel background = new JLabel(new ImageIcon("C:\\Users\\MagicBook\\Desktop\\XmPSDbJ"));
        JLabel label = new JLabel("We invite you to answer a number of questions"); // тексты
        JLabel label1 = new JLabel("What's your name?");

        label.setFont(font2);
        label1.setFont(font2);

        button6.setBackground(colorback); button6.setForeground(new Color(255,255,255)); // размеры кнопочек
        button7.setBackground(colorback); button7.setForeground(new Color(255,255,255));


        contentPane.add(button6);
        contentPane.add(button7);
        contentPane.add(label);
        contentPane.add(label1);

        layout.putConstraint(SpringLayout.WEST , label, 250,               // размещаем тексты
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 50,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , label1, 370,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label1, 100,
                SpringLayout.NORTH, contentPane);


        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion ActivitiesQuestion = new ActivitiesQuestion();
                ActivitiesQuestion.getActivitiesQuestion();
                moodframe.setVisible(false);
            }
        });

        button6.addActionListener(new ActionListener() {
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
