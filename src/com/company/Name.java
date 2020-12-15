package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Name {
    public static JFrame getName(){

        JFrame name = new JFrame();

        name.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        name.setBounds(dimension.width / 2 - 200, dimension.height / 2 - 100, 450, 200);

        Container contentPane = name.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(450, 200));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        name.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 12);

        JButton button1 = new JButton("OK");


        JTextField field = new JTextField();


        JLabel label = new JLabel("Enter your name");

        layout.putConstraint(SpringLayout.NORTH, button1, 110, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 140, SpringLayout.WEST, contentPane);


        Dimension buttonSize = new Dimension(160,40);
        Dimension textfieldSize = new Dimension(150,30);

        button1.setPreferredSize(buttonSize);         // кнопочки размер
        field.setPreferredSize(textfieldSize);

        button1.setFont(font1);
        field.setFont(font1);
        label.setFont(font1);

        button1.setBackground(new Color(255,255,255,0)); button1.setForeground(new Color(0,0,0));
        label.setForeground(new Color(0,0,0));

        contentPane.add(button1);
        contentPane.add(field);
        contentPane.add(label);


        layout.putConstraint(SpringLayout.NORTH, field, 65, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, field, 145, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 25, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, label, 165, SpringLayout.WEST, contentPane);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setVisible(false);
            }
        });


        name.setVisible(true);

        return name;
    }
}
