package ru.java.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        //print1DArray(10, 11);
        //System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(array));

        arrayShift(array, 2);
        System.out.println(Arrays.toString(array));
/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

/*
2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
значениями 1 2 3 4 5 6 7 8 … 100;
 */
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
/*
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
умножить на 2;
 */
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        }
/*
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
(можно только одну из диагоналей, если обе сложно). Определить элементы одной из
диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
[1][1], [2][2], …, [n][n];
 */
        int[][] arr3 = new int[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == j || i == 10 - j) {
                    arr3[i][j] = 1;
                }
            }
        }
        /*
        this cycle prints the result of the fourth task
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        */


        //System.out.println(Arrays.toString(arr)); // prints the result of the first task
        //System.out.println(Arrays.toString(arr1)); // prints the result of the second task
        //System.out.println(Arrays.toString(arr2)); // prints the result of the third task
    }

    /*
    5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
    одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static void print1DArray(int len, int initialValue) {

        // инициализация и наполнение списка
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array)); // prints the result of the fifth task

        /*
        6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы
        */

        int[] arr4 = {-10, -25, -3, -7, -125, -15, -70, -48, -3273};
        int maxValue = arr4[0];
        int minValue = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] > maxValue) {
                maxValue = arr4[i];
            }
            if (arr4[i] < minValue) {
                minValue = arr4[i];
            }

        }
        // prints the result of the sixth task
        System.out.println("Максимальное значение массива = " + maxValue);
        System.out.println("Минимальное значение массива = " + minValue);

    }

    /*
    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
    массива равны.
    Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     */
    public static boolean checkBalance(int[] in) {
        int sumLeft = 0;
        int sum = 0;
        int count = 0;
        // вычисляю сумму элементов массива
        for (int i = 0; i < in.length; i++) {
            sum += in[i];
        }
        // поочерёдно прибавляя к первому элементу массива последующие, проверяю, равна ли сумма левых
        // элементов массива сумме оставшихся правых элементов массива.
        for (int i = 0; i < in.length; i++) {
            sumLeft += in[i];
            int sumRight = sum - sumLeft;
            // если в массиве есть место, в котором сумма левой и правой части
            // массива равны, увеличиваю счетчик на 1
            if (sumLeft == sumRight) {
                count++;
            }
        }
        return count > 0;
    }

    /*
8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть
положительным, или отрицательным), при этом метод должен сместить все элементы массива
на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
выбирать сами
 */



    private static void arrayShift(int[] array, int n) {


        if (n < 0) {
            n += array.length;
        }
        for (int i = 0; i < n; i++) {
            int element = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = element;

        }

    }

}