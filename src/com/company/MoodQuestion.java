package com.company;

import javax.swing.*;
import java.awt.*;

public class MoodQuestion {
    public static JFrame getMoodQuestion(){

        JFrame moodframe = new JFrame();
        moodframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        moodframe.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);


        Container contentPane = moodframe.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        Color buttColor = new Color(47, 79, 79);

        moodframe.setVisible(true);
        return moodframe;
    }
}
