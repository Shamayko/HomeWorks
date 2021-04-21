package ru.geekbrains.homeworks.homework6;

public class Animal {

    public String name;
    public String color;
    public static int animalCount = 0;

    public Animal() {

    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        animalCount++;
    }

}
