package ru.mirea.lab09;

import java.util.Scanner;

public class Task6 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        String key1 = myScanner.next();
        String key = "";
        printDetails( key );
    }
    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println( message );
        }catch (Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task6 obj = new Task6();
        String line = "19";
        try {
            obj.getKey();
        } catch (Exception e){
            System.out.println("Ошибка ввода");
        }
    }
}
