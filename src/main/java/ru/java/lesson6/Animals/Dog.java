package ru.java.lesson6.Animals;

public class Dog extends Animals {
    static int dogCount = 0;
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;

    public Dog() {
        dogCount++;
    }

    public Dog(String name) {
        this();
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE && distance >= 0) {
            System.out.println("Собака " + name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Собака " + name + " не может пробежать дистанцию " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE && distance >= 0) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть дистанцию " + distance + " м.");
        }
    }


    public static int getDogCount() {
        return dogCount;
    }
}
