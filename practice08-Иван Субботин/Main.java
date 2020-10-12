package ru.mirea.practice08;

public class Main {
    public static void main(String[] args) {
        WaitList<Integer> boundedWaitList = new BoundedWaitList<>(5);
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        for (int i = 0; i < 6; i++){//Сообщит о том, что очередь заполнена
            boundedWaitList.add(i);
            unfairWaitList.add(i);
        }
        boundedWaitList.remove();
        System.out.println("BoundedWaitList contains 3: "+boundedWaitList.contains(3));
        unfairWaitList.remove(4);
        System.out.println("BoundedWaitList contains 4: "+unfairWaitList.contains(4));
        unfairWaitList.moveToBack(1);
        System.out.println("BoundedWaitList contains 1: "+unfairWaitList.contains(1));
    }
}
