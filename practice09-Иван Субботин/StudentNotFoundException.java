package ru.mirea.practice09;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
