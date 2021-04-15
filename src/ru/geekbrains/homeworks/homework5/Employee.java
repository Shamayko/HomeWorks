package ru.geekbrains.homeworks.homework5;

public class Employee {
    String name;
    String position;
    String email;
    int phone;
    int age;


    public Employee(String name, String position, String email, int phone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }



    public void info () {
System.out.printf ("Name: %s\n Position: %s\n email: %s\n phone %d\n age: %d\n \n", name, position, email, phone, age);


    }

}
