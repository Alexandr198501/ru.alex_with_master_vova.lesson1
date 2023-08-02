package ru.java.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println(checkSum(5, 50)); // Обернул в sout для наглядности.
        checkNumber(-17);
        System.out.println(checkNumberSign(3)); // Обернул в sout для наглядности.
        printText("test", 3);
        System.out.println(leapYear(2023)); // Обернул в sout для наглядности.

    }
/*
1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
*/

    public static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }


/*
2. Написать метод, которому в качестве параметра передается целое число, метод должен
напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
считаем положительным числом.
 */
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println(number + " положительное число");
        } else {
            System.out.println(number + " отрицательное число");
        }
    }

/*
3. Написать метод, которому в качестве параметра передается целое число. Метод должен
вернуть true, если число отрицательное, и вернуть false если положительное.
 */
    public static boolean checkNumberSign(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }


/*
4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
отпечатать в консоль указанную строку, указанное количество раз;
 */
    public static void printText(String text, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(text);
        }
    }

/*
5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
100-го, при этом каждый 400-й – високосный.
 */
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
