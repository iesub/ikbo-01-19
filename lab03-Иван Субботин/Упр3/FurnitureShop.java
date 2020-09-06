package ru.mirea.lab03.task03;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args){
        Cabinet class1 = new Cabinet("Brown", 50, 146);
        Sofa class2 = new Sofa("White", 75, 79);
        System.out.println("Welcome to John's furniture shop! Choose a product from the list:");
        System.out.println("1-Cabinet");
        System.out.println("2-Sofa");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            if (number == 1){
                class1.showPage();
            } else {class2.showPage();}
        }
    }
}
