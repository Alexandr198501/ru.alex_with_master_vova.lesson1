package ru.java.lesson4;

/*
1.Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в
методичку.

2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
например, с использованием циклов.

 */


import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    private static Scanner sc;
    private static Random random;
    public static char[][] map;
    public static int DOTS_TO_WIN = 3;
    public static final int SIZE = 3;

    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '_';

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();
        initMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Игрок победил! Игра окончена.");
                break;
            }

            if (isMapFull()) {
                System.out.println("Игра окончена. Ничья!");
                break;
            }
            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("AI победил! Игра окончена.");
                break;
            }

            if (isMapFull()) {
                System.out.println("Игра окончена. Ничья!");
                break;
            }
        }
    }

    // Проверка победы
    public static boolean checkWin(char element) {
        int count_x = 0;
        int count_y = 0;
// ПЕРЕПИСАТЬ!!! СЧИТАЕТ ОБЩЕЕ КОЛ-ВО Х или О НА ПОЛЕ, А НЕ В ОДНОЙ ЛИНИИ!!!
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == 'X') {
                    count_x += 1;
                }
                if (map[i][j] == 'O') {
                    count_y += 1;
                }
            }
            if (count_x == DOTS_TO_WIN || count_y == DOTS_TO_WIN) {
                return true;

            }
        }
        return false;
//        if(map[0][0] == element && map[0][1] == element && map[0][2] == element){
//            return true;
//        }
//        if(map[1][0] == element && map[1][1] == element && map[1][2] == element) {
//            return true;
//        }
//        if(map[2][0] == element && map[2][1] == element && map[2][2] == element) {
//            return true;
//        }
//
//        if(map[0][0] == element && map[1][0] == element && map[2][0] == element){
//            return true;
//        }
//        if(map[0][1] == element && map[1][1] == element && map[2][1] == element){
//            return true;
//        }
//        if(map[0][2] == element && map[1][2] == element && map[2][2] == element){
//            return true;
//        }
//
//        if(map[0][0] == element && map[1][1] == element && map[2][2] == element){
//            return true;
//        }
//        if(map[2][0] == element && map[1][1] == element && map[0][2] == element){
//            return true;
//        }
//        return false;

    }

    // Проверяет остались ли не заполненные ячейки на игровом поле
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }

        }
        return true;
    }

    // Ход бота
    public static void aiTurn() {

        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        System.out.println("Ход бота в клетку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;

    }

    // Ход человека
    public static void playerTurn() {

        int x, y;
        do {
            System.out.println("Введитее координаты хода (X и Y):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[x][y] = DOT_X;

    }

    // Проверяет пуста ли ячейка и не выходят ли введенные координаты за пределы поля
    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[x][y] != DOT_EMPTY) {
            return false;
        }
        return true;
    }

    // Распечатывает игровое поле в консоль
    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Инициализирует игровое поле
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}

