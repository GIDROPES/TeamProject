package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoodQuestion {
    public static String[] goodMoods = {"Cool", "Wonderful","Ok"};
    public static String[] badMoods = {"Sad","Stressful","Annoyed"};

    public static JFrame getMoodQuestion(){


        JFrame moodframe = new JFrame();
        moodframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        moodframe.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        contentPane.setFilePath("src/com/company/HelloBackground.png");  //Использовал собственную функцию для пути фона окна


        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 20);

        JButton back_button = new JButton("Back");        //навигация

        JButton good_button1 = new JButton(getGoodMood(0));
        JButton good_button2 = new JButton(getGoodMood(1));
        JButton good_button3 = new JButton(getGoodMood(2));

        JButton bad_button1 = new JButton(getBadMoods(0));
        JButton bad_button2 = new JButton(getBadMoods(1));
        JButton bad_button3 = new JButton(getBadMoods(2));

        Dimension navigationSize = new Dimension(160,40);
        Dimension moodSize = new Dimension(200, 50);

        Color white_text = new Color(255,255,255);
        Color colorGoodBack = new Color(255, 255, 255); //Цвет для кнопок хорошего настроения
        Color black_text = new Color(0,0,0);


        back_button.setPreferredSize(navigationSize);// подбираю кнопкам размер

        good_button1.setPreferredSize(moodSize);
        good_button2.setPreferredSize(moodSize);
        good_button3.setPreferredSize(moodSize);

        bad_button1.setPreferredSize(moodSize);
        bad_button2.setPreferredSize(moodSize);
        bad_button3.setPreferredSize(moodSize);

        back_button.setFont(font1);
        good_button1.setFont(font1); good_button2.setFont(font1); good_button3.setFont(font1);
        bad_button1.setFont(font1); bad_button2.setFont(font1); bad_button3.setFont(font1);                    //стилизация кнопок

        back_button.setOpaque(false); back_button.setContentAreaFilled(false); back_button.setForeground(white_text);


        good_button1.setBackground(colorGoodBack);
        good_button2.setBackground(colorGoodBack);
        good_button3.setBackground(colorGoodBack);



        bad_button1.setOpaque(false); bad_button1.setContentAreaFilled(false); bad_button1.setForeground(white_text);
        bad_button2.setOpaque(false); bad_button2.setContentAreaFilled(false); bad_button2.setForeground(white_text);
        bad_button3.setOpaque(false); bad_button3.setContentAreaFilled(false); bad_button3.setForeground(white_text);

        contentPane.add(back_button);
        contentPane.add(good_button1);
        contentPane.add(good_button2);
        contentPane.add(good_button3);
        contentPane.add(bad_button1);
        contentPane.add(bad_button2);
        contentPane.add(bad_button3);

        layout.putConstraint(SpringLayout.SOUTH, back_button, -10, SpringLayout.SOUTH, contentPane);   // Кнопка навигации, её положение
        layout.putConstraint(SpringLayout.WEST, back_button, 10, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.NORTH, good_button1, 400, SpringLayout.NORTH, contentPane);   //Кнопки хорошего настроения
        layout.putConstraint(SpringLayout.WEST, good_button1, 200, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.SOUTH, good_button2, -40, SpringLayout.NORTH, good_button1);
        layout.putConstraint(SpringLayout.WEST, good_button2, 200, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.SOUTH, good_button3, -40, SpringLayout.NORTH, good_button2);
        layout.putConstraint(SpringLayout.WEST, good_button3, 200, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.NORTH, bad_button1, 400, SpringLayout.NORTH, contentPane);   //Кнопки плохого настроения
        layout.putConstraint(SpringLayout.EAST, bad_button1, -200, SpringLayout.EAST, contentPane);

        layout.putConstraint(SpringLayout.SOUTH, bad_button2, -40, SpringLayout.NORTH, bad_button1);
        layout.putConstraint(SpringLayout.EAST, bad_button2, -200, SpringLayout.EAST, contentPane);

        layout.putConstraint(SpringLayout.SOUTH, bad_button3, -40, SpringLayout.NORTH, bad_button2);
        layout.putConstraint(SpringLayout.EAST, bad_button3, -200, SpringLayout.EAST, contentPane);


        JLabel label = new JLabel("How Is your mood?");

        label.setFont(font2);
        label.setForeground(white_text);



        layout.putConstraint(SpringLayout.WEST , label, 400, SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 150, SpringLayout.NORTH, contentPane);

        contentPane.add(label);

        good_button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion activitiesQuestion = new ActivitiesQuestion();
                activitiesQuestion.setUserMoodGood();
                activitiesQuestion.getActivitiesQuestion();
                moodframe.setVisible(false);
            }
        });

        good_button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion activitiesQuestion = new ActivitiesQuestion();
                activitiesQuestion.setUserMoodGood();
                activitiesQuestion.getActivitiesQuestion();
                moodframe.setVisible(false);
            }
        });
        good_button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion activitiesQuestion = new ActivitiesQuestion();
                activitiesQuestion.setUserMoodGood();
                activitiesQuestion.getActivitiesQuestion();
                moodframe.setVisible(false);
            }
        });
        bad_button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion activitiesQuestion = new ActivitiesQuestion();
                activitiesQuestion.setUserMoodBad();
                activitiesQuestion.getActivitiesQuestion();
                moodframe.setVisible(false);
            }
        });

        bad_button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion activitiesQuestion = new ActivitiesQuestion();
                activitiesQuestion.setUserMoodBad();
                activitiesQuestion.getActivitiesQuestion();
                moodframe.setVisible(false);
            }
        });

        bad_button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion activitiesQuestion = new ActivitiesQuestion();
                activitiesQuestion.setUserMoodBad();
                activitiesQuestion.getActivitiesQuestion();
                moodframe.setVisible(false);
            }
        });

        bad_button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion activitiesQuestion = new ActivitiesQuestion();
                activitiesQuestion.setUserMoodBad();
                ActivitiesQuestion.getActivitiesQuestion();
                moodframe.setVisible(false);
            }
        });

        back_button.addActionListener(new ActionListener() {  //переход назад в менюшку
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu Menu = new Menu();
                Menu.getMenu();
                moodframe.setVisible(false);

            }
        });




        moodframe.setContentPane(contentPane);
        moodframe.setVisible(true);
        return moodframe;
    }

    public static String getGoodMood(int i){
        return goodMoods[i];
    }

    public static String getBadMoods(int i){
        return badMoods[i];
    }
}
