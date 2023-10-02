package ru.java.lesson8;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow(){
        setTitle("Test Window");
        setBounds(300, 300, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(20,20,120,32);
        add(textField);

        JButton button = new JButton("Hello!!!");
        button.setBounds(20,60,120,32);
        add(button);


//        JButton button1 = new JButton("Click Me!");
//        JButton button2 = new JButton("Click Me To!");
//
//        add(button1, BorderLayout.NORTH);
//        add(button2, BorderLayout.SOUTH);

        setVisible(true);
    }
}
