package ru.mirea.practice12.task01;

public class Person {
    String name;
    String surname;
    String patronymic;

    public Person(String surname){
        this.surname = surname;
    }

    public Person(String surname, String name){
        this.surname = surname;
        this.name = name;
    }

    public Person(String surname, String name, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getSNP(){
        if(name == null & patronymic == null) return (surname);
        else if (patronymic == null) return (surname + " " + name.substring(0,1)+ ".");
        else return (surname + " " + name.substring(0)+"."+patronymic.substring(0,1));
    }
}
