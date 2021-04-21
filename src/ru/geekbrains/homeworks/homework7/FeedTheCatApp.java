package ru.geekbrains.homeworks.homework7;

import java.lang.reflect.Array;
import java.util.Scanner;

import static ru.geekbrains.homeworks.homework3.chekout3.scan;

public class FeedTheCatApp {
    public static void main(String[] args) {

        Plate plate1 = new Plate(50);
        plate1.info();


        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Vaska", 10, false);
        catArray[1] = new Cat("Murzik", 20, false);
        catArray[2] = new Cat("BEHEMOTH", 30, false);

        for (int i =0; i < catArray.length; i++) {
            catArray[i].eat(plate1);

        }
        for (int i =0; i < catArray.length; i++) {
            catArray[i].packWellfed();
        }
        plate1.info();

        plate1.fillThePlate();

    }

}
