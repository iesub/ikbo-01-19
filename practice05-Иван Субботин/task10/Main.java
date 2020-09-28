package ru.mirea.practice05.task10;

public class Main {
    public static int recursion(int n, int i) {
        if(n==0){
            return(i);
        } else{
            return(recursion( n/10, i*10 + n%10 ));
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(158, 0));
    }
}
