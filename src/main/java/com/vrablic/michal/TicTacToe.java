package com.vrablic.michal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {

    public static void Game() {
        JFrame frame = new JFrame("");
        frame.setLayout(new GridLayout(3, 3));
        frame.setVisible(true);


        JButton[] buttons = new JButton[9]; // Create an array of buttons

        final int[] move = {0};

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            final int buttonID = i; // Associate an ID with each button

            buttons[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    //System.out.println("Button ID: " + buttonID);
                    if(move[0] == 1){
                        buttons[buttonID].setText("X");
                        move[0] = 0;
                    } else if (move[0] == 0) {
                        buttons[buttonID].setText("O");
                        move[0] = 1;
                    }
                    buttons[buttonID].setEnabled(false);
                    gameControl();
                }
                public void gameControl(){
                    for (int i = 0; i < buttons.length; i++) {
                        if (buttons[i].getText().equalsIgnoreCase("X") && buttons[i+3].getText().equalsIgnoreCase("X") && buttons[i+6].getText().equalsIgnoreCase("X")){
                            System.out.println("X won");
                            frame.dispose();
                        } else if (buttons[i].getText().equalsIgnoreCase("X") && buttons[i+3].getText().equalsIgnoreCase("X") && buttons[i+6].getText().equalsIgnoreCase("X")) {
                            System.out.println("O won");
                            frame.dispose();
                        }
                    }
                }
            });

            frame.add(buttons[i]);
        }





        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}