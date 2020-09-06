package ru.mirea.practice01;

public class Dog {

    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void getName(){
        System.out.println(name);
    }

    public void getBreed(){
        System.out.println(breed);
    }

    public String toString(){
        return ("Dog's name: " + name + ". Dog's radius: " + breed + ".");
    }
}
