package ru.java.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println(
                """
                        Orange
                        Banana
                        Apple"""
        );

    }

    public static void checkSumSign() {
        int a = 10, b = 15;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor() {
        int value = 150;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = 7, b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
