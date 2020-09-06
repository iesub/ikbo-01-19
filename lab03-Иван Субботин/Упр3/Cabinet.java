package ru.mirea.lab03.task03;

public class Cabinet extends Furniture {
    public Cabinet(String color, int price, int amount){
        this.setAmount(amount);
        this.setColor(color);
        this.setPrice(price);
    }
    public void showPage(){
        System.out.println("Extremely spacious, but yet compact, this cabinet will make an excellent addition to your room! " +
                "Take it now for just a " + this.getPrice() + "$" + "! Hurry up, only " + this.getAmount() + " cabinets left!");
    }
}
