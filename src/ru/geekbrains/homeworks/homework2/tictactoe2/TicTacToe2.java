package ru.geekbrains.homeworks.homework2.tictactoe2;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe2 {

    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final int TREAT2 = 2;
    public static final int TREAT3 = 3;

    public static final char DOT_O = 'O';
    public static final char DOT_X = 'X';
    public static final char EMPTY_DOT = '*';

    public static void createMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }


    public static Scanner scanner = new Scanner(System.in);

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Ход игрока. Пожалуйста введите координаты в формате х (строка) + пробел +  у (столбец)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isValid(x, y));
        map[x][y] = DOT_X;

    }

    public static boolean isValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[x][y] == EMPTY_DOT) {
            return true;
        }
        return false;
    }

    public static Random rd = new Random();

    public static void aiTurn() {
        int x = 0, y = 0, diag = 0, diag2 = 0;

/**
 * Блокируем игрока по диагонали "\"
 */
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_X && i == j) {
                    diag++;
                }
                if (map[i][j] == DOT_O && i == j) {
                    diag--;
                }
            }
        }
        if (diag == TREAT2) {
            System.out.println("FIND!");
            do {
                x = rd.nextInt(SIZE);
                y = x;
            }
            while (!isValid(x, y));
            System.out.println("Компьютер походил в поле x: " + (x + 1) + " y:" + (y + 1));
            map[x][y] = DOT_O;
            return;
        }


/**
 * Блокируем игрока по диагонали "/"
 */

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_X && (i + j + 1) == SIZE) {
                    diag2++;
                }
                if ((map[i][j] == DOT_O) && (i + j + 1) == SIZE) {
                    diag2--;
                }
            }
        }
        if (diag2 == TREAT2) {
            do {
                x = rd.nextInt(SIZE);
                y = ((SIZE - 1) - x);
            }
            while (!isValid(x, y));
            System.out.println("Компьютер походил в поле x: " + (x + 1) + " y:" + (y + 1));
            map[x][y] = DOT_O;
            return;
        }

        /**
         * Блокируем игрока по горизонтали с максимальным уровнем угрозы 3
         */
        for (int i = 0, hor =0; i < SIZE; i++) {


            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_X) {
                    hor++;
                }
                if (map[i][j] == DOT_O) {
                    hor--;
                }

            }
            if (hor == TREAT3) {
                do {
                    x = i;
                    y = rd.nextInt(SIZE);
                }
                while (!isValid(x, y));
                System.out.println("Компьютер походил в поле x: " + (x + 1) + " y:" + (y + 1));
                map[x][y] = DOT_O;
                return;
            }
        }

        /**
         * Блокируем игрока по вертикали с максимальным уровнем угрозы 3
         */
        for (int i = 0, ver = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == DOT_X) {
                    ver++;
                }
                if (map[j][i] == DOT_O) {
                    ver--;
                }

            }
            if (ver == TREAT3) {
                do {
                    x = rd.nextInt(SIZE);
                    y = i;
                }
                while (!isValid(x, y));
                System.out.println("Компьютер походил в поле x: " + (x + 1) + " y:" + (y + 1));
                map[x][y] = DOT_O;
                return;
            }
        }

        /**
         * Блокируем игрока по горизонтали с уровнем угрозы 2
         */
        for (int i = 0, hor = 0; i < SIZE; i++) {


            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_X) {
                    hor++;
                }
                if (map[i][j] == DOT_O) {
                    hor--;
                }

            }
            if (hor == TREAT2) {
                do {
                    x = i;
                    y = rd.nextInt(SIZE);
                }
                while (!isValid(x, y));
                System.out.println("Компьютер походил в поле x: " + (x + 1) + " y:" + (y + 1));
                map[x][y] = DOT_O;
                return;
            }
        }

        /**
         * Блокируем игрока по вертикали с уровнем угрозы 2
         */
        for (int i = 0, ver = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == DOT_X) {
                    ver++;
                }
                if (map[j][i] == DOT_O) {
                    ver--;
                }

            }
            if (ver == TREAT3) {
                do {
                    x = rd.nextInt(SIZE);
                    y = i;
                }
                while (!isValid(x, y));
                System.out.println("Компьютер походил в поле x: " + (x + 1) + " y:" + (y + 1));
                map[x][y] = DOT_O;
                return;
            }
        }

//
//        /**
//         * Блокируем игрока по горизонтали с уровнем угрозы DOTS_TO_WIN -2
//         */
//        for (int i = 0; i < SIZE; i++) {
//            int k = 0;
//
//            for (int j = 0; j < SIZE; j++) {
//                if (map[i][j] == DOT_X) {
//                    k++;
//                }
//                if (map[i][j] == DOT_O) {
//                    k--;
//                }
//
//            }
//            if (k == DOTS_TO_WIN - 2) {
//                do {
//                    x = i;
//                    y = rd.nextInt(SIZE);
//                }
//                while (!isValid(x, y));
//                System.out.println("Компьютер походил в поле x: " + (x + 1) + " y:" + (y + 1));
//                map[x][y] = DOT_O;
//                return;
//            }
//        }
//
//        /**
//         * Блокируем игрока по вертикали с уровнем угрозы DOTS_TO_WIN -2
//         */
//        for (int i = 0; i < SIZE; i++) {
//            int k = 0;
//
//            for (int j = 0; j < SIZE; j++) {
//                if (map[j][i] == DOT_X) {
//                    k++;
//                }
//                if (map[j][i] == DOT_O) {
//                    k--;
//                }
//
//            }
//            if (k == DOTS_TO_WIN - 2) {
//                do {
//                    x = rd.nextInt(SIZE);
//                    y = i;
//                }
//                while (!isValid(x, y));
//                System.out.println("Компьютер походил в поле x: " + (x + 1) + " y:" + (y + 1));
//                map[x][y] = DOT_O;
//                return;
//            }
//        }
//

        do {
            x = rd.nextInt(SIZE);
            y = rd.nextInt(SIZE);
        }
        while (!isValid(x, y));
        System.out.println("Компьютер походил в поле x: " + (x + 1) + " y:" + (y + 1));
        map[x][y] = DOT_O;
    }

    public static boolean isWin(char symb) {
//Проверяем по горизонтали

        for (int i = 0; i < SIZE; i++) {
            int k = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    k++;
                } else {
                    k = 0;
                }
                if (k == DOTS_TO_WIN || k > DOTS_TO_WIN) {
                    return true;
                }
            }
        }
//Проверяем по вертикали

        for (int i = 0; i < SIZE; i++) {
            int k = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb) {
                    k++;
                } else {
                    k = 0;
                }
                if (k == DOTS_TO_WIN || k > DOTS_TO_WIN) {
                    return true;
                }
            }
        }

//Проверяем по диагонали "\"
        for (int i = 0, k = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb && i == j) {
                    k++;
                } else {
                    if ((map[i][j] == EMPTY_DOT || map[i][j] == DOT_O) && i == j) {
                        k = 0;
                    }
                }
                if (k == DOTS_TO_WIN || k > DOTS_TO_WIN) {
                    return true;
                }
            }
        }

// Проверяем по диагонали "/"

        for (int i = 0, k = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb && (i + j + 1) == SIZE) {
                    k++;
                } else {
                    if ((map[i][j] == EMPTY_DOT || map[i][j] == DOT_O) && (i + j + 1) == SIZE) {
                        k = 0;
                    }
                }
                if (k == DOTS_TO_WIN || k > DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        createMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Поздравляем! Вы подебедили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
            aiTurn();
            printMap();
            if (isWin(DOT_O)) {
                System.out.println("Увы, победил компьютер.");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
        }
        System.out.println("Игра закончена");

    }
}

