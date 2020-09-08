package ru.mirea.practice03.task02;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        this.length = this.width = side;
    }
    public Square(double side, String color, boolean filled){
        this.length = this.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return(length);
    }
    public void setSide(double side){
        this.length = this.width = side;
    }
    public double getArea(){
        if (filled == true) {
            return (Math.pow(length, 2));
        } else {
            return (0);
        }
    }
    public double getPerimeter(){
        return(4*length);
    }
    public String toString(){
        return("Color: " + color + " Is filled: " + filled + " Side: " + length);
    };
}
