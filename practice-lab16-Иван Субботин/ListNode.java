package ru.mirea.lab16;

public class ListNode {
    private ListNode next;
    private ListNode prev;
    private MenuItem value;

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setValue(MenuItem value) {
        this.value = value;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode getNext() {
        return next;
    }

    public MenuItem getValue() {
        return value;
    }

    public ListNode getPrev() {
        return prev;
    }
}
