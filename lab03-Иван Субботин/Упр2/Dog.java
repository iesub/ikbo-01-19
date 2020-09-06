package ru.mirea.lab03.task02;

public abstract class Dog {
    private String name;
    private String size;
    public String getName(){
        return name;
    }
    public String getSize(){
        return size;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSize(String size){
        this.size = size;
    }
    public abstract String getBreed();

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
