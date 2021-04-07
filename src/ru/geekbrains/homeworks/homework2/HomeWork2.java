package ru.geekbrains.homeworks.homework2;

public class HomeWork2 {

    public static void main(String[] args) {

        chekSum(5, 8);
//        Код в строке ниже написан исключительно для проверки работы метода,
//        но не требуется в рамках домашнего задания, может быть раскомментирован,
//        в этом случае код выше данного комментария будет излишним,
//        так как параметры будут передаваться в строке кода ниже комментария.
//        Подобные части кода далее будут для краткости обозначаться, как проверочные.

//        System.out.println(chekSum(5, 8));

        ifPositive(-1);

        isNegativeBln(0);
//        Код в строке ниже проверочный
//        System.out.println(isNegativeBln(0));

        printMultiple("Человек, в глазах кошки, является передвижным диванчиком", 2);

        isLeapYear(2021);
//        Код в строке ниже проверочный
//        System.out.println(isLeapYear(2021));
    }

    public static boolean chekSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


    public static void ifPositive(int c) {
        if (c >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательно число");
        }
    }

    public static boolean isNegativeBln(int d) {
        int g = d;
        return g < 0;
    }

    public static void printMultiple(String s, int x) {
        for (int t = 0; t < x; t++) {
            System.out.println(s);
        }
    }

    public static boolean isLeapYear(int y) {
        if (y % 400 == 0) {
            return true;
        } else if (y % 100 == 0) {
            return false;
        } else return y % 4 == 0;

    }

}
