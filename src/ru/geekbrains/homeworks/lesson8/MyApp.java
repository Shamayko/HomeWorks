package ru.geekbrains.homeworks.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApp extends JFrame {

    MyApp() {
        setTitle("My Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

//        JButton button1 = new JButton("Button 1");
//        JButton button2 = new JButton("Button 2");
//        add(button1, BorderLayout.NORTH);
//        add(button2, BorderLayout.SOUTH);

//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
//        for (int i=1; i < 11; i++) {
//            add(new JButton(String.valueOf(i)));
//        }

//        setLayout(new FlowLayout());
//        for (int i = 1; i < 21; i++) {
//            add(new JButton(String.valueOf(i)));
//        }

//        setLayout(new GridLayout(3, 3));
//        for (int i=1; i < 10; i++) {
//            add(new JButton(String.valueOf(i)));
//        }


        setLayout(null);
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 100, 40);
        add(textField);
        JButton button = new JButton("Cool");
        button.setBounds(20, 60, 100, 40 );
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Realy COOL!");
            }
        });


        setVisible(true);
    }

    public static void main(String[] args) {
        new MyApp();
    }

}
