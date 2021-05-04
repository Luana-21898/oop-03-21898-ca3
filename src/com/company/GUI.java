package com.company;

import javax.swing.*;
import java.awt.*;


public class GUI {

//21898 - Luana França
    //https://beginnersbook.com/2015/07/java-swing-tutorial/

    public static void main(String[] args) {

        //creating the frame and setting configurations of the GUI
        LoginGUI frame = new LoginGUI();
        //setting frame objects
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

    }
}