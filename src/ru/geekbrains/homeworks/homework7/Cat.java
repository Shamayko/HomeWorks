package ru.geekbrains.homeworks.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean wellfed;

    public Cat(String name, int appetite, boolean wellfed) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate plate) {
        plate.setFood(plate.getFood() - appetite);
        if (appetite > plate.getFood()) {

            System.out.println(this.name + " не хватило еды.");
            this.wellfed = false;
        } else if (this.wellfed == true)
        {
            System.out.println(this.name + " не голоден.");
        }
        else {
            this.wellfed = true;
            System.out.println(this.name + " поел.");
        }

    }


    public void info() {
        System.out.println("Name: " + this.name + "\n Appetite: " + this.appetite + "\n Wellfed: " + this.wellfed);
    }

    public void packWellfed() {
        String s1 = (this.name + " сытый: ");
        String s2 = "Да!";
        String s3 = "Нет.";
        if (this.wellfed == true) {
            System.out.println(s1 + s2);
        } else {
            System.out.println(s1 + s3);
        }

    }
}

