package ru.mirea.lab03.task01;

public class Plate extends Dish {
    private String name = "Plate";
    private int radius;
    public Plate(int radius){
        this.radius = radius;
    }
    public String getName(){
        return name;
    }
    public int getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}
