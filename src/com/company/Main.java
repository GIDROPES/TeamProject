package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FirstQ firstQ = new FirstQ();
        String firstLine = null;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/Data/Name.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        InputStreamReader isr = null;

        try {
            isr = new InputStreamReader(fis,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(isr);

        try {
            firstLine = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(firstLine == null){
            firstQ.getFirstQ();
        }
        if (firstLine != null) {
            GreetingWindow window1 = new GreetingWindow();
            window1.getGreetingWindow();
        }
    }
}