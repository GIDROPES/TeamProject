package com.activities;

import com.company.ActivitiesQuestion;
import com.company.BackgroundPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Drawing extends UserMood {
    String[] randomPhrases = {"So, lets draw...", "We recommend to draw this","Let`s draw!","Draw this ones:","What about..."};

    String[] gmDrawIdeas = {"Вагончик с мороженым","Сапожник","Свинья копилка","<html>Облако, похожее на вашу<br>любимую еду</html>","Кот на подоконнике",
    "Цыпленка, что только вылупился","Строитель","Телефон будущего"};

    String[] bmDrawIdeas = {"Осенних птиц","Полевые цветы","Платье в горошек","Летний вечер","Тарелку с яблоками","Кленовый лист","Банку мёда","Свечу",
            "Уютный парк","Город во время ветра","Женскую руку","Аквариум","Перья","Спящую собаку"};

    Random random = new Random();

    String drawing1 = gmDrawIdeas[random.nextInt(gmDrawIdeas.length)];
    JLabel drawName1 = new JLabel(drawing1);

    String drawing2 = bmDrawIdeas[random.nextInt(bmDrawIdeas.length)];
    JLabel drawName2 = new JLabel(drawing2);

    public JFrame getDrawingWindow(){

        JFrame drawing = new JFrame();

        drawing.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        drawing.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 44);

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

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, generateButt, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.SOUTH, generateButt, -20, SpringLayout.SOUTH, contentPane);

        generateButt.setPreferredSize(generSize);
        generateButt.setFont(font1);
        generateButt.setForeground(Color.white);
        generateButt.setOpaque(false); generateButt.setContentAreaFilled(false);

        contentPane.add(button1);
        contentPane.add(generateButt);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion ActivitiesQuestion = new ActivitiesQuestion();
                ActivitiesQuestion.getActivitiesQuestion();
                drawing.setVisible(false);
            }
        });

        generateButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user_mood_is_good) {
                    Drawing drawing3 = new Drawing();
                    drawing3.setUserMoodGood();
                    drawing3.getDrawingWindow();
                    drawing.setVisible(false);
                }
                if (!user_mood_is_good){
                    Drawing drawing3 = new Drawing();
                    drawing3.setUserMoodBad();
                    drawing3.getDrawingWindow();
                    drawing.setVisible(false);
                }
            }
        });
        ImageIcon image = new ImageIcon("src/Data/drawing_icon.png");
        JLabel icon = new JLabel(image);

        contentPane.add(icon);

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, drawName1, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, drawName1, 0, SpringLayout.VERTICAL_CENTER, contentPane);


        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, drawName2, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, drawName2, 0, SpringLayout.VERTICAL_CENTER, contentPane);

        drawName1.setForeground(new Color(210,210,210));
        drawName1.setFont(font2);

        drawName2.setForeground(new Color(210,210,210));
        drawName2.setFont(font2);

        if (user_mood_is_good) {                                                    //При условии, что настроение пользователя хорошее
            contentPane.setFilePath("src/Backgrounds/GoodMoodBack.png");
            contentPane.add(drawName1);
        }
        else {
            contentPane.setFilePath("src/Backgrounds/BadMoodBack.png");
            phrase.setForeground(Color.black);
            contentPane.add(drawName2);
        }


        drawing.setContentPane(contentPane);
        drawing.setVisible(true);

        return drawing;
    }
}
