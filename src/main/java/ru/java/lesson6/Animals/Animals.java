package ru.java.lesson6.Animals;

public abstract class Animals {
    String name;
    int distance;
    static int count;

    public Animals(){
        count++;
    }


    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static void getCount(){
        System.out.println("Животных создано: " + count);
    }


}
