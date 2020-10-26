package ru.mirea.lab16;

public class InternetOrdersManager implements OrderManager{
    private QueueNode head;
    private QueueNode tail;
    private int size;
    private int idCounter = 1;


    public boolean add(Order order) {
        if (head == null){
            ((InternetOrder)order).setId(idCounter);
            idCounter++;
            head = tail = new QueueNode();
            head.setValue(order);
            head.setNext(head);
            head.setPrev(head);
            size++;
        } else{
            ((InternetOrder)order).setId(idCounter);
            idCounter++;
            QueueNode buffer = new QueueNode();
            buffer.setValue(order);
            tail.setNext(buffer);
            buffer.setPrev(tail);
            buffer.setNext(head);
            tail = buffer;
            head.setPrev(tail);
            size++;
        }
        return true;
    }

    public boolean remove(Order order) {
        QueueNode buffer = head;
        for (int i = 0; i < size; i++){
            if (buffer.getValue() == order){
                buffer.getPrev().setNext(buffer.getNext());
                buffer.getNext().setPrev(buffer.getPrev());
                buffer = null;
                size--;
                break;
            }
            buffer = buffer.getNext();
        }
        return true;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        QueueNode buffer = head;
        for (int i = 0; i < size; i++){
            quantity+= buffer.getValue().itemQuantity(item);
            buffer = buffer.getNext();
        }
        return quantity;
    }

    public int itemsQuantity(String itemName) {
        int quantity = 0;
        QueueNode buffer = head;
        for (int i = 0; i < size; i++){
            quantity+= buffer.getValue().itemQuantity(itemName);
            buffer = buffer.getNext();
        }
        return quantity;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode buffer = head;
        for (int i = 0; i < size; i++){
            orders[i] = buffer.getValue();
            buffer = buffer.getNext();
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        QueueNode buffer = head;
        for (int i = 0; i < size; i++){
            cost += buffer.getValue().costTotal();
            buffer = buffer.getNext();
        }
        return cost;
    }

    @Override
    public int orderQuantity() {
        return size;
    }
}
