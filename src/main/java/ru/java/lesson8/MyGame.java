package ru.java.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGame extends JFrame {
    private int count = 0;
    private final int MAX_COUNT = 3;
    private int randomNumber;
    JTextField textField;

    public MyGame() {
        this.randomNumber = (int) (Math.random() * 10) + 1;
        setTitle("Игра: Угадай число!");
        setBounds(500, 300, 600, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.ITALIC, 14);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            buttonsPanel.add(button);
            button.setFont(font);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex);
                }
            });
        }

        JButton restartButton = new JButton("Restart");
        add(restartButton, BorderLayout.EAST);
        restartButton.setFont(font);
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyGame();
            }
        });


        setVisible(true);
    }

    public void tryToAnswer(int answer) {
        if (count == MAX_COUNT) {
            textField.setText("Попытки закончились. Перезапустите игру!");
        } else if (answer == randomNumber) {
            textField.setText("Вы угадали число!!! Загаданное число: " + randomNumber + " Нажмите Restart.");
        } else if (answer > randomNumber) {
            count += 1;
            textField.setText("Не угадали! Число меньше, чем " + answer + ". Осталось попыток: " + (MAX_COUNT - count));
        } else {
            count += 1;
            textField.setText("Не угадали! Число больше, чем " + answer + ". Осталось попыток: " + (MAX_COUNT - count));
        }
    }
}
