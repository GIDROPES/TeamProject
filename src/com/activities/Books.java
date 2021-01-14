package com.activities;

import com.company.ActivitiesQuestion;
import com.company.BackgroundPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Books extends UserMood {
    String[] randomPhrases = {"So, lets read...", "We recommend to read this","Good choice for your evening","Read this ones:"};

    String[] gmBookName = {"Куриный бульон для души: 101 рождественская история","Стоянка поезда всего минута","Хроники Нарнии (ил. П. Бейнс)",
            "Зов предков. Белый Клык","Тихоня","Обожаю тебя ненавидеть"};

    String[] gmBookCoverPath = {"src/Books/Good/Куриный бульон.png","src/Books/Good/Стоянка поезда.png","src/Books/Good/Хроники нарнии.png",
            "src/Books/Good/Белый клык.png","src/Books/Good/Тихоня.png","src/Books/Good/Обожаю.png",};

    Random random = new Random();

    String book1 = gmBookName[random.nextInt(gmBookName.length)];
    JLabel bookName1 = new JLabel(book1);


    ImageIcon cover1 = new ImageIcon(getIconPath1());
    JLabel coverPic1 = new JLabel(cover1);

    String[] bmBookName = {"Мы же взрослые люди","Плюс жизнь","Искупление","Английский пациент","Узкая дорога на дальний север","Если я останусь","Ветер Тактика"};

    String[] bmBookCoverPath = {"src/Books/Bad/Мы же взрослые люди.png","src/Books/Bad/Плюс жизнь.png","src/Books/Bad/Искупление.png",
            "src/Books/Bad/Английский пациент.png","src/Books/Bad/Узкая дорога.png","src/Books/Bad/Если я останусь.png","src/Books/Bad/Ветер.png"};

    String book2 = bmBookName[random.nextInt(bmBookName.length)];
    JLabel bookName2 = new JLabel(book2);


    ImageIcon cover2 = new ImageIcon(getIconPath2());
    JLabel coverPic2 = new JLabel(cover2);

    public JFrame getBooks(){

        JFrame books = new JFrame();

        books.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        books.setBounds(dimension.width / 2 - 475, dimension.height / 2 - 350, 950, 700);

        BackgroundPanel contentPane = new BackgroundPanel();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setPreferredSize(new Dimension(950, 700));

        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        Font font2 = new Font("Century Gothic", Font.BOLD, 18);

        JButton button1 = new JButton("Back");

        JButton generateButt = new JButton("Generate");

        layout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, contentPane);   //
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, contentPane);

        Random random = new Random();
        JLabel phrase = new JLabel(randomPhrases[random.nextInt(randomPhrases.length)]);
        phrase.setFont(font1);
        phrase.setForeground(Color.black);

        layout.putConstraint(SpringLayout.NORTH, phrase, 50, SpringLayout.NORTH, contentPane);   //
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, phrase, 10, SpringLayout.HORIZONTAL_CENTER, contentPane);

        Dimension buttonSize = new Dimension(160,40);
        Dimension generSize = new Dimension(190, 50);

        button1.setPreferredSize(buttonSize);         // кнопочки размер
        button1.setFont(font1);
        button1.setForeground(new Color(255,255,255)); // размеры кнопочек
        button1.setOpaque(false); button1.setContentAreaFilled(false);

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, generateButt, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.SOUTH, generateButt, -20, SpringLayout.SOUTH, contentPane);

        generateButt.setPreferredSize(generSize);
        generateButt.setFont(font1);
        generateButt.setForeground(Color.white);
        generateButt.setOpaque(false); generateButt.setContentAreaFilled(false);

        contentPane.add(button1);
        contentPane.add(generateButt);

        ImageIcon image = new ImageIcon("src/Data/book_icon.png");
        JLabel icon = new JLabel(image);

        contentPane.add(icon);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActivitiesQuestion ActivitiesQuestion = new ActivitiesQuestion();
                ActivitiesQuestion.getActivitiesQuestion();
                books.setVisible(false);
            }
        });

        generateButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user_mood_is_good) {
                    Books books1 = new Books();
                    books1.setUserMoodGood();
                    books1.getBooks();
                    books.setVisible(false);
                }
                if (!user_mood_is_good){
                    Books books2 = new Books();
                    books2.setUserMoodBad();
                    books2.getBooks();
                    books.setVisible(false);
                }
            }
        });

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, coverPic1, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.SOUTH, coverPic1, -20, SpringLayout.NORTH, bookName1);

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, bookName1, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.SOUTH, bookName1, -20, SpringLayout.NORTH, generateButt);

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, coverPic2, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.SOUTH, coverPic2, -20, SpringLayout.NORTH, bookName2);

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, bookName2, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);   //
        layout.putConstraint(SpringLayout.SOUTH, bookName2, -20, SpringLayout.NORTH, generateButt);

        bookName1.setForeground(new Color(210,210,210));
        bookName1.setFont(font2);

        bookName2.setForeground(new Color(210,210,210));
        bookName2.setFont(font2);

        if (user_mood_is_good) {                                                    //При условии, что настроение пользователя хорошее
            contentPane.setFilePath("src/Backgrounds/GoodMoodBack.png");
            contentPane.add(bookName1);
            contentPane.add(coverPic1);
        }
        else {
            contentPane.setFilePath("src/Backgrounds/BadMoodBack.png");
            phrase.setForeground(Color.black);
            contentPane.add(bookName2);
            contentPane.add(coverPic2);
        }


        books.setContentPane(contentPane);
        books.setVisible(true);

        return books;
    }

    private String getIconPath1(){
        int iter = 0;
        for (int i = 0; i < gmBookName.length; i++){
            if (gmBookName[i].equals(book1))
                iter = i;
        }
        return  gmBookCoverPath[iter];
    }

    private String getIconPath2(){
        int iter = 0;
        for (int i = 0; i < bmBookName.length; i++){
            if (bmBookName[i].equals(book2))
                iter = i;
        }
        return  bmBookCoverPath[iter];
    }
}
