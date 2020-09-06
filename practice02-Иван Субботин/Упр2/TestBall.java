package ru.mirea.practice02;

public class TestBall {

    public static void main(String[] args) {
        Ball class1 = new Ball(26,30);
        System.out.println(class1);
        class1.setXY(15,15);
        System.out.println(class1);
        class1.move(40,40);
        System.out.println(class1);
    }
}
