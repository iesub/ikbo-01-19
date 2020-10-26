package ru.mirea.lab16;

public class QueueNode {
    private QueueNode next;
    private QueueNode prev;
    private Order value;

    public Order getValue() {
        return value;
    }

    public QueueNode getNext() {
        return next;
    }

    public QueueNode getPrev() {
        return prev;
    }

    public void setPrev(QueueNode prev) {
        this.prev = prev;
    }

    public void setValue(Order value) {
        this.value = value;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
