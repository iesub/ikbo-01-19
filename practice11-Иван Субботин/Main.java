package ru.mirea.practice11;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule queue1 =  new ArrayQueueModule();
        queue1.enqueue(5);
        queue1.enqueue("String");
        queue1.enqueue(25);
        System.out.println(queue1.element());
        System.out.println(queue1.size());
        queue1.clear();
        System.out.println(queue1.isEmpty());
        queue1.enqueue(6);
        System.out.println(queue1.dequeue());
        ArrayQueue queue2 =  new ArrayQueue();
        ArrayQueue.enqueue(5);
        ArrayQueue.enqueue("String");
        ArrayQueue.enqueue(25);
        System.out.println(ArrayQueue.element());
        System.out.println(ArrayQueue.size());
        queue1.clear();
        System.out.println(ArrayQueue.isEmpty());
        queue1.enqueue(6);
        System.out.println(ArrayQueue.dequeue());
    }
}
