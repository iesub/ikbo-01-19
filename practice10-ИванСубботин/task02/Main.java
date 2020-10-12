package ru.mirea.practice10.task02;

public class Main {
    public static void main(String[] args) {
        Chair chair;
        ChairFactory factory = new ChairFactory();
        chair = factory.createFunctionalChair();
        System.out.println(((FunctionalChair)chair).sum(3, 4));
        chair = factory.createMagicalChair();
        ((MagicalChair) chair).doMagic();
        chair = factory.createVictorianChair();
        System.out.println(((VictorianChair) chair).getAge());
    }
}
