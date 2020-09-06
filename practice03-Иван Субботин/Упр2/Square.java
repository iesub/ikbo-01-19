package ru.mirea.practice03.task02;

class Square extends Rectangle{
    protected double side = 1;
    public Square(){}
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return(side);
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getArea(){
        if (filled == true) {
            return (Math.pow(side, 2));
        } else {
            return (0);
        }
    }
    public double getPerimeter(){
        return(4*side);
    }
    public String toString(){
        return("Color: " + color + " Is filled: " + filled + " Side: " + side);
    };
}
