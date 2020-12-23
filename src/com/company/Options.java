package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options {
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


        Color buttColor = new Color(47, 79, 79);                           //цвет кнопок

        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 16);

        JButton button1 = new JButton("Back");
        JButton button2 = new JButton("OK");

        Dimension buttonSize = new Dimension(160,40);

        button1.setPreferredSize(buttonSize);

        button1.setFont(font1);

        button1.setOpaque(false);                                       //
        button1.setContentAreaFilled(false);
        button1.setForeground(new Color(255, 255, 255));

        contentPane.add(button1);



        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ava.setVisible(false);
            }
        });


        ava.setContentPane(contentPane);
        ava.setVisible(true);

        return ava;
    }
}
