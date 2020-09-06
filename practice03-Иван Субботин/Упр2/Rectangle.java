package ru.mirea.practice03.task02;

class Rectangle extends Shape {
    protected double width = 1;
    protected double length = 1;
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth(){
        return(width);
    }
    public double getLength(){
        return(length);
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        if (filled == true) {
            return (width*length);
        } else {
            return (0);
        }
    }
    public double getPerimeter(){
        return((2*width)+(2*length));
    }
    public String toString(){
        return("Color: " + color + " Is filled: " + filled + " Width: " + width + " Length: " + length);
    };
}
