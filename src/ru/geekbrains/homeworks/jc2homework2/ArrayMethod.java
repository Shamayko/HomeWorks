package ru.geekbrains.homeworks.jc2homework2;

public class ArrayMethod {

    public ArrayMethod(String[][] strings) {
    }

    public static void arrayMethod(String array[][]) {
        try {
            array = new String[4][4];
        } catch (MyArraySizeException e) {
            System.out.println("Попытка создать массив не предусмотренных размеров.");
        }
        int arraySum = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    arraySum += Integer.parseInt(array[i][j]);
                }

            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(arraySum);
        }

    }

}





