package ru.mirea.lab02.task02;

public class HumanTest {
    public static void main(String[] args){
        Human class1 = new Human(false, "round", 77, 37.5, 28, 74.5, 88);
        System.out.println(class1);
        class1.changeHead(true, "stretched");
        System.out.println(class1);
    }
}
