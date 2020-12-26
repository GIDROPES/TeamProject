package com.activities;

import com.company.ActivitiesQuestion;
import com.company.BackgroundPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Films extends UserMood {
    String[] gmBookName = {"Куриный бульон для души: 101 рождественская история","Стоянка поезда всего минута","Хроники Нарнии (ил. П. Бейнс)",
            "Зов предков. Белый Клык","Тихоня","Обожаю тебя ненавидеть"};

    String[] gmBookCoverPath = {"src/Books/Good/Куриный бульон.png","src/Books/Good/Стоянка поезда.png","src/Books/Good/Хроники нарнии.png",
            "src/Books/Good/Белый клык.png","src/Books/Good/Тихоня.png","src/Books/Good/Обожаю.png",};

    String[] randomPhrases = {"So, lets read...", "We recommend to read this","Good choice for your evening","Read this ones:"};
    private int iter;

    public JFrame getFilms(){

        JFrame film = new JFrame();

        film.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        film.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        Font font1 = new Font("Century Gothic", Font.BOLD, 14);

        JButton button1 = new JButton("Back");

        JButton generateButt = new JButton("Generate");

        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);

        Random random = new Random();
        JLabel phrase = new JLabel(randomPhrases[random.nextInt(randomPhrases.length)]);
        phrase.setFont(font1);
        phrase.setForeground(Color.black);

        layout.putConstraint(SpringLayout.NORTH, phrase, 50, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, phrase, 10, SpringLayout.HORIZONTAL_CENTER, contentPane);

        Dimension buttonSize = new Dimension(160,40);
        Dimension generSize = new Dimension(190, 50);

        button1.setPreferredSize(buttonSize);         // кнопочки размер
        button1.setFont(font1);
        button1.setForeground(new Color(255,255,255)); // размеры кнопочек
        button1.setOpaque(false); button1.setContentAreaFilled(false);

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, generateButt, -10, SpringLayout.HORIZONTAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.SOUTH, generateButt, -20, SpringLayout.SOUTH, contentPane);

        generateButt.setPreferredSize(generSize);
        generateButt.setFont(font1);
        generateButt.setForeground(Color.white);
        generateButt.setOpaque(false); generateButt.setContentAreaFilled(false);

        contentPane.add(phrase);
        contentPane.add(button1);
        contentPane.add(generateButt);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion ActivitiesQuestion = new ActivitiesQuestion();
                ActivitiesQuestion.getActivitiesQuestion();
                film.setVisible(false);
            }
        });

        if (user_mood_is_good) {                                                    //При условии, что настроение пользователя хорошее
            contentPane.setFilePath("src/Backgrounds/GoodMoodBack.png");
        }
        else contentPane.setFilePath("src/Backgrounds/BadMoodBack.png");

        film.setContentPane(contentPane);
        film.setVisible(true);

        return film;
    }
}