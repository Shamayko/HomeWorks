package ru.geekbrains.homeworks.homework8;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyApp extends JFrame {
    /**
     * Создаем переменные для внесения информации о том,
     * что выбрал компьютер, и кто выиграл,
     * а также счетчики побед игрока и компьютера.
     */

    static String b = new String();
    static String win = "";
    static int playerWins;
    static int compWins;


    /**
     * Задаем название окна, операцию на закрытие,
     * Границы окна
      */

    MyApp() {
        setTitle("Камень, Ножницы, Бумага");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 370, 400);
        setLayout(null);


        /**
         * Создаем надписи, о том что выбрал игрок, что компьютер, кто выиграл и какой счет.
         * Создаем кнопки Камня, Ножниц и Бумаги соответственно
         */

        JLabel label1 = new JLabel("Давай сыграем в игру! \n");
        label1.setBounds(20, 20, 300, 32);
        JLabel label2 = new JLabel("Вы выбрали: \n");
        label2.setBounds(20, 40, 300, 32);
        JLabel label3 = new JLabel("Компьютер выбрал: \n" + b);
        label3.setBounds(20, 60, 300, 32);
        JLabel label4 = new JLabel(" \n");
        label4.setBounds(20, 80, 300, 32);
        JLabel label5 = new JLabel("Счет (Игрок / Компьютер): " + playerWins + " / " + compWins);
        label5.setBounds(20, 100, 300, 32);
        JButton button1 = new JButton("Камень");
        button1.setBounds(30, 300, 80, 30);
        JButton button2 = new JButton("Ножницы");
        button2.setBounds(130, 300, 90, 30);
        JButton button3 = new JButton("Бумага");
        button3.setBounds(240, 300, 80, 30);

        /**
         * Добавляем кнопки и надписи
         */

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(button1);
        add(button2);
        add(button3);


        /**
         * Создаем активных слушателей на кнопки, адресуем их на методд play.
         * Обновляем в лейблах информацию о том, что выбрал игрок и компьютер, кто выиграл и счет.
         */

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent c) {
                play(1);
                label2.setText("Вы выбрали: Камень!");
                label3.setText("Компьютер выбрал: " + b);
                label4.setText(win);
                label5.setText("Счет (Игрок / Компьютер): " + playerWins + " / " + compWins);

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent d) {
                play(2);
                label2.setText("Вы выбрали: Ножницы!");
                label3.setText("Компьютер выбрал: " + b);
                label4.setText(win);
                label5.setText("Счет (Игрок / Компьютер): " + playerWins + " / " + compWins);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play(3);
                label2.setText("Вы выбрали: Бумагу!");
                label3.setText("Компьютер выбрал: " + b);
                label4.setText(win);
                label5.setText("Счет (Игрок / Компьютер): " + playerWins + " / " + compWins);

            }
        });


        setVisible(true);
    }


    public static void main(String[] args) {
        new MyApp();
    }


    /**
     * Создаем метод play, принимающий на входе выбор игрока в виде int,
     * затем с помощью рандома генерируем выбор компьютера в диапазоне от 1 до 3 включительно.
     * Передаем выбор компьютера в переменную b, из которой позднее он будет выведен.
     * Для каждого выбора компьютера закладываем 3 возможных сценария выбора игрока с помощью switch case.
     * В зависимости от выбора игрока и компьютера передаем в слушателей соответствующие данные.
     *
     * @param playerChoice
     */
    private void play(int playerChoice) {
        Random random = new Random();
        int i = (random.nextInt(3) + 1);
           if (i == 1) {
            b = "Камень";
            switch (playerChoice) {
                case 1:
                    win = "Ничья";
                    break;
                case 2:
                    win = "Выиграл компьютер :-(";
                    compWins++;
                    break;
                case 3:
                    win = "Вы выиграли! :-)";
                    playerWins++;
                    break;
            }
        } else
        if (i == 2) {
            b = "Ножницы";
            switch (playerChoice) {
                case 1:
                    win = "Вы выиграли! :-)";
                    playerWins++;
                    break;
                case 2:
                    win = "Ничья";
                    break;
                case 3:
                    win = "Выиграл компьютер :-(";
                    compWins++;
                    break;
            }
        } else
            if (i == 3) {
                b = "Бумагу";
                switch (playerChoice) {
                    case 1:
                        win = "Выиграл компьютер :-(";
                        compWins++;
                        break;
                    case 2:
                        win = "Вы выиграли! :-)";
                        playerWins++;
                        break;
                    case 3:
                        win = "Ничья";
                        break;
                }
            }
        }
    }
