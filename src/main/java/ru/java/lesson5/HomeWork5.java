package ru.java.lesson5;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    2. Конструктор класса должен заполнять эти поля при создании объекта.
    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    */

        // 4. Создать массив из 5 сотрудников.

        Employee[] emplArr = new Employee[5];

        emplArr[0] = new Employee("Бородач Александр Родионович", "Президент", "borodach@mail.ru",
                "88002000600", 100000.5f, 48);
        emplArr[1] = new Employee("Васильев Пётр Петрович", "Директор", "vasilev@mail.ru",
                "89005553388", 50000, 38);
        emplArr[2] = new Employee("Грозный Иван Васильевич", "Слесарь", "grozniy@mail.ru",
                "89033284479", 40000, 53);
        emplArr[3] = new Employee("Абдукадыров Абдукадыр Абдукадырович", "Плотник",
                "abdukadirovaa@mail.ru", "89553284422", 30000, 41);
        emplArr[4] = new Employee("Червякова Анжела Петровна", "Техничка", "chervap@mail.ru",
                "89279991241", 25000.35f, 35);


        // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < emplArr.length; i++) {
            if (emplArr[i].getAge() >= 40) {
                emplArr[i].info();
            }

        }
    }

}
