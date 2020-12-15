package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Avatar {
    public static JFrame getAvatar(){

        JFrame ava = new JFrame();

        ava.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        ava.setBounds(dimension.width / 2 - 200, dimension.height / 2 - 100, 450, 200);

        Container contentPane = ava.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(450, 200));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        ava.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 18);

        JButton button1 = new JButton("OK");
        JButton button2 = new JButton("Choose an avatar");

        layout.putConstraint(SpringLayout.NORTH, button1, 110, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 140, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button2, 25, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button2, 120, SpringLayout.WEST, contentPane);

        Dimension buttonSize = new Dimension(160,40);
        Dimension buttonSize1 = new Dimension(200, 60);

        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize1);

        button1.setFont(font1);
        button2.setFont(font2);

        button1.setBackground(new Color(255,255,255,0)); button1.setForeground(new Color(0,0,0));
        button2.setBackground(new Color(255,255,255,0)); button2.setForeground(new Color(0,0,0));

        contentPane.add(button1);
        contentPane.add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ava.setVisible(false);
            }
        });

        ava.setVisible(true);

        return ava;
    }
}
