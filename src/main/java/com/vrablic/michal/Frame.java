package com.vrablic.michal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {

    public static void TTT(){
        JFrame frame = new JFrame("");
        frame.setLayout(new GridLayout(3,3));
        frame.setVisible(true);

        JButton b1 = makeButton("1", 100 , 100);
        JButton b2 = makeButton("2", 100 , 100);
        JButton b3 = makeButton("3", 100 , 100);
        JButton b4 = makeButton("4", 100 , 100);
        JButton b5 = makeButton("5" , 100 ,100);
        JButton b6 = makeButton("6" , 100 , 100);
        JButton b7 = makeButton("7", 100 , 100);
        JButton b8 = makeButton("8" , 100 ,100);
        JButton b9 = makeButton("9" , 100 , 100);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);



        frame.setSize(800 , 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    private static JButton makeButton(String text, int width, int height){
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(width , height));
        return button;
    }
}
