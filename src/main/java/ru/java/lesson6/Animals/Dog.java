package ru.java.lesson6.Animals;

public class Dog extends Animals {
    static int dogCount;

    public Dog() {
        dogCount++;
    }

    public Dog(String name) {
        this();
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500 && distance >= 0) {
            this.distance = distance;
            System.out.println("Собака " + name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Собака " + name + " не может пробежать дистанцию " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10 && distance >= 0) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть дистанцию " + distance + " м.");
        }
    }


    public static int getDogCount() {
        return dogCount;
    }
}
