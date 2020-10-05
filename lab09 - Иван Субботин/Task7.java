package ru.mirea.lab09;

import java.util.Scanner;

public class Task7 {
    public void getKey(){
        for (int i = 0; i < 2; i++) {
            Scanner myScanner = new Scanner(System.in);
            String key1 = myScanner.next();
            String key = "";
            try {
                if (i == 0) printDetails(key);
                else printDetails(key1);
            } catch (Exception e) {
                System.out.println("Введите правильную строку");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task7 obj = new Task7();
        obj.getKey();
    }
}
