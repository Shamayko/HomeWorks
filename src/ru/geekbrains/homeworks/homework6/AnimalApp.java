package ru.geekbrains.homeworks.homework6;


import static ru.geekbrains.homeworks.homework6.Animal.animalCount;
import static ru.geekbrains.homeworks.homework6.Cat.catCount;
import static ru.geekbrains.homeworks.homework6.Cat.niceCatCount;
import static ru.geekbrains.homeworks.homework6.Dog.dogCount;
import static ru.geekbrains.homeworks.homework6.Dog.goodBoysCount;

public class AnimalApp {



    public static void main(String[] args) {

Cat cat1 = new Cat("Barsik", "black", 3, false);
Cat cat2 = new Cat ("Feduk", "White", 4, false);
Cat cat3 = new Cat("Murzik", "Dymka", 2, false);
Cat cat4 = new Cat ("Aliska", "Grey", 5, true);
Dog dog1 = new Dog ("Muhtar", "Black", 5, true);
Dog dog2 = new Dog ("Polkan", "Grey", 4, true);
Dog dog3 = new Dog("Rex", "Brawn", 7, true);

        System.out.println("Создано " + animalCount + " животных.");
        System.out.println("Создано " + catCount + " котов.");
        System.out.println("Из них милых котов " + niceCatCount + '.');
        System.out.println("Создано " + dogCount + " собак.");
        System.out.println("Из них хороших мальчиков " + goodBoysCount + '.');

        dog1.info();
        cat3.info();
        dog2.run(-300);
        dog1.swim(30);
        dog3.swim(-10);
        cat2.run(550);
        cat4.swim(8);

    }
}
