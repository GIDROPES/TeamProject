package com.company;

import javax.swing.*;
import java.awt.*;

public class ActivitiesQuestion {
    public static JFrame getActivitiesQuestion(){

        JFrame activitiesframe = new JFrame();
        activitiesframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        activitiesframe.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        Container contentPane = activitiesframe.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        activitiesframe.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);

        JButton button8 = new JButton("Back");
        JButton button9 = new JButton("Next");

        layout.putConstraint(SpringLayout.SOUTH, button8, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button8, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.SOUTH, button9, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.EAST, button9, -10, SpringLayout.EAST, contentPane);

        Dimension buttonSize = new Dimension(160,40);
        button8.setPreferredSize(buttonSize);         // кнопочки
        button9.setPreferredSize(buttonSize);

        button8.setFont(font1);
        button9.setFont(font1);

        JLabel background = new JLabel(new ImageIcon("C:\\Users\\MagicBook\\Desktop\\XmPSDbJ"));

        button8.setBackground(colorback); button8.setForeground(new Color(255,255,255)); // размеры кнопочек
        button9.setBackground(colorback); button9.setForeground(new Color(255,255,255));


        contentPane.add(button8);
        contentPane.add(button9);





        activitiesframe.setVisible(true);

        return activitiesframe;
    }
}
