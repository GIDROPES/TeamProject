package com.activities;

import com.company.ActivitiesQuestion;
import com.company.BackgroundPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Music extends UserMood {
    String[] randomPhrases = {"So, lets listen...", "We recommend to listen this album","Good choice for you","Listen this ones:"};

    String[] gmAlbumName = {"Travis Scott: ASTROWORLD", "Lil Skies: Shelby", "Basic Boy: SUPERWORLD", "МС Сенечка: Звуки", "<html>Антоха МС:<br>Советы для молодожёнов</html>",
            "Dayglow: Fuzzybrain"};

    String[] gmAlbumCoverPath = {"src/Music/Good/Travis Scott.png","src/Music/Good/Lil Skies.png","src/Music/Good/Basic Boy.png",
            "src/Music/Good/МС Сенечка.png","src/Music/Good/Антоха МС.png","src/Music/Good/Dayglow.png",};

    Random random = new Random();

    String album1 = gmAlbumName[random.nextInt(gmAlbumName.length)];
    JLabel albumName1 = new JLabel(album1);


    ImageIcon cover1 = new ImageIcon(getIconPath1());
    JLabel coverPic1 = new JLabel(cover1);

    String[] bmAlbumName = {"Brennan Savage: TRAGEDY","XXXTENTACION: SKINS","Lil Peep: HELLBOY","Molchat Doma: ЭТАЖИ","Перемотка: Вечер Эпохи",
            "Bones: I Feel Like Dirt"};

    String[] bmAlbumCoverPath = {"src/Music/Bad/Brennan Savage.png","src/Music/Bad/XXXTENTACION.png","src/Music/Bad/Lil Peep.png",
            "src/Music/Bad/Molchat Doma.png","src/Music/Bad/Перемотка.png","src/Music/Bad/Bones.png",};

    String album2 = bmAlbumName[random.nextInt(bmAlbumName.length)];
    JLabel albumName2 = new JLabel(album2);


    ImageIcon cover2 = new ImageIcon(getIconPath2());
    JLabel coverPic2 = new JLabel(cover2);

    public JFrame getMusic(){

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
        Font font2 = new Font("Century Gothic", Font.BOLD, 36);

        JButton button1 = new JButton("Back");

        JButton generateButt = new JButton("Generate");

        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);

        Random random = new Random();
        JLabel phrase = new JLabel(randomPhrases[random.nextInt(randomPhrases.length)]);
        phrase.setFont(font1);

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
                music.setVisible(false);
            }
        });

        generateButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user_mood_is_good) {
                    Music music1 = new Music();
                    music1.setUserMoodGood();
                    music1.getMusic();
                    music.setVisible(false);
                }
                if (!user_mood_is_good){
                    Music music2 = new Music();
                    music2.setUserMoodBad();
                    music2.getMusic();
                    music.setVisible(false);
                }
            }
        });

        ImageIcon image = new ImageIcon("src/Data/music_icon.png");
        JLabel icon = new JLabel(image);

        contentPane.add(icon);

        layout.putConstraint(SpringLayout.WEST, albumName1, 40, SpringLayout.WEST, contentPane);   //
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, albumName1, 0, SpringLayout.VERTICAL_CENTER, contentPane);

        layout.putConstraint(SpringLayout.EAST, coverPic1, -80, SpringLayout.EAST, contentPane);   //
        layout.putConstraint(SpringLayout.NORTH, coverPic1, 250, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST, albumName2, 40, SpringLayout.WEST, contentPane);   //
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, albumName2, 0, SpringLayout.VERTICAL_CENTER, contentPane);

        layout.putConstraint(SpringLayout.EAST, coverPic2, -80, SpringLayout.EAST, contentPane);   //
        layout.putConstraint(SpringLayout.NORTH, coverPic2, 250, SpringLayout.NORTH, contentPane);

        albumName1.setForeground(new Color(210,210,210));
        albumName1.setFont(font2);

        albumName2.setForeground(new Color(210,210,210));
        albumName2.setFont(font2);

        if (user_mood_is_good) {                                                    //При условии, что настроение пользователя хорошее
            contentPane.setFilePath("src/Backgrounds/GoodMoodBack.png");
            phrase.setForeground(Color.white);
            contentPane.add(albumName1);
            contentPane.add(coverPic1);
        }
        else {
            contentPane.setFilePath("src/Backgrounds/BadMoodBack.png");
            phrase.setForeground(Color.black);
            contentPane.add(albumName2);
            contentPane.add(coverPic2);
        }


        music.setContentPane(contentPane);
        music.setVisible(true);

        return music;
    }

    private String getIconPath1(){
        int iter = 0;
        for (int i = 0; i < gmAlbumName.length; i++){
            if (gmAlbumName[i].equals(album1))
                iter = i;
        }
        return  gmAlbumCoverPath[iter];
    }

    private String getIconPath2(){
        int iter = 0;
        for (int i = 0; i < bmAlbumCoverPath.length; i++){
            if (bmAlbumName[i].equals(album2))
                iter = i;
        }
        return  bmAlbumCoverPath[iter];
    }
}
