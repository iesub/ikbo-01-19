package ru.mirea.lab04;

public class Tabletop implements Priceable{
    private String name;
    public Tabletop(String name){
        this.name = name;
    }
    public void getPrice(){
        System.out.println("Price: 10$");
    }

    @Override
    public String toString() {
        return "Tabletop{" +
                "name='" + name + '\'' +
                '}';
    }
}
