package ru.java.lesson6;

import ru.java.lesson6.Animals.Animals;
import ru.java.lesson6.Animals.Cat;
import ru.java.lesson6.Animals.Dog;

//    1. Создать классы Собака и Кот с наследованием от класса Животное.
//    2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
//    препятствия. Результатом выполнения действия будет печать в консоль. (Например,
//    dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
//    кот не умеет плавать, собака 10 м.).
//    4. * Добавить подсчет созданных котов, собак и животных.
public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Pushok");
        Cat cat2 = new Cat("Barsik");
        Dog dog = new Dog("Bobik");
        cat.run(200);
        cat2.run(200);
        dog.run(-5);
        cat.swim(50);
        dog.swim(8);
        System.out.println();
        System.out.println("Котов создано: " + Cat.getCatCount());
        System.out.println("Собак создано: " + Dog.getDogCount());
        // ХЗ как добавить подсчёт животных. Написал самый простой вариант.
        int a = Cat.getCatCount();
        int b = Dog.getDogCount();
        System.out.println("Животных создано: " + (a + b));

    }
}
