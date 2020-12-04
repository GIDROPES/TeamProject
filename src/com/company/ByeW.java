package com.company;

import javax.swing.*;
import java.awt.*;

public class ByeW {
    public static JFrame getByeW(){

        JFrame BW = new JFrame();

        BW.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        BW.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        Container contentPane = BW.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        BW.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 20);


        JButton button14 = new JButton("BEGIN");

        layout.putConstraint(SpringLayout.NORTH, button14, 300, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button14, 360, SpringLayout.WEST, contentPane);

        button14.setBackground(colorback); button14.setForeground(new Color(255,255,255));

        Dimension buttonSize = new Dimension(260,120);

        button14.setPreferredSize(buttonSize);

        button14.setFont(font1);


        JLabel label = new JLabel("Thank you, Your answers were accepted");
        JLabel label1 = new JLabel("Enjoy your time!");


        label.setFont(font2);
        label1.setFont(font2);



        contentPane.add(label);
        contentPane.add(label1);
        contentPane.add(button14);


        layout.putConstraint(SpringLayout.WEST , label, 300,               // размещаем тексты и др. хурму
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 100,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , label1, 420,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label1, 200,
                SpringLayout.NORTH, contentPane);






        BW.setVisible(true);

        return BW;
    }
}
