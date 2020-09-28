package ru.mirea.practice06.task02;

import ru.mirea.practice06.task01.Student;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        Student[] array = new Student[10];
        for (int i = 0; i < 10; i++) {
            Student element = new Student((int) (Math.random() * 50 + 1), Math.random() * 5);
            array[i] = element;
            System.out.print(" " + element);
        }
        Arrays.sort(array, comp);
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.print(" " + array[i]);
        }
    }
}
