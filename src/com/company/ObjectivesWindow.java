package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ObjectivesWindow {
    private ArrayList<String> objectives = new ArrayList<String>();

    public JFrame getObjectivesWindow(){
        JFrame obwin = new JFrame();
        obwin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);                //Создание окна, размеры и все дела
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        obwin.setBounds(dimension.width/2 - 475, dimension.height/2 - 350, 950,700);



        BackgroundPanel contentPane = new BackgroundPanel();      //НАША ПАНЕЛЬКА С ФОНОМ В ВИДЕ КАРТИНКИ
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950,700));


        contentPane.setFilePath("src/Backgrounds/TargetBackReal.png");

        JButton button = new JButton("+ ADD")



        obwin.setContentPane(contentPane);
        obwin.setVisible(true);
        return obwin;
    }
}
