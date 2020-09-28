package ru.mirea.lab05;

import java.util.Scanner;

public class main { // Вариант 2
    public static void main(String[] args) {
        String path;
        Scanner sc = new Scanner(System.in);
        path = sc.nextLine();
        Image image = new Image(path);
        Window frame = new Window();
        frame.getContentPane().add(image);
    }
}
