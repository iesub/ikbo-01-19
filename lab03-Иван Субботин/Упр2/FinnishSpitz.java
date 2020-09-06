package ru.mirea.lab03.task02;

public class FinnishSpitz extends Dog {
    public String breed = "FinnishSpitz";
    public FinnishSpitz(String name, String size){
        this.setName(name);
        this.setSize(size);
    }
    public String getBreed(){
        return breed;
    }
}
