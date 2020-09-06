package ru.mirea.lab01.task01;

public class task01 {
    public static void main(String[] args){
        int[] list = {1,9,3,4,5};
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum+=list[i];
        }
        System.out.println(sum);
        sum = 0;
        int i = 0;
        while (i != 5){
            sum+=list[i];
            i++;
        }
        System.out.println(sum);
        sum = 0;
        i = 0;
        do {
            sum+=list[i];
            i++;
        } while (i <= 4);
        System.out.println(sum);
    }
}
