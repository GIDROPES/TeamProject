package com.activities;

import com.company.BackgroundPanel;
import com.company.UserMood;

import javax.swing.*;
import java.awt.*;

public class Drawing extends UserMood {

    public static JFrame getDrawingWindow(){
        JFrame drawingW = new JFrame();               // настройки
        drawingW.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        drawingW.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        return drawingW;
    }

}
