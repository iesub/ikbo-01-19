package ru.mirea.lab03.task01;

public class Pan extends Dish{
    private String name = "Pan";
    private int radius;
    private int hight;
    public Pan(int radius, int hight){
        this.radius = radius;
        this.hight = hight;
    }
    public String getName(){
        return name;
    }
    public int getRadius(){
        return radius;
    }
    public int getHight(){
        return hight;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", hight=" + hight +
                '}';
    }
}
