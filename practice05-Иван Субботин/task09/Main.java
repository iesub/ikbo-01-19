package ru.mirea.practice05.task09;

//a-нули
//b-единицы

public class Main {
    public static int recursion(int a, int b) {
        // Базовый случай
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
    public static void main(String[] args) {
        System.out.println(recursion(2, 2)); // вызов рекурсивной функции
    }
}
