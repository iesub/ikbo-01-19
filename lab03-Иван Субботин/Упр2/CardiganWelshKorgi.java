package ru.mirea.lab03.task02;

public class CardiganWelshKorgi extends Dog {
    public String breed = "CardiganWelshKorgi";
    public CardiganWelshKorgi(String name, String size){
        this.setName(name);
        this.setSize(size);
    }
    public String getBreed(){
        return breed;
    }
}
