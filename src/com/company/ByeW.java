package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ByeW {
    public static JFrame getByeW(){

        JFrame BW = new JFrame();

        BW.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        BW.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        contentPane.setFilePath("src/com/company/HelloBackground.png");

        Color colorback = new Color(0, 128, 128);
        BW.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 20);


        JButton button1 = new JButton("BEGIN");

        layout.putConstraint(SpringLayout.NORTH, button1, 300, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 360, SpringLayout.WEST, contentPane);

        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setForeground(new Color(255,255,255));

        Dimension buttonSize = new Dimension(260,120);

        button1.setPreferredSize(buttonSize);

        button1.setFont(font1);


        JLabel label = new JLabel("Thank you, Your answers were accepted");
        JLabel label1 = new JLabel("Enjoy your time!");


        label.setFont(font2);
        label1.setFont(font2);


        label.setForeground(new Color(255,255,255));
        label1.setForeground(new Color(255,255,255));



        contentPane.add(label);
        contentPane.add(label1);
        contentPane.add(button1);


        layout.putConstraint(SpringLayout.WEST , label, 300,               // размещаем тексты и др. хурму
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 100,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , label1, 420,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label1, 200,
                SpringLayout.NORTH, contentPane);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrintWriter writer = null;
                try {
                    writer = new PrintWriter("src/Data/Avatar.txt");
                } catch (FileNotFoundException o) {
                    // TODO Auto-generated catch block
                    o.printStackTrace();
                }

                writer.print("Cat");
                writer.flush();
                writer.close();

                GreetingWindow gw = new GreetingWindow();
                gw.getGreetingWindow();
                BW.setVisible(false);
            }
        });




        BW.setContentPane(contentPane);
        BW.setVisible(true);

        return BW;
    }
}
