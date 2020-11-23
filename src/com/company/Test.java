package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Test {

    public JFrame getTest(){
        JFrame f1 = new JFrame("TEST");

        try {
            f1.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("XmPSDbJ.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f1.pack();
        f1.setVisible(true);

        return f1;
    }
}
