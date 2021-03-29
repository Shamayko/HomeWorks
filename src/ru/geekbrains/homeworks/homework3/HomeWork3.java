package ru.geekbrains.homeworks.homework3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

        /**Задача 1
         * Меняем 0 на 1 и наоборот.
         * Здесь и далее вывод в консоль
         * в конце задачи закоментирован т.к.
         * не требуется согласно ДЗ и добавлен для удобства
         * проверки преподавателя (наверное, но это не точно).
         */

        int[] arr = {1, 0, 0, 1};

        {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else arr[i] = 1;
            }
        }
//        System.out.println(Arrays.toString(arr));


        /**
         * Задача 2
         * Заполняем массив длинной в 100
         * значениями от 1 до 100
         */
        int[] arr2 = new int[100];
        {
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = i + 1;
            }
        }

//         System.out.println(Arrays.toString(arr2));


        /**
         * Задача 3
         * Умножаем значение массива на 2, если оно меньше 6
         */
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        {
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) {
                    arr3[i] *= 2;
                }
            }
        }


//         System.out.println(Arrays.toString(arr3));


/**
 * Задача 4
 * Вышиваем крестиком )))
 */
        int[][] table = new int[5][5];
        {
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[i].length; j++) {
                    if (table[i] == table[j]) {
                        System.out.print(1);
                    } else if (i + j == 4) {
                        System.out.print(1);
                    } else

                        System.out.print(table[i][j]);
                }
//                        строка ниже для проверки консолью
                System.out.println();
            }
        }


/**
 * Задача 5
 * Массив заданной длины и фиксированного содержания переменных
 */

        createArr(3, 8);


//        код ниже не требуется согласно ДЗ,
//        можно раскоментировать для проверки консолью
//        String intArrayString = Arrays.toString(createArr(3,8));
//        System.out.println(intArrayString);

        balanceOfArray(new int[]{8, 2, 10, 20});
        moveNumArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, -3);
        minAndMax(new int[]{18, 5000, -10, 23, 8});

    }

    public static int[] createArr(int len, int initialValue) {
        int[] newArr = new int[len];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = initialValue;
        }
        return newArr;
    }


    /**
     * Задача 6
     * минимум и максимум в массиве
     */


    public static void minAndMax(int[] mmarr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mmarr.length; i++) {
            if (mmarr[i] < min) {
                min = mmarr[i];
            }
            if (mmarr[i] > max) {
                max = mmarr[i];
            }
        }
//        код ниже для проверки консолью
//        System.out.println(min);
//        System.out.println(max);

    }


    /**
     * Задача 7
     * Равенство правой и левой частей массива
     * Вызов метода в мэйне выше
     *
     * @param sarr
     * @return
     */

    public static boolean balanceOfArray(int[] sarr) {
        int sum = 0;
        for (int i = 0; i < sarr.length; i++) {
            sum = sum + sarr[i];
        }
        int chek = 0;
        for (int i = 0; i < sarr.length; i++) {
            chek = chek + sarr[i];
            if (chek == sum - chek) {

                System.out.println("True");
                return true;
            }
        }

        System.out.println("False");
        return false;

    }

    /**
     * Задача 8
     * Двигаем содержимое массива вправо или влево
     * Вызов метода в мейне выше.
     *
     * @param arr - название массива, в котором двигаем
     * @param n - положительное и отрицательное значение движения
     */

    public static void moveNumArr(int[] arr, int n) {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp;
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        for (int i = 0; i > n; i--) {
            for (int j = arr.length -1; j > 0; j--) {
                int temp;
                temp = arr[j];
                arr[j] = arr[j -1];
                arr[j - 1] = temp;
            }
        }
//        Код ниже для проверки консолью

        System.out.println(Arrays.toString(arr));
    }

}