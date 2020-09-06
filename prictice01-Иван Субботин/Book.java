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

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublishDate(String publishDate){
        this.publishDate = publishDate;
    }

    public void getName(){
        System.out.println(name);
    }

    public void getAuthor(){
        System.out.println(author);
    }

    public void getPublishDate(){
        System.out.println(publishDate);
    }

    public String toString(){
        return ("Book's title: " + name + ". Author: " + author + ". Publishing date: " + publishDate + ".");
    }
}
