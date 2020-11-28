package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GreetingWindow {

    String GreetingWords[] = {"Hello, are you ok?", "Hey, everything will be fine", "Long time no see", "Glad to see you" };

    public JFrame getGreetingWindow() {
        JFrame GreatingWindow = new JFrame();
        GreatingWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);                //Создание окна, размеры и все дела
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        GreatingWindow.setBounds(dimension.width/2 - 475, dimension.height/2 - 350, 950,700);



        BackgroundPanel contentPane = new BackgroundPanel();      //НАША ПАНЕЛЬКА С ФОНОМ В ВИДЕ КАРТИНКИ
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950,700));


        contentPane.setFilePath("src/com/company/BackEvening.png");  //Использовал собственную функцию для пути фона окна


        //Color colorback = new Color(0, 128, 128);
        //GreatingWindow.getContentPane().setBackground(colorback);
        Random random = new Random(); //Создали объекта класса, чтобы генерировать случайные надписи из массива

        Font font1 = new Font("Century Gothic", Font.BOLD, 20);
        JLabel label = new JLabel(GreetingWords[random.nextInt(GreetingWords.length)], SwingConstants.CENTER); //Генерирует надписи
        label.setForeground(new Color(255,255,255));
        label.setFont(font1);                                           //тут шрифт и цвет

        //Color colorback2 = new Color(135, 206, 235);


        JButton button1 = new JButton();
        button1.setPreferredSize(new Dimension(140, 70));    //Кнопочка далее и её параметры
        button1.setBackground(new Color(255,255,255));
        button1.setForeground(new Color(0,0,0));
        button1.setText(new String("NEXT"));


        Font font2 = new Font("Century Gothic", Font.BOLD, 14);  //Видимо, шрифт для кнопочки, но размером поменьше


        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, label, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, label, 0, SpringLayout.VERTICAL_CENTER, contentPane);

        layout.putConstraint(SpringLayout.SOUTH, button1, 0, SpringLayout.SOUTH, contentPane);
        layout.putConstraint(SpringLayout.EAST, button1, 0, SpringLayout.EAST, contentPane);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button1.isEnabled()) {
                    Menu menu = new Menu();
                    menu.getMenu();
                    GreatingWindow.setVisible(false);
                }
            }
        });



        contentPane.add(button1);
        contentPane.add(label);
        GreatingWindow.setContentPane(contentPane);

        GreatingWindow.setVisible(true);
        GreatingWindow.pack();
        return  GreatingWindow;
    }


}
