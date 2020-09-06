package ru.mirea.lab01.task05;

public class task05 {
    public static void main(String[] args){
        int fact = 1;
        int steps = 10;
        for (int i = 1; i<steps+1;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
