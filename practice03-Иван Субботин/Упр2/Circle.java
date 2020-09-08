package ru.mirea.practice03.task02;

public class Circle extends Shape {
    protected double radius = 1;
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return(radius);
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        if (filled == true) {
            return (Math.PI * Math.pow(radius, 2));
        } else {
            return (0);
        }
    }
    public double getPerimeter(){
        return(Math.PI * 2 * radius);
    }
    public String toString(){
        return("Color: " + color + " Is filled: " + filled + " Radius: " + radius);
    };
}
