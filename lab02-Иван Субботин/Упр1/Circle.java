package ru.mirea.lab02.task01;

public class Circle {
    private String color;
    private int radius;
    private boolean filled;
    public Circle(String color, int radius, boolean filled){
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public int getRadius(){
        return radius;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public void isFilled(boolean filled){
        this.filled = filled;
    }
    public String toString(){
        return("Color: " + color + " Radius: " + radius + " Filled: " + filled);
    }
}
