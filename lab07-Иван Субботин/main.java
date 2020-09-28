package ru.mirea.lab07;

import java.util.LinkedList;

public class main { //Вариант 2
    public static void main(String[] args) {
        LinkedList<String> schedule = new LinkedList<String>();
        schedule.add("Math");
        schedule.add("Physics");
        schedule.addLast("IT");
        schedule.addFirst("Foreign language");
        System.out.println(schedule);
        schedule.removeFirst();
        schedule.set(1, "Physical education");
        System.out.println(schedule);
        System.out.println(schedule.getFirst());
    }
}
