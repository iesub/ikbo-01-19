package ru.mirea.practice01;

public class Ball {

    private int radius;
    private String color;

    public Ball(int radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void getRadius(){
        System.out.println(radius);
    }

    public void getColor(){
        System.out.println(color);
    }

    public String toString(){
        return("Ball's radius: " + radius + ". Ball's color: " + color + ".");
    }
}
