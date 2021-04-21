package ru.geekbrains.homeworks.homework6;

public class Dog extends Animal {
    private static final int MAX_RUN = 500;
    private static final int MAX_SWIM = 10;

    private int age;
    private boolean isGoodBoy;

    public static int dogCount = 0;
    public static int goodBoysCount = 0;


    public Dog(String name, String color, int age, boolean isGoodBoy) {
        super(name, color);
        this.age = age;
        this.isGoodBoy = isGoodBoy;

        if (isGoodBoy == true) {
            goodBoysCount++;
        }
        dogCount++;
    }

    public void info () {
        System.out.printf("\n Пес: %s \n Цвет: %s \n Возраст: %d \n Хороший мальчик: ", name, color, age);
        if (isGoodBoy == true) {
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
        if (b > MAX_SWIM) {
            System.out.println(this.name + " пытался проплыть " + b + " метров, но устал после " + MAX_SWIM + " и утонул.");
        } else if (b < 0) {
            System.out.println("В воде нарушение пространственно временного континуума не работает, поэтому " + this.name + " никуда не поплывет.");
        } else
            System.out.println(this.name + " проплыл " + b + " метров.");
    }

}
