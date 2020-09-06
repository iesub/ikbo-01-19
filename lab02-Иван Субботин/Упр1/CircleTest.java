package ru.mirea.lab02.task01;

public class CircleTest {
    public static void main(String[] args){
        Circle class1 = new Circle("Blue", 5, true);
        System.out.println(class1);
        class1.setColor("Red");
        class1.setRadius(10);
        class1.isFilled(false);
        System.out.println(class1);
    }
}
