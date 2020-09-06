package ru.mirea.lab03.task02;

public class task2check {
    public static void main(String[] args) {
        CardiganWelshKorgi class1 = new CardiganWelshKorgi("Newton", "Medium");
        System.out.println(class1 + " Breed: " + class1.getBreed());
        FinnishSpitz class2 = new FinnishSpitz("Evan", "Medium");
        System.out.println(class2 + " Breed: " + class2.getBreed());
    }
}
