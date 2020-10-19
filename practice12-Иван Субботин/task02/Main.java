package ru.mirea.practice12.task02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку по заданию: ");
        String line = sc.nextLine();
        for (String word : line.split(",")){
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.print("Введите строку по заданию: ");
        line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line, ",.;-");
        while(st.hasMoreTokens()) System.out.print(st.nextToken() + " ");
    }
}
