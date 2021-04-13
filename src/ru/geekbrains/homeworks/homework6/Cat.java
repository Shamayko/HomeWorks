package ru.geekbrains.homeworks.homework6;

public class Cat extends Animal {
    private static final int MAX_RUN = 200;
    private static final int MAX_SWIM = 0;

    private int age;
    private boolean isNice;

    public static int catCount = 0;
    public static int niceCatCount = 0;

    public Cat (String name, String color, int age, boolean isNice) {
        super(name, color);
//        this.name = name;
//        this.color = color;
        this.age = age;
        this.isNice = isNice;

        if (isNice == true) {
            niceCatCount++;
        }
        catCount++;
    }

    public void info () {
        System.out.printf("\n Кот: %s \n Цвет: %s \n Возраст: %d \n Милый: ", name, color, age);
        if (isNice == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }

    public void run (int a) {
        if (a > MAX_RUN) {
            System.out.println(this.name + " пытался пробежать " + a + " метров, но устал после " + MAX_RUN + " и прилег отдохнуть.");
        } else if (a < 0) {
            System.out.println(this.name + " нарушил просранственно временной континуум и пробежал " + a + " метров.");
        } else
            System.out.println(this.name + " пробежал " + a + " метров.");
    }

    public void swim (int b) {
            System.out.println("Котики не умеют плавать, так что не вздумайте кидать их в воду, вам надо, вот вы и плывите свои "
            + b + " метров.");
    }


}
