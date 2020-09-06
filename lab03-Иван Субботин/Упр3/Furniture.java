package ru.mirea.lab03.task03;

public abstract class Furniture {
    private String color;
    private int price;
    private int amount;
    public String getColor(){
        return color;
    }
    public int getPrice(){
        return price;
    }
    public int getAmount(){
        return amount;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public abstract void showPage();

    @Override
    public String toString() {
        return "Furniture{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
