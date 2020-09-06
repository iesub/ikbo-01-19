package ru.mirea.practice03.task05;

public class task5check {
    public static void main(String[] args){
        MovableRectangle class1 = new MovableRectangle(5,10,2,2,3, 3);
        System.out.println(class1);
        class1.moveDown();
        System.out.println(class1);
        class1.moveLeft();
        System.out.println(class1);
    }
}
