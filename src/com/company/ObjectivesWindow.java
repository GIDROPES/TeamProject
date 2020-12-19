package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ObjectivesWindow {
    private String objectives[] = {};
    private JList objlist = new JList(objectives);
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

        JButton buttonAdd = new JButton("+ ADD");
        buttonAdd.setOpaque(false);
        buttonAdd.setContentAreaFilled(false);
        buttonAdd.setForeground(new Color(255,255,255));

        JScrollPane objscroll = new JScrollPane(objlist);
        objscroll.setPreferredSize(new Dimension(100, 100));


        layout.putConstraint(SpringLayout.EAST, buttonAdd, -90, SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonAdd, 20, SpringLayout.NORTH, contentPane);

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int j = objectives.length;
                objectives[j+1] = "input";
            }
        });

        contentPane.add(objlist);
        contentPane.add(objscroll);
        contentPane.add(buttonAdd);
        obwin.setContentPane(contentPane);
        obwin.setVisible(true);
        return obwin;
    }
}
