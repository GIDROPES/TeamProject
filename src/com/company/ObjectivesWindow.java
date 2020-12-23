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

        Font font = new Font("Century Gothic", Font.BOLD, 16);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);

        contentPane.setFilePath("src/Backgrounds/TargetBackReal.png");

        JLabel instruction = new JLabel("If you want to create new objective press \"New\".");
        instruction.setForeground(new Color(70,70,70));
        instruction.setFont(font);

        JLabel instructionContinue = new JLabel("You can press \"Add\" to add created objective to panel.");
        instructionContinue.setForeground(new Color(70,70,70));
        instructionContinue.setFont(font);

        JButton buttonAdd = new JButton("+ ADD");
        JButton buttonNew = new JButton("New");

        JButton back_button = new JButton("Back");

        back_button.setOpaque(false); back_button.setContentAreaFilled(false); back_button.setForeground(new Color(255,255,255));
        back_button.setFont(font1);


        buttonAdd.setOpaque(false);
        buttonAdd.setContentAreaFilled(false);
        buttonAdd.setForeground(new Color(255,255,255));

        buttonNew.setOpaque(false);
        buttonNew.setContentAreaFilled(false);
        buttonNew.setForeground(new Color(255,255,255));

        JScrollPane objscroll = new JScrollPane(objlist);
        objscroll.setPreferredSize(new Dimension(100, 100));

        objlist.setOpaque(false);
        objlist.setForeground(new Color(0,0,0));
        objlist.setFont(objlist.getFont().deriveFont(18.0f));

        objscroll.setPreferredSize(new Dimension(400,600));


        layout.putConstraint(SpringLayout.EAST, buttonAdd, -90, SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonAdd, 20, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST, buttonNew, 70, SpringLayout.WEST, objscroll);
        layout.putConstraint(SpringLayout.NORTH, buttonNew, 20, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST, instruction, 70, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, instruction, 0, SpringLayout.NORTH, objscroll);

        layout.putConstraint(SpringLayout.WEST, instructionContinue, 70, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, instructionContinue, 4, SpringLayout.SOUTH, instruction);

        //layout.putConstraint(SpringLayout.EAST, objlist, -20, SpringLayout.EAST, contentPane);
        //layout.putConstraint(SpringLayout.NORTH, objlist, 40, SpringLayout.NORTH, buttonAdd);

        layout.putConstraint(SpringLayout.EAST, objscroll, -20, SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, objscroll, 40, SpringLayout.NORTH, buttonAdd);

        layout.putConstraint(SpringLayout.SOUTH, back_button, -10, SpringLayout.SOUTH, contentPane);   // Кнопка навигации, её положение
        layout.putConstraint(SpringLayout.WEST, back_button, 10, SpringLayout.WEST, contentPane);

        buttonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ObjectivesWindow textwindow = new ObjectivesWindow();
                textwindow.getMiniField();
            }
        });

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for ( int i = 0; i <= objectives.length; i++ ){
                    model.addElement(objectives[iter]);
                    objectives[iter] = null;
                }

            }
        });

        back_button.addActionListener(new ActionListener() {  //переход назад в менюшку
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu Menu = new Menu();
                Menu.getMenu();
                obwin.setVisible(false);

            }
        });

        objscroll.createVerticalScrollBar();
        objscroll.setFont(font);

        contentPane.add(instructionContinue);
        contentPane.add(instruction);
        contentPane.add(objscroll);
        contentPane.add(buttonNew);
        contentPane.add(buttonAdd);
        contentPane.add(back_button);
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

                objectives[iter] = textField.getText();

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
