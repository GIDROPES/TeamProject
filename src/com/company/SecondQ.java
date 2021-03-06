package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondQ {
    public static JFrame getSecondQ(){
        JFrame SQ = new JFrame();

        SQ.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        SQ.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        contentPane.setFilePath("src/com/company/HelloBackground.png");

        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        SQ.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 20);


        JButton button1 = new JButton("Next");
        JButton button2 = new JButton("Back");

        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.EAST, button1, -10, SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.SOUTH, button2, -10, SpringLayout.SOUTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, button2, 10, SpringLayout.WEST, contentPane);


        Dimension buttonSize = new Dimension(160,40);

        // кнопочки
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);

        button1.setFont(font1);
        button2.setFont(font1);

        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setForeground(new Color(255,255,255));

        button2.setOpaque(false);
        button2.setContentAreaFilled(false);
        button2.setForeground(new Color(255,255,255));


        JLabel label = new JLabel("Enter your age"); // тексты
        JLabel label1 = new JLabel("In the format: Day/Month/Year");
        JLabel label2 = new JLabel("(Example: 01.01.2001)");

        label.setForeground(new Color(255,255,255));
        label1.setForeground(new Color(255,255,255));
        label2.setForeground(new Color(255,255,255));

        label.setFont(font2);
        label1.setFont(font2);
        label2.setFont(font2);


        JTextField field = new JTextField();                 // Добавили панель для ввода

        field.setPreferredSize(new Dimension(300,40));

        field.setFont(font2);


        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(label);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(field);


        layout.putConstraint(SpringLayout.WEST , label, 400,               // размещаем тексты и др. хурму
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 100,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , label1, 330,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label1, 140,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , label2, 364,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label2, 180,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , field, 350,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, field, 350,
                SpringLayout.NORTH, contentPane);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstQ FirstQ = new FirstQ();
                FirstQ.getFirstQ();
                SQ.setVisible(false);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ByeW ByeW = new ByeW();
                ByeW.getByeW();
                SQ.setVisible(false);
            }
        });

        SQ.setContentPane(contentPane);
        SQ.setVisible(true);

        return SQ;

    }

}


