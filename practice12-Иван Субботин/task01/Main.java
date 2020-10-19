package ru.mirea.practice12.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String surname = sc.nextLine();
        System.out.print("Введите Имя(0 если нет): ");
        String name = sc.nextLine();
        System.out.print("Введите Отчество(0 если нет): ");
        String patronymic = sc.nextLine();
        Person person;
        if (name.equals("0") & patronymic.equals("0")) person = new Person(surname);
        else if(patronymic.equals("0")) person = new Person(surname,name);
        else person = new Person(surname, name, patronymic);
        System.out.println(person.getSNP());
    }
}
