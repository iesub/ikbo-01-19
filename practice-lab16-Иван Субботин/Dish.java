package ru.mirea.lab16;

public final class Dish implements MenuItem {
    private int cost;
    private String name;
    private String description;

    public Dish (int cost, String name, String description){
        this.cost = cost;
        this.description = description;
        this.name = name;
    }

    public Dish ( String name, String description){
        this.cost = 0;
        this.description = description;
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "<html>Наименование: " + name + "<br>Цена: " + cost + "<br>Описание: " + description + "</html>";
    }
}
