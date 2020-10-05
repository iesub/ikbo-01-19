package ru.mirea.lab09;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        int i;
        try {
            String intString = myScanner.next();
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch(ArithmeticException e){
                System.out.println("На ноль делить нельзя");
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат ввода - введите int");
        }
    }
}
