package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ObjectivesWindow<objectives> {

    static int iter = 0;

    public static String[] objectives = new String[1];
    DefaultListModel<String> model = new DefaultListModel<>();
    JList<String> objlist = new JList<>( model );


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

        objlist.setOpaque(false);
        objlist.setForeground(new Color(0,0,0));
        objlist.setPreferredSize(new Dimension(500,200));


        layout.putConstraint(SpringLayout.EAST, buttonAdd, -90, SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonAdd, 20, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.EAST, objlist, -20, SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, objlist, 40, SpringLayout.NORTH, buttonAdd);

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ObjectivesWindow textwindow = new ObjectivesWindow();
                textwindow.getMiniField();
                for ( int i = 0; i < objectives.length; i++ ){
                   // model.addElement(objectives[i]);
                    //objectives[i] = null;
                }
            }
        });



        contentPane.add(objlist);
        contentPane.add(objscroll);
        contentPane.add(buttonAdd);
        obwin.setContentPane(contentPane);
        obwin.setVisible(true);
        return obwin;
    }






    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //МИКРООКОШЕЧКО С ПОЛЕМ ВВОДА




    public JFrame getMiniField(){
        JFrame miniField = new JFrame("Enter new objective");   //Создание окна, размеры и все дела
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        miniField.setBounds(dimension.width/2 - 200, dimension.height/2 - 100, 400,200);

        BackgroundPanel contentPane = new BackgroundPanel();      //НАША ПАНЕЛЬКА С ФОНОМ В ВИДЕ КАРТИНКИ
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(400,200));

        contentPane.setFilePath("src/Backgrounds/MiniChoiceBack.png");

        JTextField textField = new JTextField("Your obj here");
        textField.setPreferredSize(new Dimension(350, 25));
        textField.setBackground(new Color(200,200,200));

        layout.putConstraint(SpringLayout.WEST, textField, 23, SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH, textField, 33, SpringLayout.NORTH,contentPane);

        JButton buttonOk = new JButton("Ok");
        buttonOk.setBackground(new Color(255,255,255));
        buttonOk.setForeground(new Color(0,0,0));
        buttonOk.setPreferredSize(new Dimension(50,25));

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, buttonOk, 0, SpringLayout.HORIZONTAL_CENTER,contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonOk, 23, SpringLayout.SOUTH,textField);


        buttonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (iter==0){
                    objectives[iter] = textField.getText();
                    model.addElement(objectives[iter]);
                    objectives[iter] = null;
                    iter++;
                    break;
                }
                iter--;
                miniField.setVisible(false);
            }
        });


        contentPane.add(buttonOk);
        contentPane.add(textField);
        miniField.setContentPane(contentPane);
        miniField.setVisible(true);
        return miniField;
    }

}
