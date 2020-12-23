package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class FirstQ {

    public static String[] user_name = new String[1];




    public JFrame getFirstQ(){

        JFrame FQ = new JFrame();
        FQ.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        FQ.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        Container contentPane = FQ.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));
        Color buttColor = new Color(47, 79, 79);
        Color colorback = new Color(0, 128, 128);
        FQ.getContentPane().setBackground(colorback);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 20);


        JButton button1 = new JButton("Next");

        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.EAST, button1, -10, SpringLayout.EAST, contentPane);


        Dimension buttonSize = new Dimension(160,40);

        // кнопочки
        button1.setPreferredSize(buttonSize);

        button1.setFont(font1);


        JLabel label = new JLabel("We invite you to answer a number of questions"); // тексты
        JLabel label1 = new JLabel("What's your name?");

        label.setFont(font2);
        label1.setFont(font2);

        JTextField field = new JTextField();                 // Добавили панель для ввода


        field.setPreferredSize(new Dimension(500,50));     // Указали размеры

        field.setFont(font2);



        button1.setBackground(colorback); button1.setForeground(new Color(255,255,255));


        contentPane.add(button1);
        contentPane.add(label);
        contentPane.add(label1);
        contentPane.add(field);

        layout.putConstraint(SpringLayout.WEST , label, 250,               // размещаем тексты и др. хурму
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 50,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , label1, 370,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label1, 100,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , field, 240,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, field, 350,
                SpringLayout.NORTH, contentPane);



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondQ secondQ = new SecondQ();
                secondQ.getSecondQ();
                FQ.setVisible(false);


                PrintWriter writer = null;
                try {
                    writer = new PrintWriter("src/Data/Name.txt");
                } catch (FileNotFoundException o) {
                    // TODO Auto-generated catch block
                    o.printStackTrace();
                }

                writer.print(field.getText());
                writer.flush();
                writer.close();
            }
        });

        FQ.setVisible(true);


        return FQ;
    }

    public String getFirstSymbol(){
        return user_name[0];
    }

    public File getName(){
        File name = new File("src/Data/Name.txt");
        try {
            name.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader reader;
        return name;
    }
}

