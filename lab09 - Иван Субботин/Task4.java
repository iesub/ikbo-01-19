package ru.mirea.lab09;

import java.util.Scanner;

public class Task4 {
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
        } finally {
            System.out.println("Блок finally");// finally отработате в любом случае, есть ошибка или нет не важно
        }
    }
}
