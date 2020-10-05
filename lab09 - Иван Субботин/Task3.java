package ru.mirea.lab09;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        int i;
        try {
            String intString = myScanner.next();
            i = Integer.parseInt(intString);
        }catch (Exception e){ // код не будет работать, т.к Exception перехватывает любую ошибку, а повторный перехват не имеет смысла
          System.out.println("Общая ошибка");
        } //catch (NumberFormatException e) {
            //System.out.println("Неверный формат ввода - введите int");
        //} catch(ArithmeticException e){
        //System.out.println("На ноль делить нельзя");
        //}
    }
}
