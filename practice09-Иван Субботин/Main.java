package ru.mirea.practice09;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static int findStudent(Student[] array, String name) throws StudentNotFoundException {
        for(int i = 0; i < array.length; i++){
          String buff = array[i].getName();
          if (Objects.equals(buff, name)) return(array[i].getGrade());
        }
        throw new StudentNotFoundException("Данного студента нет в списке");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Какое количество студентов занести в массив: ");
        int n = Integer.parseInt(sc.nextLine());
        Student[] array = new Student[n];
        for (int i = 0; i < n; i++){
            System.out.print("Имя студента: ");
            String name = sc.nextLine();
            System.out.print("Оценка студента: ");
            int grade;
            try{
                grade = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                i--;
                System.out.println("Для ввода ценки используйте целочисленные значения. Повторите попытку");
                continue;
            }
            try {
                Student student = new Student(name, grade);
                array[i] = student;
            } catch (EmptyStringException e){
                i--;
                System.out.println("Введена пустая строка. Повторите попытку");
                continue;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
        while (true){
            System.out.print("Введите 1 чтобы отсортировать массив, 2 чтобы вывести оценку определенного студента, 0 чтобы прекратить работу программы: ");
            int option;
            try{
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Неверный формат ввода варианта");
                continue;
            }
            if (option == 1){
                SortingStudentByGPA comp = new SortingStudentByGPA();
                Arrays.sort(array,comp);
                for(int i = 0; i < n; i++){
                    System.out.println(array[i]);
                }
            } else if (option == 2){
                System.out.print("Введите имя искомого студента: ");
                String name = sc.nextLine();
                try {
                    int grade = findStudent(array, name);
                    System.out.println("Оценка " + name + ": " + grade);
                } catch (StudentNotFoundException e){
                    System.out.println("Такого студента нет в списке");
                }
            } else if(option == 0){
                break;
            } else System.out.println("Такой команды нет в списке");
        }
    }
}
