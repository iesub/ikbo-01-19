package ru.mirea.lab01;

public class Lab01 {
    public static void main(String[] args){
        Dog class1 = new Dog("Dogmeat", "Korgi");
        Ball class2 = new Ball(2,"Blue");
        Book class3 = new Book("1984", "George Orwell", "08.06.1949");
        System.out.println(class1.toString());
        System.out.println(class2.toString());
        System.out.println(class3.toString());
    }
}
