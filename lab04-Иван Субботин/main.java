package ru.mirea.lab04;

public class main {
    public static void main(String[] args) {
        Priceable obj1 = new Tabletop("Monopoly");
        Priceable obj2 = new FlashDrive("Sony");
        obj1.getPrice();
        obj2.getPrice();
    }
}
