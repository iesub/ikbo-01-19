package ru.mirea.lab01.task04;

import java.util.Arrays;

public class task04 {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = (int) (Math.random() * 50);
        }
        String stringLine = Arrays.toString(list);
        System.out.println(stringLine);
        for (int i = list.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list[j] > list[j + 1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
        stringLine = Arrays.toString(list);
        System.out.println(stringLine);
    }
}