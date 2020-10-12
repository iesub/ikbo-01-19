package ru.mirea.practice10.task01;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex number;
        number = factory.crateComplex(5,6);
        System.out.println(number.toString());
        number = factory.createComplex();
        System.out.println(number.toString());
    }
}
