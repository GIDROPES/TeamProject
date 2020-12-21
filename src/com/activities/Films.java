package com.activities;

import com.company.ActivitiesQuestion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Films {
    public static JFrame getFilms(){

        JFrame film = new JFrame();

        film.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        film.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        Container contentPane = film.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        Color colorback1 = new Color(224,255,255);
        film.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);

        JButton button1 = new JButton("Back");

        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);

        Dimension buttonSize = new Dimension(160,40);

        button1.setPreferredSize(buttonSize);         // кнопочки размер

        button1.setFont(font1);

        button1.setBackground(colorback); button1.setForeground(new Color(255,255,255)); // размеры кнопочек

        contentPane.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion ActivitiesQuestion = new ActivitiesQuestion();
                ActivitiesQuestion.getActivitiesQuestion();
                film.setVisible(false);
            }
        });

        film.setVisible(true);

        return film;
    }
}
