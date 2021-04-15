package ru.geekbrains.homeworks.homework5;

import static java.awt.SystemColor.info;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Dvornik", "dvor@mail.gru", 401224, 32);


        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Sergey Viktorovich", "Owner", "SerVik85@mail.gru", 360000, 44);
        empArray[1] = new Employee("Petya", "Zavhoz", "hoz@mail.gru", 368164, 54);
        empArray[2] = new Employee("Nastya", "Sovetnik", "kisylya99@mail.gru", 187654, 20);
        empArray[3] = new Employee("Nasim", "Saler", "thebestofthebest@mail.gru", 333555, 29);
        empArray[4] = new Employee("Neo", "ITGOD", "kolyanzzz@mail.gru", 324545, 41);

        isOlder(empArray, 40);


    }

    public static void isOlder(Employee[] empArray, int j) {
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age >= j) {
                empArray[i].info();

            }
        }
    }
}
