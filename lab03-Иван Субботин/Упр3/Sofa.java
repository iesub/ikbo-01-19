package ru.mirea.lab03.task03;

public class Sofa extends Furniture {
    public Sofa(String color, int price, int amount){
        this.setAmount(amount);
        this.setColor(color);
        this.setPrice(price);
    }
    public void showPage(){
        System.out.println("Get this sofa, made for extreme comfort now! For only " + this.getPrice() + "$" + "! Hurry up, only " + this.getAmount() + " sofas left!");
    }
}
