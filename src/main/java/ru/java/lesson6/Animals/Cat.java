package ru.java.lesson6.Animals;

public class Cat extends Animals {
    static int catCount;


    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200 && distance >= 0) {
            this.distance = distance;
            System.out.println("Кот " + name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Кот " + name + " не может пробежать дистанцию " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("К сожалению кот " + name + " не умеет плавать.");
    }


    public static int getCatCount() {
        return catCount;
    }
}
