package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BackgroundPanel extends JPanel {

    String filepath;


   /* @Override
    public void paint(Graphics g) {
        super.paint(g);


    }
*/

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            g.drawImage(ImageIO.read(new File(getFilePath())), 0,0,null);
        }
        catch (IOException e) {
            e.printStackTrace();

        }
    }

    public String getFilePath(){
        return filepath;
    }

    public void setFilePath(String filepath){
        this.filepath = filepath;
    }

}
