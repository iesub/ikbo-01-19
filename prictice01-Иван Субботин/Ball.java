package ru.mirea.practice01;

public class Ball {
    private int radius;
    private String color;
    public Ball(int radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public String toString(){
        return("Ball's radius: " + radius + ". Ball's color: " + color + ".");
    }
}
