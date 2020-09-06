package ru.mirea.lab03.task01;

public class task1check {
    public static void main(String[] args){
        Pan class1 = new Pan(5,10);
        Plate class2 = new Plate(10);
        System.out.println((class1.getName() + " Hight: " + class1.getHight() + " Radius: " + class1.getRadius()));
        System.out.println(class2.getName()+ " Radius: " + class2.getRadius());
    }
}
