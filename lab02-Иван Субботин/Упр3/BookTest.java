package ru.mirea.lab02.task03;

public class BookTest {
    public static void main(String[] args){
        Book class1 = new Book("The Hobbit", "J.R.R. Tolkien", "21.09.1937");
        System.out.println(class1);
        class1.setAuthor("Carl Sagan");
        class1.setName("Cosmos");
        class1.setPublishDate("1980");
        System.out.println(class1);
    }
}
