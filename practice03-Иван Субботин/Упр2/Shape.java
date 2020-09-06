package ru.mirea.practice03.task02;

public abstract class Shape {
    protected String color = "white";
    protected boolean filled = false;
    public Shape(){};
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    };
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public String toString(){
        return("Color: " + color + " Is filled: " + filled);
    };
}
