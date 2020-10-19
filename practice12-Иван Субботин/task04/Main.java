package ru.mirea.practice12.task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер: ");
        number = sc.nextLine();
        int regNumber = number.length() - 11;
        System.out.println(number.substring(0, regNumber+1) + "(" + number.substring(regNumber+1, regNumber+4) + ")-" +
                number.substring(regNumber+4, regNumber+7) + "-" + number.substring(regNumber+7, regNumber+11));
    }
}
