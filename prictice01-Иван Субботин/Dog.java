package ru.mirea.practice01;

public class Dog {
    private String name;
    private String breed;
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public String toString(){
        return ("Dos's name: " + name + ". Dog's radius: " + breed + ".");
    }
}
