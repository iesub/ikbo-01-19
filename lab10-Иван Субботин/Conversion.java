package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion<E> {
    private List<E> list = new ArrayList<>();
    public Conversion(E[] array) {
        list.addAll(Arrays.asList(array));
    }
    public void showList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public void add(E element) {
        list.add(element);
    }
    public E getElementById(int index){
        if (index > list.size()) System.out.println("Вы вышли за пределы списка");
        return(list.get(index));
    }
}
