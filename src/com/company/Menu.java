package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Menu {

    public JFrame getMenu() {

        String firstLine = null;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/Data/Name.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        InputStreamReader isr = null;

        try {
            isr = new InputStreamReader(fis,"UTF-8");              //Подключил чтение файлов
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(isr);

        try {
            firstLine = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        JFrame Menu = new JFrame();
        Menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        Menu.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        contentPane.setFilePath("src/com/company/HelloBackground.png");

        Color buttColor = new Color(47, 79, 79);                           //цвет кнопок



        Font font1 = new Font("Century Gothic", Font.BOLD, 14);

        JButton button1 = new JButton("LET'S START");
        JButton button2 = new JButton("OBJECTIVES");
        JButton button3 = new JButton("OPTIONS");             //насоздавал кнопок
        JButton button4 = new JButton("Exit");
        JButton button5 = new JButton();

        layout.putConstraint(SpringLayout.NORTH, button1, 200, SpringLayout.NORTH, contentPane);    //
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, button1, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button2, 250, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, button2, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);  //расположил ёмаё
        layout.putConstraint(SpringLayout.NORTH, button3, 300, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, button3, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.SOUTH, button4, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.EAST, button4, -10, SpringLayout.EAST, contentPane);

        Dimension buttonSize = new Dimension(160,40);

        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);
        button5.setPreferredSize(new Dimension(250,40));

        button1.setFont(font1);
        button2.setFont(font1);
        button3.setFont(font1);
        button4.setFont(font1);
        button5.setFont(font1);

        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setForeground(new Color(255,255,255));

        button2.setOpaque(false);
        button2.setContentAreaFilled(false);
        button2.setForeground(new Color(255,255,255));

        button3.setOpaque(false);
        button3.setContentAreaFilled(false);
        button3.setForeground(new Color(255,255,255));

        button5.setOpaque(false);
        button5.setContentAreaFilled(false);
        button5.setForeground(new Color(255,255,255));

        button5.setText(firstLine);

        button4.setOpaque(false);
        button4.setContentAreaFilled(false);
        button4.setForeground(new Color(255,255,255));


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoodQuestion moodQuestion = new MoodQuestion();
                moodQuestion.getMoodQuestion();
                Menu.setVisible(false);
            }
        });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ObjectivesWindow ob = null;
                try {
                    ob = new ObjectivesWindow();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                ob.getObjectivesWindow();
                Menu.setVisible(false);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Options Options = new Options();
                Options.getOptions();
                Menu.setVisible(false);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        Options optFunc = new Options();
        ImageIcon avatar = new ImageIcon(optFunc.getAvatarPath());
        JLabel avatarLabel = new JLabel(avatar);
        JLabel emptyAvatar = new JLabel("<html> You can choose avatar <br> at settings</html>");

        emptyAvatar.setFont(font1);
        emptyAvatar.setForeground(new Color(255,255,255));

        layout.putConstraint(SpringLayout.NORTH, button5, 400, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button5, 50, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.NORTH, emptyAvatar, 50, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, emptyAvatar, 50, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.NORTH, avatarLabel, 100, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, avatarLabel, 50, SpringLayout.WEST, contentPane);

        Font arialBlack = new Font("Arial Black", Font.BOLD, 38);
        JLabel ourLabel = new JLabel("VEVAMA 2021");

        ourLabel.setForeground(new Color(200,200,200));
        ourLabel.setFont(arialBlack);

        layout.putConstraint(SpringLayout.NORTH, ourLabel, 200, SpringLayout.NORTH, button5);   //
        layout.putConstraint(SpringLayout.WEST, ourLabel, 30, SpringLayout.WEST, contentPane);

        contentPane.add(ourLabel);
        contentPane.add(emptyAvatar);
        contentPane.add(avatarLabel);
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);

        Menu.setContentPane(contentPane);
        Menu.pack();
        Menu.setVisible(true);
        return Menu;
    }
}
