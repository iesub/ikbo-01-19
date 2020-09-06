package ru.mirea.practice02;

public class AuthorTest {

    public static void main(String[] args) {
       Author class1 = new Author("Bob", "bobby49@mail.com", 'm');
       System.out.println(class1.toString());
       class1.setEmail("bobmail@mail.com");
       System.out.println(class1.toString());
    }
}
