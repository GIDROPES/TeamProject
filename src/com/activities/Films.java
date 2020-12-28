package com.activities;

import com.company.ActivitiesQuestion;
import com.company.BackgroundPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Films extends UserMood {
    String[] randomPhrases = {"So, lets watch...", "We recommend to watch this","Good choice for your evening","Watch this ones:"};

    String[] gmFilmName = {"Субмарина(2010)","Огни святого эльма(1985)","<html>Невероятная жизнь<br>Уолтера Митти (2013)</html>",
            "Мой мальчик (2002)","Госпожа Америка (2015)"};

    String[] gmFilmCoverPath = {"src/Films/Good/Субмарина.png","src/Films/Good/Огни.png","src/Films/Good/Невероятная жизнь.png",
            "src/Films/Good/Мой мальчик.png","src/Films/Good/Госпожа Америка.png",};

    Random random = new Random();

    String film1 = gmFilmName[random.nextInt(gmFilmName.length)];
    JLabel filmName1 = new JLabel(film1);

    ImageIcon cover1 = new ImageIcon(getIconPath1());
    JLabel coverPic1 = new JLabel(cover1);

    String[] bmFilmName = {"Титаник","<html>3 Метра над <br> уровнем неба</html>","Если я останусь","Милые кости","<html>После твоя жизнь <br> не будет прежней"
    };

    String[] bmFilmCoverPath = {"src/Films/Bad/Titanic.png","src/Films/Bad/3 метра над уровнем.png",
            "src/Films/Bad/Если я останусь.png","src/Films/Bad/Милые кости.png", "src/Films/Bad/После твоя жизнь не будет прежней.png",};

    String film2 = bmFilmName[random.nextInt(bmFilmName.length)];
    JLabel filmName2 = new JLabel(film2);


    ImageIcon cover2 = new ImageIcon(getIconPath2());
    JLabel coverPic2 = new JLabel(cover2);

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

        ImageIcon image = new ImageIcon("src/Data/film_icon.png");
        JLabel icon = new JLabel(image);

        contentPane.add(icon);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion activitiesQuestion = new ActivitiesQuestion();
                activitiesQuestion.getActivitiesQuestion();
                film.setVisible(false);
            }
        });

        generateButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user_mood_is_good) {
                    Films films1 = new Films();
                    films1.setUserMoodGood();
                    films1.getFilms();
                    film.setVisible(false);
                }
                if (!user_mood_is_good){
                    Films films2 = new Films();
                    films2.setUserMoodBad();
                    films2.getFilms();
                    film.setVisible(false);
                }
            }
        });


        layout.putConstraint(SpringLayout.VERTICAL_CENTER, coverPic1, 0, SpringLayout.VERTICAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.EAST, coverPic1, -40, SpringLayout.EAST, contentPane);

        layout.putConstraint(SpringLayout.VERTICAL_CENTER, filmName1, 0, SpringLayout.VERTICAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, filmName1, 50, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.VERTICAL_CENTER, coverPic2, 0, SpringLayout.VERTICAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.EAST, coverPic2, -40, SpringLayout.EAST, contentPane);

        layout.putConstraint(SpringLayout.VERTICAL_CENTER, filmName2, 0, SpringLayout.VERTICAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, filmName2, 50, SpringLayout.WEST, contentPane);

        filmName1.setForeground(new Color(210,210,210));
        filmName1.setFont(font2);

        filmName2.setForeground(new Color(210,210,210));
        filmName2.setFont(font2);

        if (user_mood_is_good) {                                                    //При условии, что настроение пользователя хорошее
            contentPane.setFilePath("src/Backgrounds/GoodMoodBack.png");
            contentPane.add(filmName1);
            contentPane.add(coverPic1);
        }
        else {
            contentPane.setFilePath("src/Backgrounds/BadMoodBack.png");
            phrase.setForeground(Color.black);
            contentPane.add(filmName2);
            contentPane.add(coverPic2);
        }

        film.setContentPane(contentPane);
        film.setVisible(true);

        return film;
    }

    private String getIconPath1(){
        int iter = 0;
        for (int i = 0; i < gmFilmName.length; i++){
            if (gmFilmName[i].equals(film1))
                iter = i;
        }
        return  gmFilmCoverPath[iter];
    }

    private String getIconPath2(){
        int iter = 0;
        for (int i = 0; i < bmFilmName.length; i++){
            if (bmFilmName[i].equals(film2))
                iter = i;
        }
        return  bmFilmCoverPath[iter];
    }
}
