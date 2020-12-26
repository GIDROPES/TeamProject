package com.activities;

import com.company.ActivitiesQuestion;
import com.company.BackgroundPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Music extends UserMood {
    public  JFrame getMusic(){

        JFrame music = new JFrame();

        music.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        music.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));


        Font font1 = new Font("Century Gothic", Font.BOLD, 14);

        JButton button1 = new JButton("Back");

        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);

        Dimension buttonSize = new Dimension(160,40);

        button1.setPreferredSize(buttonSize);         // кнопочки размер

        button1.setFont(font1);
        button1.setOpaque(false);
        button1.setOpaque(false);
        button1.setForeground(new Color(255,255,255)); // размеры кнопочек

        contentPane.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion ActivitiesQuestion = new ActivitiesQuestion();
                ActivitiesQuestion.getActivitiesQuestion();
                music.setVisible(false);
            }
        });

        if (user_mood_is_good) {                                                    //При условии, что настроение пользователя хорошее
            contentPane.setFilePath("src/Backgrounds/GoodMoodBack.png");
        }
        else contentPane.setFilePath("src/Backgrounds/BadMoodBack.png");


        music.setContentPane(contentPane);
        music.setVisible(true);

        return music;
    }
}
