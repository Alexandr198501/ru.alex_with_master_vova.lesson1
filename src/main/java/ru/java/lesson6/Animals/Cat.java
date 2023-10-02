package ru.java.lesson6.Animals;

public class Cat extends Animals {
    static int catCount = 0;
    private final int MAX_RUN_DISTANCE = 200;

    public Cat() {
        catCount++;
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE && distance >= 0) {
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
