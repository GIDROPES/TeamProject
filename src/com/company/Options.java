package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options {
    public static JFrame getOptions(){

        JFrame opt = new JFrame();

        opt.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        opt.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        Container contentPane = opt.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        Color colorback1 = new Color(224,255,255);
        opt.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 18);

        JButton button1 = new JButton("Back");
        JButton button2 = new JButton("Change name");
        JButton button3 = new JButton("Choose an avatar");

        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button2, 200, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button2, 350, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button3, 350, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button3, 350, SpringLayout.WEST, contentPane);


        Dimension buttonSize = new Dimension(160,40);
        Dimension buttonSize1 = new Dimension(260,70);


        button1.setPreferredSize(buttonSize);         // кнопочки размер
        button2.setPreferredSize(buttonSize1);
        button3.setPreferredSize(buttonSize1);


        button1.setFont(font1);
        button2.setFont(font1);
        button3.setFont(font1);


        button1.setBackground(new Color(255,255,255,0)); button1.setForeground(new Color(0,0,0)); // цвет кнопочек
        button2.setBackground(new Color(255,255,255,0)); button2.setForeground(new Color(0,0,0));
        button3.setBackground(new Color(255,255,255,0)); button3.setForeground(new Color(0,0,0));

        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);


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
                Name Name = new Name();
                Name.getName();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Avatar Avatar = new Avatar();
                Avatar.getAvatar();
            }
        });


        opt.setVisible(true);

        return opt;
    }
}
