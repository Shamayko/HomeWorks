package ru.geekbrains.homeworks.homework7;

import java.util.Scanner;


public class Plate {
    int food;
    final int PLATE_CAPACITY = 50;

    public Plate(int food) {
        this.food = food;
    }
    public int getFood () {
        return this.food;
    }
    public void setFood (int food) {
        if (food >= 0 && food < PLATE_CAPACITY)
            this.food = food;
    }

    public void info() {
        System.out.println("В тарелке осталось " + food + " еды.");
    }


    /**
     * Наполняем тарелку сканером на указаную величину.
     * Если пытаемся насыпать лишнего - излишки просыпаются на пол,
     * а тарелка наполняется до возможного максимума.
     */

    public void fillThePlate() {
        Scanner scan = new Scanner(System.in);
        int additionFood;
        System.out.println("Пожалуйста, укажите сколько еды вы хотите добавить в тарелку.\n" +
                "Учтите, что вместимость тарелки " + PLATE_CAPACITY + '.');
        info();
        additionFood = scan.nextInt();
        if ((this.food + additionFood) > PLATE_CAPACITY) {
            System.out.println("Вы попытались насыпать в тарелку " + additionFood + " еды");
            System.out.println("Но все не вместилось (мы же вас предупреждали), \n на пол просыпалось "
                    + (additionFood - (PLATE_CAPACITY - food)));
            food = PLATE_CAPACITY;
        } else {
            System.out.println("Вы насыпали в тарелку " + additionFood + " еды.");
        }
        info();
    }
}
