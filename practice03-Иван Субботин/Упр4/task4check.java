package ru.mirea.practice03.task04;

public class task4check {
    public static void main(String[] args){
        MovableCircle class1 = new MovableCircle(5,10,2,2,5);
        System.out.println(class1);
        class1.moveDown();
        System.out.println(class1);
        class1.moveLeft();
        System.out.println(class1);
    }
}
