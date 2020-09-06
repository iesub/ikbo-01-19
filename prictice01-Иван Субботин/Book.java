package ru.mirea.practice01;

public class Book {
    private String name;
    private String author;
    private String publishDate;
    public Book(String name, String author, String publishDate){
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }
    public String toString(){
        return ("Book's title: " + name + ". Author: " + author + ". Publishing date: " + publishDate + ".");
    }
}
