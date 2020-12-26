package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Options {
    public String[] avatarPaths = {"src/Avatars/belka_avatar.png","src/Avatars/cat_avatar.png","src/Avatars/dog_avatar.png","src/Avatars/duck_avatar.png",
            "src/Avatars/fish_avatar.png","src/Avatars/fox_avatar.png"};

    public String[] buttNames = {"Squirrel","Cat","Dog","Duck","Fish","Fox"};

    private int key;

    public static JFrame getOptions() {

        JFrame opt = new JFrame();

        opt.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        opt.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        contentPane.setFilePath("src/Backgrounds/GoodOptionsBack.png");


        Color buttColor = new Color(47, 79, 79);                           //цвет кнопок

        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 16);


        JButton button1 = new JButton("Back");
        JButton button2 = new JButton("Delete data");
        JButton button3 = new JButton("Change avatar");

        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);

        Dimension buttonSize = new Dimension(160, 40);
        Dimension buttonSize1 = new Dimension(250, 70);

        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize1);
        button3.setPreferredSize(buttonSize1);

        button1.setFont(font1);
        button2.setFont(font2);
        button3.setFont(font2);

        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setForeground(new Color(255, 255, 255));


        button2.setOpaque(false);
        button2.setContentAreaFilled(false);
        button2.setForeground(new Color(255, 255, 255));

        button3.setOpaque(false);
        button3.setContentAreaFilled(false);
        button3.setForeground(new Color(255, 255, 255));


        ImageIcon logo = new ImageIcon("src\\com\\company\\logo.png");
        JLabel logolabel = new JLabel(logo);




        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu Menu = new Menu();
                Menu.getMenu();
                opt.setVisible(false);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Options data = new Options();
                data.getData();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Options ava = new Options();
                ava.getAvatar();
            }
        });


        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(logolabel);


        layout.putConstraint(SpringLayout.NORTH, button2, 150, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button2, 100, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button3, 350, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button3, 100, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.NORTH, logolabel, 20, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, logolabel, 400, SpringLayout.WEST, contentPane);


        opt.setContentPane(contentPane);
        opt.setVisible(true);

        return opt;
    }

    public JFrame getData() {

        JFrame data = new JFrame();


        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        data.setBounds(dimension.width / 2 - 230, dimension.height / 2 - 120, 500, 300);


        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(500, 300));

        contentPane.setFilePath("src/Backgrounds/GoodOptionsBack.png");


        Color buttColor = new Color(47, 79, 79);                           //цвет кнопок

        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 16);

        JButton button1 = new JButton("OK");  // кнопки
        JLabel label = new JLabel("Are you sure you want to delete all data?"); // тексты
        JLabel label1 = new JLabel("To confirm your actions, enter CONFIRM");
        JTextField field = new JTextField();                 // Добавили панель для ввода

        Dimension buttonSize = new Dimension(120, 50);
        Dimension fieldSize = new Dimension(100, 30);

        button1.setPreferredSize(buttonSize);   // размеры
        field.setPreferredSize(fieldSize);

        button1.setFont(font2);              // шрифты
        label.setFont(font1);
        label1.setFont(font1);
        field.setFont(font1);

        button1.setOpaque(false);                                       //
        button1.setContentAreaFilled(false);
        button1.setForeground(new Color(255, 255, 255));

        label.setForeground(new Color(255, 255, 255));
        label1.setForeground(new Color(255, 255, 255));
        field.setForeground(new Color(0, 0, 0));

        contentPane.add(button1);
        contentPane.add(label);
        contentPane.add(label1);
        contentPane.add(field);

        layout.putConstraint(SpringLayout.NORTH, button1, 200, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 185, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.NORTH, label, 30, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, label, 115, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.NORTH, label1, 60, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, label1, 117, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.NORTH, field, 130, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, field, 195, SpringLayout.WEST, contentPane);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(field.getText().equals("CONFIRM")) {
                    Data1 ok = new Data1();
                    ok.getDataOk();
                }
            }
        });


        data.setContentPane(contentPane);
        data.setVisible(true);

        return data;
    }
    public JFrame getAvatar(){


        JFrame ava = new JFrame();

        ava.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        ava.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        contentPane.setFilePath("src/Backgrounds/GoodOptionsBack.png");

        Font font1 = new Font("Century Gothic", Font.BOLD, 14);

        JButton button1 = new JButton("Back");

        JButton ava_button1 = new JButton(buttNames[0]);
        JButton ava_button2 = new JButton(buttNames[1]);
        JButton ava_button3 = new JButton(buttNames[2]);

        JButton ava_button4 = new JButton(buttNames[3]);
        JButton ava_button5 = new JButton(buttNames[4]);
        JButton ava_button6 = new JButton(buttNames[5]);

        Dimension buttonSize = new Dimension(160,40);
        Dimension moodSize = new Dimension(200, 50);

        Color white_text = new Color(255,255,255);

        button1.setPreferredSize(buttonSize);
        button1.setFont(font1);
        button1.setOpaque(false);                                       //
        button1.setContentAreaFilled(false);
        button1.setForeground(new Color(255, 255, 255));


        ava_button1.setPreferredSize(moodSize);
        ava_button2.setPreferredSize(moodSize);
        ava_button3.setPreferredSize(moodSize);

        ava_button4.setPreferredSize(moodSize);
        ava_button5.setPreferredSize(moodSize);
        ava_button6.setPreferredSize(moodSize);

        ava_button1.setFont(font1); ava_button2.setFont(font1); ava_button3.setFont(font1);
        ava_button4.setFont(font1); ava_button5.setFont(font1); ava_button6.setFont(font1);

        ava_button1.setOpaque(false); ava_button1.setContentAreaFilled(false); ava_button1.setForeground(white_text);
        ava_button2.setOpaque(false); ava_button2.setContentAreaFilled(false); ava_button2.setForeground(white_text);
        ava_button3.setOpaque(false); ava_button3.setContentAreaFilled(false); ava_button3.setForeground(white_text);
        ava_button4.setOpaque(false); ava_button4.setContentAreaFilled(false); ava_button4.setForeground(white_text);
        ava_button5.setOpaque(false); ava_button5.setContentAreaFilled(false); ava_button5.setForeground(white_text);
        ava_button6.setOpaque(false); ava_button6.setContentAreaFilled(false); ava_button6.setForeground(white_text);

        contentPane.add(button1);
        contentPane.add(ava_button1);
        contentPane.add(ava_button2);
        contentPane.add(ava_button3);
        contentPane.add(ava_button4);
        contentPane.add(ava_button5);
        contentPane.add(ava_button6);

        layout.putConstraint(SpringLayout.NORTH, ava_button1, 400, SpringLayout.NORTH, contentPane);   //Кнопки для аватарок
        layout.putConstraint(SpringLayout.WEST, ava_button1, 200, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.SOUTH, ava_button2, -40, SpringLayout.NORTH, ava_button1);
        layout.putConstraint(SpringLayout.WEST, ava_button2, 200, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.SOUTH, ava_button3, -40, SpringLayout.NORTH, ava_button2);
        layout.putConstraint(SpringLayout.WEST, ava_button3, 200, SpringLayout.WEST, contentPane);

        layout.putConstraint(SpringLayout.NORTH, ava_button4, 400, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.EAST, ava_button4, -200, SpringLayout.EAST, contentPane);

        layout.putConstraint(SpringLayout.SOUTH, ava_button5, -40, SpringLayout.NORTH, ava_button4);
        layout.putConstraint(SpringLayout.EAST, ava_button5, -200, SpringLayout.EAST, contentPane);

        layout.putConstraint(SpringLayout.SOUTH, ava_button6, -40, SpringLayout.NORTH, ava_button5);
        layout.putConstraint(SpringLayout.EAST, ava_button6, -200, SpringLayout.EAST, contentPane);


        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   // Кнопка навигации
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ava.setVisible(false);
            }
        });

        ava_button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writeAvatarToFile(0);
                ava.setVisible(false);
            }
        });

        ava_button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writeAvatarToFile(1);
                ava.setVisible(false);
            }
        });

        ava_button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writeAvatarToFile(2);
                ava.setVisible(false);
            }
        });
        ava_button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writeAvatarToFile(3);
                ava.setVisible(false);
            }
        });
        ava_button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writeAvatarToFile(4);
                ava.setVisible(false);
            }
        });
        ava_button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writeAvatarToFile(5);
                ava.setVisible(false);
            }
        });

        ava.setContentPane(contentPane);
        ava.setVisible(true);

        return ava;
    }


    public void writeAvatarToFile(int key){

        PrintWriter writer = null;
        try {
            writer = new PrintWriter("src/Data/Avatar.txt");
        } catch (FileNotFoundException o) {
            // TODO Auto-generated catch block
            o.printStackTrace();
        }

        writer.print(buttNames[key]);
        writer.flush();
        writer.close();

    }

    public String getAvatarPath(){
        String path = "";

        String writedAvatarName = "";

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/Data/Avatar.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        InputStreamReader isr = null;

        try {
            isr = new InputStreamReader(fis,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(isr);

        try {
            writedAvatarName = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i=0; i < buttNames.length; i++){
            if (writedAvatarName.equals(buttNames[i])) {
                path = avatarPaths[i];
                break;
            }
            if (writedAvatarName.equals("")){ path = "Default"; }
        }
        return path;

    }
}
