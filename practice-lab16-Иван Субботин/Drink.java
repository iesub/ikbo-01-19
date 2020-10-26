package ru.mirea.lab16;

public final class Drink implements Alcoholable, MenuItem{
    private int cost;
    private String name;
    private String description;
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink (int cost, String name, String description, DrinkTypeEnum type, double alcoholVol){
        this.cost = cost;
        this.description = description;
        this.name = name;
        this.type = type;
        this.alcoholVol = alcoholVol;
    }

    public Drink ( String name, String description, DrinkTypeEnum type, double alcoholVol){
        this.cost = 0;
        this.description = description;
        this.name = name;
        this.type = type;
        this.alcoholVol = alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return false;
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
        return "<html>Наименование: " + name + "<br>Цена: " + cost + "<br>Описание: " + description + "<br>Тип напитка: " + type
        + "<br>Содержание алкоголя: " + alcoholVol+"</html>";
    }
}
