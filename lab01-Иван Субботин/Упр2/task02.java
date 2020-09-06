package ru.mirea.lab01.task02;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] result = line.toCharArray();
        for (int i = 0; i < line.length(); i++) System.out.println(result[i]);
    }
}
