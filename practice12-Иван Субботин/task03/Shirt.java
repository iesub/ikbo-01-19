package ru.mirea.practice12.task03;

public class Shirt {
    private String index;
    private String name;
    private String color;
    private String size;

    public Shirt(String goodInf){
        String[] buff = goodInf.split(",");
        index = buff[0];
        name = buff[1];
        color = buff[2];
        size = buff[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "index='" + index + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
