package ru.mirea.lab09;

public class Task01 {
    public static void main(String[] args) {
        try{
            System.out.println( 2.0 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}
